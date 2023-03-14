package com.ram.maincontroller;
import com.ram.services.BookService;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import com.ram.services.BookService;

public class MainController
{
public static void main(String[] args) 
{
	int bookId=0;
	String title="";
	float price=0;
	int ch,ch1=1;
	Scanner s=new Scanner(System.in);
	BookService bookService = new BookService();
	while(ch1!=0)
	{
		
		System.out.println("1.Insert  New Record");
		System.out.println("2.View All Records");
		System.out.println("3.Delete");
		System.out.println("Enter your choice :");
		ch=s.nextInt();
		switch(ch)
			{
			case 1:
				System.out.println("Enter Book BooId");
				bookId = s.nextInt();
				System.out.println("Enter Book Titile");
				title = s.next();	
				System.out.println("Enter Book price");
				price = s.nextFloat();
				int updateCount = bookService.addBookService(bookId, title, price);	
				System.out.println("inserted "+updateCount+" record   Success");
				break;
			case 2:
				try
					{
					ArrayList a =bookService.getBookDetailsById();
					
					ListIterator li=a.listIterator();
					while(li.hasNext())
						{
						System.out.println(li.next());

						}
					}catch(Exception e){e.printStackTrace();}
					break;
			case 3:
				try
					{	
					System.out.println("Enter the bookid whose record you want to delete:");
					int b=s.nextInt();
					int a =bookService.deleterow(b);
					System.out.println("deleted successfully :"+a);
					}catch(Exception e){e.printStackTrace();}
			default:
					System.out.println("Wrong Choice");
					break;
			
			}
		System.out.println("Enter 1 for Doing More Operation and 0 for Exit :");
		ch1=s.nextInt();
		}
		
		
}}

