package com.kani.Corejava.application1;
enum Color{
	RED,GREEN,BLUE
}
enum News {
	 North,East,West,South
}
enum  AbcProducts {
	  Laptops,Desktops,Tabs;
	   
}
public class ColoursExamp {
	
	

	public static void main(String[] args) {
		Color c=Color.RED;
		System.out.println(c);
		
		News s=News.North;
		System.out.println(s);
		
		AbcProducts p=AbcProducts.Laptops;
		System.out.println(p);
		

	}

}