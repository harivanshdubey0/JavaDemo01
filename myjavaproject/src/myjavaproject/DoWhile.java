package myjavaproject;

import java.io.IOException;

public class DoWhile {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		// when conditon of expression evaluated  is false 
		//then  body of loop is not executed 
		// But some times it is required to execute body of loop atleast once
		//even if the condition is false 
		/*
     do 
     {
    	 <<Statements>>
     }while condition 
     
     */
		/*
		int num=-1;
	    do // eval (condition)==true)
	      {
	    	  // if condition is true , statement inside while loop is executed 
	    	  System.out.println("Welcome to Java programming :"+ num);
	    	  num--;
	      }while (num>0);
		*/
		char choice;
		System.out.println("Do did you learn today"); 
		do
		{
		System.out.println("1 .Condition statements"); 
		System.out.println("2 .Loops"); 
		System.out.println("3 .Push code to Remote repository");
		System.out.println("Choose one :");
		choice = (char)System.in.read();		
		System.out.println("Value of choice :"+ choice);
		} while (choice  <'1' || choice >'3');
		System.out.println("\n");
		switch (choice)
		{
		case '1':
			System.out.println("today we have learned Condition statements ");
			break;
		case '2':
			System.out.println("today we have learned Loops statements ");
			break;
		case '3':
			System.out.println("today we have learned Git statements ");
			break;
				
		}
		

	}

}
