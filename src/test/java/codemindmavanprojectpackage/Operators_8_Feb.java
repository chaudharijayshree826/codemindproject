package codemindmavanprojectpackage;

class Operators{
	int tax = 10;
	
	void prefixInc() {
		  System.out.println("Unary Operator:---");
		  System.out.println("\nPrefix Increment Tax value  :"+ (++tax));
	}
	
	void PostFixInc() {
		
		  System.out.println("\nBefore Increment of Tax value  :"+ (tax++));
		  System.out.println("\nafter Increment of tax Value   :" +tax );			
	}
	
	void ArithmeticOperators(){
		int mark1 =40, mark2= 20;
		  System.out.println("-----------------------------------------------------------------------");
		  System.out.println("\nArithmetic Operators :----");
		  System.out.println("\nAddition using + Operater: " + (mark1+mark2));
		  System.out.println("Substraction using - Operater: " + (mark1-mark2));
		  System.out.println("Multiplication using * Operater: " + mark1*mark2);
		  System.out.println("Division using / Operater: " + mark2/mark1);
		  System.out.println("Reminder using % Operater: " + mark2%mark1);
	}
	
	void RelationalOperator() {
        int Average = 10;
		
		if(Average < 11) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\nRelational Operator --");
			System.out.println("\nAverage is 'Less than 11' : "+ Average  + "  Average marks ");
		}
		
		if(Average <= 10) {
			System.out.println("\nAverage is 'Less than or equal to 10' : "+ Average  + "  Average marks ");
		}
		
		if(Average > 9) {
			System.out.println("\nAverage is 'Greater than 9' : "+  Average  + "  Average marks ");
		}
		
		if(Average >= 10) {
			System.out.println("\nAverage is 'Greater than or equal to 10' :"+  Average  + "  Average marks " );
		}
		
		if (Average == 10) {
			System.out.println("\nAverage is 'Is equal to 10' : "+  Average  + "  Average marks ");
		}
		
		if (Average != 11) {
			System.out.println("\nAverage is 'Is not equal to 11' :"+  Average  + "  Average marks ");
		}
	}
	
   void logicalOperater() {
		
		int a=10, b=20;
		
		if(a==10 && b==20) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\nLogical Operators :--");
			System.out.println("\nBoth conditions are True using && Operater");
		}
		
		if(a==10 || b==20) {
			System.out.println("Any one condition is True using || Operater");
		}	
	}
     void ternaryOperater() {
	      int a=20, b;	
	      b = a<30 ? 200 : 300;
	       System.out.println("-----------------------------------------------------------------------");
	       System.out.println("\nTernary Operater:---");
	       System.out.println("\nValue of b: " + b);
      } 

    void assignmentOperater() {
	
	     int a=10;
	     a+=10; 
	        System.out.println("-----------------------------------------------------------------------");
	        System.out.println("\nAssignment Operater:---");
	        System.out.println("Result of += : " + a);
     }
    

}

public class Operators_8_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Operators operator = new Operators();
		operator.prefixInc();
		operator.PostFixInc();
		operator.ArithmeticOperators();
		operator.RelationalOperator();
		operator.logicalOperater();
		operator.ternaryOperater();
		operator.assignmentOperater();
		
	}

}
