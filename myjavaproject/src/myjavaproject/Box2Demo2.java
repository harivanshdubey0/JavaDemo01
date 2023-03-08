package myjavaproject;

public class Box2Demo2 {

	public static void main(String[] args) {
		
        double volume;
        Box2 b1 = new Box2(10,20,15);


       /* b1.width = 10;
        b1.hight = 20;
        b1.depth = 15;*/

        // now that I have crated another method to set the value of the variables via parameters
        //I can call the second method and set the value of parameters
       // b1.setDimentions(10,20,15);
        volume= b1.volume();
        //type of data returned by the method should be compatible with the variable receiving the value
        System.out.println("Value of Voume :" +volume);


        Box2 b2;
        b2 = new Box2(15,5,16);
        /*b2.width = 15;
        b2.hight = 5;
        b2.depth = 16;*/
        // I can create a constructor to initialise values in the class I can create a constructor
        //b2.setDimentions(15,5,16);// passing value is called arguments
        volume= b2.volume();
        System.out.println("Value of Voume :" +volume);


        Box2 b3;
        b3 = b2;
        b2 = null;
        b3 = new Box2(10,10,10);

        volume=b3.volume();
        System.out.println("Value of Voume :" +volume);
        //every time i am initializing variables of class when object is created
        //java allow objects to initialize objects, when they are crated -- this is called constructor
        // with the help of constructor i can automatically assign some value to instance of variables at the time of creating objects
        // constructor initializes the objects immediately upon object creation
        //constructor is a special method which will have the same name as the class name, it will not have a retun type
        // method can have any neame but constructor will have the same name as class name

	}

}
