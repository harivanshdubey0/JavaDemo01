package myjavaproject;

public class InheritanceC extends InheritanceA {

    int i;

    // B extends A and C extends B== Can access variables from A as well. but first B will be checked for values and then A

    public InheritanceC (int a, int b)
    {
        super.i=a;
        i=b;
    }
    /*
    Super: super keyworkd is reference variable whihch is used to refer immediate parent class object.
     Supper cna be used to refer immediate parents calls instance variable.
     Super can be used to invoke immediate parent class method
     super() can be used to invoke immediate parent class constructor
     */
    void showi(){
        System.out.println("value of in parent" + super.i);
        System.out.println("value of in and j " + super.i);
    }

}
