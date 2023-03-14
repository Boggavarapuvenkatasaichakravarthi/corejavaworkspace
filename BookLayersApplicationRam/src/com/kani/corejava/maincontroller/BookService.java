package com.kani.corejava.maincontroller;

public class BookService {
	String grade;
                              //    100         java          250
	 public int addBookService(int bookId,String title,double price) throws ClassNotFoundException {
		 System.out.println("Book Serivce Layer - 2");
		   System.out.println(bookId+title+price+grade);
		 
		   if(price<=300)		   {
			      grade="C";
		   }
		  else if(price<=600) {
				   grade="B";
			   }
		  else {
				   grade="A";
		   }
		   System.out.println("Grade:"+grade);
		   // Adding data to BookBean
		   BookBean bookBean = new BookBean();
		       bookBean.setBookId(bookId);  //100
		       bookBean.setTitle(title);  //java
		       bookBean.setPrice(price);  //250
		       bookBean.setGrade(grade);  //c
		   
		    //Sending data to BookDAO
		       
		       BookDAO bookDAO=new BookDAO();  //HAS-A
		    int k=   bookDAO.addBook(bookBean);
		       
		   return k;

	 }
	
}
