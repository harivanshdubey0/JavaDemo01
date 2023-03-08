package myjavaproject;

public class FlowControl {

	public static void main(String[] args) {
		
		/*
		if (bollean condition)
		{
			//start inside if will get eecuted
		}
	//if condition is false then will skip to thenext statement
	 *
	 */
        //Larget amon 3 numbers 40 75 15

        int a = 140, b = 17, c = 150;
        //compare a with b and a with c
        // if both condition are true then a is larger

        if (a>=b && a>c)
        {
            System.out.println("Largest of 3 number is : " +a);
        }
        if (b>=a && b>=c)
        {
            System.out.println("Largest of 3 number is : " +b);
        }

        if (c>=a && c>=b)
        {
            System.out.println("Largest of 3 number is : " +c);
        }

	}

}
