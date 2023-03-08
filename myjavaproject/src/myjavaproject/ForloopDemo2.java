package myjavaproject;

public class ForloopDemo2 {

	public static void main(String[] args) {
		
        /*For (initialisation, codition, inarion)
        {
           <<Statement>>
        }*/
        int num;
        boolean isPrime;
        num = 10;
        //2,3, 5, 11, 13 prime numbers
        //4,6, 12, Non prime number
        if (num <2)
        isPrime=false;
        else
            isPrime = true;
        for(int i=2; i<num/i;i--)
        {
            if ((num % i==0))
            {
                isPrime=false;
                break;

            }
            if (isPrime){
                System.out.println("number is prime number");
            }
            else System.out.println("Number is not prime number");

        }
		

	}

}
