package codemindmavanprojectpackage;

class MethodType{
	int a =5;
	int b =10;
	int c ;	
	
	//WithOut Return Type, Without Argument
	void addition()    
	{
		c= a+b; 
		System.out.println("\nWithOut Return Type, WithOut Argument");
		System.out.println("Addition : " + c);
	}	
	
	//WithOut Return  Type, With Argument
	void substraction(int a , int b)
	{
		c= a-b;
		System.out.println("\nWithOut Return  Type, With Argument");
		System.out.println("Substraction : " + c);
	}	
	
	//With Return Type , Without Argument
	int multiplication()     
	{
		c= a*b;
		System.out.println("\nWith Return Type , Without Argument " );
		return c;
	}	
	
	//With Return Type , With Argument
	int division(int a, int b)
	{
		c= a/b;
		System.out.println("\nWith Return Type , With Argument " );
		return c;
	}	
	
}

public class MethodType_2_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodType m1 = new MethodType();     
	       m1.addition();
	       m1.substraction(30,20);
	       
	       int e = m1.multiplication();
	       System.out.println("Multiplication with Return type : " + e);
	       
	       int d= m1.division(20,5);
	       System.out.println("Divison with Return type : " + d);
	      
	}

}
