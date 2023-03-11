package myjavaproject;

public class ConstructorsMinus {

    double a;
    double b;
    double c;
    ConstructorsMinus(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double MinusValue(){
        return a-b-c;

    }

}
class DemoMinus{
    public static void main(String[] args){
        double MinusValue;
        ConstructorsMinus minusActivity = new ConstructorsMinus(200,100,50);
        MinusValue = minusActivity.MinusValue();
        System.out.println("This is the value : "+MinusValue+"£");
    }

}
