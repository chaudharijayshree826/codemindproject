package codemindmavanprojectpackage;

public class RunTimeException_4_March {

	int a;
	int b;
	
	public RunTimeException_4_March(int  a, int b)
	{
		this.a = a ;
		this.b = b;
	}
	
	public int numberDivison()
	{   int d = 0;
		System.out.println("Before step performing division.");
		try  // Try block is used to write suspicious code OR code which may throw exception.
		{
		 d = a/b;
		}
		
		//catch(Exception e) {} //parent --if this block is here then it will give compilation error.
         //catch(NullPointerException e) {}//child exception class references 
	
		
		//catch(NumberFormatException e) {}//above NullpointerException and  this NumberFormatException are having same hierarchy so NOT give any error.
		
		//catch(Exception e) {} // multiple catch can possible 
		                   // this is the Parent Exception class
		
		/*catch(Throwable e)
		{   System.out.println("\nFrom Throwable --Grand Parent class");
			System.out.println("Pleae do not try to divide by zero(0).");
            //this also handle the exception , bocz is GrandParent class 
		}*/
		
		catch (ArithmeticException e)
		{
		   System.out.println("\nFrom Arithmetic exception -- Parent class");
		   System.out.println("Pleae do not try to divide by zero(0).");
		}
		
		finally {
			System.out.println("\nFrom Finally :--Alweays execute important code OR Clean up related code.");
		} // is should be at the end 
		System.out.println("\nDivision of  "+ a +" % "+ b +" = "+ d);
		return d;
	}
	public static void main(String[] args) {
		
		RunTimeException_4_March r = new RunTimeException_4_March(100, 0);
        System.out.println(r.numberDivison());
		
	}

}
