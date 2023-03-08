package myjavaproject;

public class Box2 {

    double width;// instance variable
    double hight;
    double depth;
    // This method was calling within the class values and printing so no need to return a value
    // Since the this method is calling a value from a different class This methods should return a value
    // it should not be a void but should be a data type and return value
    // so the new method shoujld be like this

    /*void volume() {
        System.out.println("Volume is : ");
        System.out.println(width * hight * depth);
    }*/
    // lets create another method to set the parameters
    // sets dimention of the box
//----------------------------------------
    // constructor initializes the objects immediately upon object creation
    //constructor is a special method which will have the same name as the class name, it will not have a retun type
    // method can have any name but constructor will have the same name as class name

//    Box2( double w, double h, double d)// local variables w, h and d
//    {
//        System.out.println("Creating a constructing//constructing a box");// this is a constructoer without parameter
//        width = w;// this print defined values for the variables
//        hight = h;
//        depth = d;
//        //purpose  of this is to refer current object
//        // means if the object is b1 it reffer to this object and if the object is b2 then it reffer to this object
//    }
    Box2( double width, double hight, double depth)// local variables w, h and d
    {
        System.out.println("Creating a constructing//constructing a box");// this is a constructoer without parameter
        this.width = width;// this print defined values for the variables
        this.hight = hight;
        this.depth = depth;
        //purpose  of this is to refer current object
        // means if the object is b1 it reffer to this object and if the object is b2 then it reffer to this object
        // if run this programe the value of instance variable is hidden by local variable
        //since my local variable and instance variable are using same name
        //by local variable is hiding data of instance variable
        // to over come this we use key word this
    }
    //
    double volume()// method and it is not setting any parameters
    {

        return width*hight*depth;
    }
//    void setDimentions(double w, double h,double d)// called parameters
//    {
//        width = w;
//        hight = h;
//        depth = d;
//        now that we have created a constructor we can remove this method as this is not needed
//    }

}
