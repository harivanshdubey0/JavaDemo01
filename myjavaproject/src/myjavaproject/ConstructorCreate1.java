package myjavaproject;

public class ConstructorCreate1 {

    int a;
    int b;
    int c;
    ConstructorCreate1(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int Total()
    {
        System.out.println("Constructor starts and take the values from the argument of object");
        return a+b+c;
    }

}
class DemoConstructor {// this file can be created or should b created in anothedr class independent of constructor
    public static void main(String[] args) {
        ConstructorCreate1 multiply = new ConstructorCreate1(2,2,2);
        int Total;
        Total = multiply.Total();
        System.out.println("The total after adding is :" + Total);
    }
}
