package com.kani.Corejava.interface1;

public class BookImpl implements Book{
	public void bookTitle() {
		System.out.println("CoreJava");
	}
	public void bookAuthor() {
		System.out.println("Oracle Corp");
	}
	public void bookPrice() {
		System.out.println("Rs.550");
	}
	public void show() {
		System.out.println("Local method,show");
	}

	public static void main(String[] args) {
		BookImpl book=new BookImpl();
		book.bookTitle();
		book.bookAuthor();
		book.bookPrice();
		book.show();
	}

}
