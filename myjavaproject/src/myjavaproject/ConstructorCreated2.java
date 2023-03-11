package myjavaproject;

public class ConstructorCreated2 {

    double x;
    double y;
    ConstructorCreated2 (double x, double y){
        this.x=x;
        this.y=y;
    }
    double Divide(){
        return x/y;
    }

}
class DemoConstuctor3{
    public static void main(String[] args){

        ConstructorCreated2 activity = new ConstructorCreated2(100, 50);
        Double Divide;
        Divide = activity.Divide();
        System.out.println("this is the division total :" + Divide);
    }
}
