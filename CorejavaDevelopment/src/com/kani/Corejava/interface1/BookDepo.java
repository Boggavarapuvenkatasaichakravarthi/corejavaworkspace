package com.kani.Corejava.interface1;

public class BookDepo implements Book,NewBook {
	public void bookTitle() {
		System.out.println("CoreJava");
	}
	public void bookAuthor() {
		System.out.println("Oracle Corp");
	}
	public void bookPrice() {
		System.out.println("Rs.550");
	}
	public int myNewBook() {
		return 100;
	}
	public void display() {
		System.out.println("Local method,display");
	}
	
	public static void main(String[] args) {
		BookDepo book1=new BookDepo();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		int t=book1.myNewBook();
		System.out.println(t);
		book1.display();

	}

}
