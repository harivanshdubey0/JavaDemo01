package myjavaproject;

public class Box1 {

//  use class keyword to declare a class

	double width; // instance variables 

	double height; // instance variables 

	double depth;// instance variables 

	

	Box1(double w,double h ,double d)

	{

		System.out.println("Constructing a box");

		width=w;

		height=h;

		depth=d;

	}

	

	double  volume()

	{

				

	 return width * height * depth;

		

	}


}
