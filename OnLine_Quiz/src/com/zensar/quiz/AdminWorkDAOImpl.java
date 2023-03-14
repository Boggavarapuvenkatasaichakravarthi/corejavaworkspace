package com.zensar.quiz;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.zensar.quiz.util.db.ConnectionFactory;

public class AdminWorkDAOImpl implements AdminWorkDAO {

	Connection con = null;

	public AdminWorkDAOImpl() {

		try {

			con = ConnectionFactory.getInstance().getConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String selectSubject() {
		int ch;
		String subject = null;
		Scanner read = new Scanner(System.in);

		PreparedStatement pstat = null;
		ResultSet rs = null;
		String sql = "Select * from subjects";

		System.out.println("Subjects : ");
		System.out.println("subjectId\tname");

		try {
			pstat = con.prepareStatement(sql);
			rs = pstat.executeQuery();
			while (rs.next()) {

				System.out.print("\n" + rs.getString("id") + "\t" + rs.getString("name"));
			}
			pstat.close();

			System.out.print("\nenter choice : ");
			ch = read.nextInt();

			sql = "Select * from subjects WHERE id = ?";
			pstat = con.prepareStatement(sql);
			pstat.setInt(1, ch);
			rs = pstat.executeQuery();

			rs.next();
			subject = rs.getString("name");

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

		return subject;

	}

	// The Admin adds Questions to the Test

	@Override
	public void addQuestion(String subject) {

		PreparedStatement pstat = null;
		ResultSet rs = null;
		boolean b1 = false;

		Scanner read = new Scanner(System.in);

		String sql = "INSERT INTO " + subject + "(QUESTION, A, B, C, D, ANSWER) VALUES (?,?,?,?,?,?)";

		try {
			pstat = con.prepareStatement(sql);
			// pstat.setString(1, subject);
			System.out.print("Enter Question : ");
			pstat.setString(1, read.nextLine());
			System.out.println("Enter the options : ");
			System.out.print("A : ");
			pstat.setString(2, read.nextLine());
			System.out.print("B : ");
			pstat.setString(3, read.nextLine());
			System.out.print("C : ");
			pstat.setString(4, read.nextLine());
			System.out.print("D : ");
			pstat.setString(5, read.nextLine());
			System.out.print("Enter the Correct Answer : ");
			pstat.setString(6, read.nextLine());

			pstat.executeUpdate();

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

	// Showing the user logs
	@Override
	public void showLogs() {

		try (FileInputStream file = new FileInputStream("logs.txt");
				DataInputStream in = new DataInputStream(file)) {

			while (in.available() > 0) {
				System.out.println(in.readUTF());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void displayMenu() {
		Scanner read = new Scanner(System.in);
		System.out.println("\n***** Admin *******");
		System.out.println("1. Add Question");
		System.out.println("2. Show Logs");
		System.out.println("3. Logout");
		int ch = read.nextInt();

		switch (ch) {

		case 1:
			addQuestion(selectSubject());
			break;
		case 2:
			showLogs();
			break;
		case 3:
			return;
		default:
			System.out.println("Invalid choice...");
			break;

		}

	}
}
