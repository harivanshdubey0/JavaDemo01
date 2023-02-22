package myjavaproject;

public class BankLoan { // Encapsulation
	// instance variables
	private String name;
	private int age;
	private double amount;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		if(age>=18 && age<=60)
		{
			this.age=age;
			
		}
		else
		{
			System.out.println("Not eligible for loan");
			
		}
		
	}
	public void setAmount(double amount)
	{
		this.amount=amount;
		
	}
	public String getName(String name)
	{
		return this.name;
		
	}
	public int getAge(int age)
	{
		return this.age;
		
	}
	public double getAmount(double amount)
	{
		return this.amount;
	}

	
}
