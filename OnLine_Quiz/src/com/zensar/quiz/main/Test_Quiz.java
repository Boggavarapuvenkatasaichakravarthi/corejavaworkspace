package com.zensar.quiz.main;

import java.util.Scanner;

import com.zensar.quiz.AdminWorkDAOImpl;
import com.zensar.quiz.QuizDAOImpl;
import com.zensar.quiz.UserDAOImpl;
import com.zensar.quiz.dao.LoginDAOImpl;
import com.zensar.quiz.to.Login;

public class Test_Quiz {

	public static void main(String[] args) {

		Login login = new Login();

		LoginDAOImpl logindao = new LoginDAOImpl();

		QuizDAOImpl quiz = new QuizDAOImpl();

		AdminWorkDAOImpl admin = new AdminWorkDAOImpl();

		UserDAOImpl user = new UserDAOImpl();

		int ch = 0;
		String ans = null;
		Scanner read = new Scanner(System.in);
		do {
			System.out.println("***** Home Page *******");
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("3. Exit");
			System.out.print("Enter choice : ");
			ch = read.nextInt();

			switch (ch) {

			case 1:
				System.out.print("Enter username : ");
				login.setUserName(read.next());
				System.out.print("Enter password : ");
				login.setPassword(read.next());
				login.setPrivilege("admin");
				if (logindao.authenticate(login))

					do {
						admin.displayMenu();
						System.out.print("Do you want to logout (y/n) : ");
						ans = read.next();
					} while (!ans.equalsIgnoreCase("y"));
				else
					System.out.println("The credentials you supplied were not correct...");
				break;
			case 2:

				user.userMenu();
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid choice...");

			}
		} while (true);
	}

}
