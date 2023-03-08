package myjavaproject;

public class Box3Constuctor {

    double width;// instance variable
    double hight;
    double depth;

Box3Constuctor( double width, double hight, double depth)// local variables w, h and d
    {
        System.out.println("Creating a constructing//constructing a box");// this is a constructor without parameter
        this.width = width;// this print defined values for the variables
        this.hight = hight;
        this.depth = depth;
    }
    double volume()// method and it is not setting any parameters
    {
        return width*hight*depth;
    }
}
class Box3Demo3 {
public static void main(String[] args) {

    double volume;
    Box3Constuctor b1 = new Box3Constuctor(10,20,15);
    volume= b1.volume();
    System.out.println("Value of Voume :" +volume);

    Box3Constuctor b2 = new Box3Constuctor(15,5,16);
    volume= b2.volume();
    System.out.println("Value of Voume :" +volume);


    Box3Constuctor b3;
    b3 = b2;
    b2 = null;
    b3 = new Box3Constuctor(10,10,10);

    volume=b3.volume();
    System.out.println("Value of Voume :" +volume);
}

}
