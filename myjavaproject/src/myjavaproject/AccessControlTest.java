package myjavaproject;

public class AccessControlTest {

	public static void main(String[] args) {
		
        AccessControlDemo object1 = new AccessControlDemo();
        object1.a =10;
        object1.b =20;
        object1.setC(30);
        System.out.println(object1.a);
        System.out.println(object1.b);
        System.out.println(object1.getc());
        // where a member of a class i pulblic then it is accessed by another code
        // if private then it cannot be accessed in other classes and sub classes
        // can be accessed b only members of its class.
        // Protected applies only when inheritance is involve do
		

	}

}
