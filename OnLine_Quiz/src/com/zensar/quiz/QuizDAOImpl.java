package com.zensar.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.zensar.quiz.util.db.ConnectionFactory;


public class QuizDAOImpl implements QuizDAO {

	Connection con = null;
	private int count = 0, qlimit = 0, sublimit = 0;

	public QuizDAOImpl() {

		// connection to database using ConnectionFactory Class
		try {

			con = ConnectionFactory.getInstance().getConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void start(String subject) {
		Scanner read = new Scanner(System.in);

		PreparedStatement pstat = null;
		ResultSet rs = null;

		int qNo = 1;
		count = 0;

		// Setting the question limit variable...
		String sql = "SELECT COUNT(*) FROM " + subject;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			rs.next();
			qlimit = rs.getInt(1);

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		// Displaying the Questions 1 by 1...
		sql = "Select QUESTION,A,B,C,D,ANSWER FROM " + subject + " WHERE QId = ?";

		try {
			pstat = con.prepareStatement(sql);
			while (qNo <= qlimit) {
				pstat.setInt(1, qNo);

				rs = pstat.executeQuery();
				while (rs.next()) {

					System.out.println("\n\nQ. " + rs.getString("QUESTION"));
					System.out.println("A. " + rs.getString("A"));
					System.out.println("B. " + rs.getString("B"));
					System.out.println("C. " + rs.getString("C"));
					System.out.println("D. " + rs.getString("D"));
					break;
				}
				do{
				System.out.print("Enter Answer : ");
				String ans=read.next();
				
				if (ans.equalsIgnoreCase(rs.getString("ANSWER"))) {
					System.out.println("Answer is Correct...");
					count++;
					break;
				} else if(ans.equalsIgnoreCase("A") || ans.equalsIgnoreCase("B") || ans.equalsIgnoreCase("C") || ans.equalsIgnoreCase("D")) {
					System.out.println("Answer is wrong...");
					System.out.print("Correct Answer : " + rs.getString("ANSWER"));
					break;
				}else{
					System.out.println("Invalid Option...");
				}
				}while(true);

				qNo++;
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

	}

	@Override
	public String selectSubject() {

		int ch;
		String subject = null;
		Scanner read = new Scanner(System.in);

		PreparedStatement pstat = null;
		ResultSet rs = null;

		String sql = "Select * from subjects";

		System.out.println("Available Subjects : ");
		System.out.println("Id\tname");

		try {
			pstat = con.prepareStatement(sql);
			rs = pstat.executeQuery();
			while (rs.next()) {

				System.out.print("\n" + rs.getString("id") + "\t" + rs.getString("name"));
			}
			pstat.close();

			System.out.print("\nEnter choice : ");
			ch = read.nextInt();

			sql = "Select * from subjects WHERE id = ?";
			pstat = con.prepareStatement(sql);
			pstat.setInt(1, ch);
			rs = pstat.executeQuery();

			while (rs.next()) {

				subject = rs.getString("name");
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

		return subject;
	}

	// Displaying the number of correct answers and the percentage obtained

	@Override
	public void result() {
		System.out.println("\nResult Summary : ");
		System.out.println(count + " out of " + qlimit + " are correct");
		System.out.println("Percentage : " + 100 * count / qlimit + "%");

	}
}
