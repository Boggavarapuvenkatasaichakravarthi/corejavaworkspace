package com.zensar.quiz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.zensar.quiz.dao.LoginDAOImpl;
import com.zensar.quiz.to.Login;
import com.zensar.quiz.util.db.ConnectionFactory;

public class UserDAOImpl implements UserDAO {

	Connection con = null;

	public UserDAOImpl() {

		// connection to database using ConnectionFactory Class
		try {

			con = ConnectionFactory.getInstance().getConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void listSubject() {

	}

	@Override
	public void selectSubject() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userMenu() {
		Scanner read = new Scanner(System.in);

		int ch = 0;
		String ans = null;

		Login login = new Login();
		LoginDAOImpl loginDao = new LoginDAOImpl();
		QuizDAOImpl quiz = new QuizDAOImpl();
		do {
			System.out.println("\n***** User *******");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Back to Home Page");
			System.out.print("Enter choice : ");
			ch = read.nextInt();

			switch (ch) {

			case 1:
				System.out.print("Enter username : ");
				login.setUserName(read.next());
				System.out.print("Enter password : ");
				login.setPassword(read.next());
				login.setPrivilege("user");
				if (loginDao.authenticate(login)) {
					do {
						quiz.start(quiz.selectSubject());
						quiz.result();
						System.out.print("Do you want to logout (y/n) : ");
						ans = read.next();
					} while (!ans.equalsIgnoreCase("y"));
				} else
					System.out.println("The credentials you supplied were not correct...");

				break;
			case 2:
				System.out.print("Enter username : ");
				login.setUserName(read.next());
				System.out.print("Enter password : ");
				login.setPassword(read.next());
				login.setPrivilege("user");
				loginDao.add(login);
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid choice...");
			}
		} while (true);

	}

}
