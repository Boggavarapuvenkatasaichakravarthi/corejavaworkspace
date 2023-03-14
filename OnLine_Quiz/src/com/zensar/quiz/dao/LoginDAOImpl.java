package com.zensar.quiz.dao;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.zensar.quiz.to.Login;
import com.zensar.quiz.util.db.ConnectionFactory;

public class LoginDAOImpl implements LoginDAO {

	Connection con = null;

	public LoginDAOImpl() {

		try {

			con = ConnectionFactory.getInstance().getConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void add(Login login) {
		PreparedStatement pstat = null;
		ResultSet rs = null;
		boolean b1 = false;

		String sql = "SELECT * FROM Login WHERE username=?";

		try {
			pstat = con.prepareStatement(sql);
			pstat.setString(1, login.getUserName());
			pstat.executeQuery();
			rs = pstat.executeQuery();

			if (!rs.next()) {

				int rows = -1;
				sql = "INSERT INTO login VALUES(? ,? ,?)";

				pstat = con.prepareStatement(sql);
				pstat.setString(1, login.getUserName());
				pstat.setString(2, login.getPassword());
				pstat.setString(3, login.getPrivilege());
				rows = pstat.executeUpdate();
				System.out.println("Registered Successfully...");
			} else {

				System.out.println("User already Exist...");
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		} finally {
			try {
				if (pstat != null)
					pstat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public boolean authenticate(Login login) {

		Boolean b1 = false;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM Login WHERE username=?";
		try {
			pstat = con.prepareStatement(sql);
			pstat.setString(1, login.getUserName());
			rs = pstat.executeQuery();
			while (rs.next()) {

				if (login.getPassword().equals(rs.getString("PASSWORD"))
						&& login.getPrivilege().equals(rs.getString("PRIVILEGE"))) {
					b1 = true;

					System.out.println("Login Successful...");

					updateLog(rs.getString("USERNAME"));
				}

				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstat != null)
					pstat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return b1;
	}

	@Override
	public void updateLog(String userName) {

		Date date = new Date(0);

		try (FileOutputStream fileout = new FileOutputStream("logs.txt", true); // will append data to the end of the file...
				DataOutputStream out = new DataOutputStream(fileout)) {

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			out.writeUTF(userName + "\t" + timestamp);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	
}
