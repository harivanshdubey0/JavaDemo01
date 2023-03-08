package myjavaproject;

public class overloadingDemo {

    void hello()
    {
        System.out.println("hello with no parameters ");

    }
    void hello(int a)
    {
        System.out.println("hello with 1 parameters " + a);
    }
    void hello(int a, int b)
    {
        System.out.println("hello with 2 parameters " +  a +","+b);
    }
	
} 

