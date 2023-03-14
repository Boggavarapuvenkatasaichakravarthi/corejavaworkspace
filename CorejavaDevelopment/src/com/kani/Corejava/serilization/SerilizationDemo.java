package com.kani.Corejava.serilization;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class SerilizationDemo {
	public static void main(String[] args) {
		try {
			//FileOutputStream fos = new FileOutputStream("product.txt");
			FileOutputStream fos = new FileOutputStream("C://mydata/product.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Product p1 = new Product(1001, "Mouse", 450);
			Product p2 = new Product(1002, "Keyboard", 650);
			Product p3 = new Product(1003, "HDMI Cable", 1450);
			System.out.println("Writing object into the stream");
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
 