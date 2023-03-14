package com.kani.Corejava.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerilizationDemo {
	public static void main(String[] args) {
		try {
			 
			//FileInputStream fis = new FileInputStream("product.txt");
			FileInputStream fis = new FileInputStream("C://mydata/product.txt");
			System.out.println("Reading object from the stream");
			try {
				Product p;
				ObjectInputStream ois = new ObjectInputStream(fis);
				while ((p = (Product) ois.readObject()) != null) {
					System.out.println(p);
				}
			} catch (Exception e) {
				System.out.println("End of the file");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}