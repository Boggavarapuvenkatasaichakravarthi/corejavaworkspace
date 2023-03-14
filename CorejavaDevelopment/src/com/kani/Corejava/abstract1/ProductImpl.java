package com.kani.Corejava.abstract1;
abstract class Product{
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("All Products");
	
	}
}
public class ProductImpl extends Product {
	public void newProduct() 
	{
		System.out.println("Macpro2021m1");
	
	}
	public void show() {
		System.out.println("This is Local Method");
	}

	public static void main(String[] args) {
		
		//ProductImpl p1=new ProductImpl();
		Product p1=new ProductImpl();
		p1.allProducts();
		//p1.show();
		p1.newProduct();
		

	}

}
