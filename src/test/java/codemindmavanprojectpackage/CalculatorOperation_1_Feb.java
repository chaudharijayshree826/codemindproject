
package codemindmavanprojectpackage;


class Calculator {
	int a =5;
	int b =10;
	int c ;	
	
	void addition()    //Method with No return data type
	{
		c= a+b; 
		System.out.println("Addition : " + c);
	}	
	
	void substraction()
	{
		c= a-b;
		System.out.println("Substraction : " + c);
	}	
	
	int multiplication()    //Method with return data type as int 
	{
		c= a*b;
		System.out.println("Multiplication : " + c);
		return c;
	}	
	
	int division()
	{
		c= b/a;
		System.out.println("Division : " + c);
		return c;
	}	
	
}

public class CalculatorOperation_1_Feb {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator cal = new Calculator();     //first object 
       Calculator cal1 = new Calculator();   //Second object
       cal.addition();
       cal.substraction();
       cal1.multiplication();
       cal1.division();
      // int e = cal.multiplication();
      // System.out.println("return type"+e);
	}

}
