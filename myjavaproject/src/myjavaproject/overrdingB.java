package myjavaproject;

public class overrdingB extends overrdingA {

	int k;
	overrdingB(int a,int b ,int c)
	{
		super(a,b);
		k=c;

	}


	void show()
	{   super.show();
		System.out.println("k :"+ k);
	}
}
