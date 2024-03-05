package codemindmavanprojectpackage;

public class AbstractClassExample_28_Feb {
	public static void main(String [] args)
	{
		//we cannot create object of abstract class.
		//new test();
		Impl i = new Impl(10);
		i.add(10, 20); //when we go to this method implementation then we navigate to ..17 line no. code.
		i.sub(20, 30);
	}

}

abstract class test{  //abstract class can be by default default 
	
public abstract void add(int a, int b);   //abstract method 

public void sub(int num1, int num2)  //NON-Abstract method
{ 
 System.out.println(num1 - num2);	
}

public test(int c) { //Parameterized constructors 
 }   
} 

//how to use abstract class
class Impl extends test{   //child class
	public Impl(int a ) { //call the constructor explicitly
		super(a); //test class constructor called here.
		         //super keyword represent parent class constructors
	}

	@Override//we have to write the body of the abstracted method
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
}





