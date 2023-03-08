package myjavaproject;

public class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
	public class accessSpecifiers4 {

		public static void main(String[] args) {
			
			pubaccessspecifiers obj = new pubaccessspecifiers(); 
	        obj.display();  
			
		}
	}


}
