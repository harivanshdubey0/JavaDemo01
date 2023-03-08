package myjavaproject;

public class InheritanceDemo {

    public static void main(String[] args) {

        InheritanceA parent = new InheritanceA();
        InheritanceB child = new InheritanceB();
        InheritanceC child2 = new InheritanceC(10,20);
        /*
        parent.i = 10;
        parent.j= 2;
        parent.showij();
        child.i = 40;
        child.j = 30;
        child.k=30;
        child.showij();
        child.showk();
        */
         child2.showi();
    }

}
