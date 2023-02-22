package myjavaproject;

public class BoxDemo {

	public static void main(String[] args) {
		
		double volume ;

		 

		Box1 b1 = new Box1(10,5 ,3); // constructor for a class is called automatically when object is created 

		volume = b1.volume();

		System.out.println("Volume is " + volume);

	 

		Box1 b2 = new Box1(12,4,6);

		volume = b2.volume(); // volume of object b2

		System.out.println("Volume is " + volume);

	}

}
