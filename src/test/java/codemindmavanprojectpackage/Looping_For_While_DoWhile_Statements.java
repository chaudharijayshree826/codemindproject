package codemindmavanprojectpackage;
class While_DO_While
{
//1.Print a Even-Odd number program using While Loop (1 to 10)
	void Odd_Even() 
	{
	int a = 1;	
	while(a<=10)
	{
		if(a%2==0)
	  {
		System.out.println("Even Number using While:--- "+a);
		a++;
	  }
		if(a%2 !=0)
		{
			System.out.println("Odd Number  using While: "+a);
		}
		a++;
	}
}	
//2. Print number's in reverse order 10 to 1 using While loop

	  void reverseWhile() {
		  int b = 10;
		  System.out.println("------------------------------------------------------------");
		  while (b>=1)
		  {
			  System.out.println("Reverse Number using While  " + b);			  
			  b--;
		  }
	  }
	  
//3. Print a Even-Odd number program using Do-While Loop (1 to 10)
     void odd_even_dowhile() {
    	 int j=1;
    	 System.out.println("-------------------------------");
    	 do {
    		 if(j%2==0)
   		  {
   			System.out.println("Even Number using Do_While:--- "+j);
   			j++;
   		  }
   			if(j%2 !=0)
   			{
   				System.out.println("Odd Number using Do_While: "+j);
   			}
    		 j++;
    	 }
    	 while (j<=10);    		
     }	  
//4. Print number's in reverse order 10 to 1 using Do-While loop
	 void reverse_do_while()
	 {
		 int p = 10;
		 System.out.println("------------------------------------------------------------");
		 do {
			
			 System.out.println("Reserve No. using Do_while  " +p);
			 p--;
			 
		 }while(p>=1);
	 }
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 /* void whileLoop() { //just for more knowledge.		
			// Print 1 to 10
			int i=1;
			while(i<=10) {
				System.out.println("\nValue of I: "+ i);
				i++;	}		}*/
}

public class Looping_For_While_DoWhile_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		While_DO_While eo = new While_DO_While();
		 eo.Odd_Even();
		 eo.reverseWhile();
		eo.odd_even_dowhile();
		eo.reverse_do_while();
		//eo.whileLoop(); //just for more knowledge.	
		
	}


}