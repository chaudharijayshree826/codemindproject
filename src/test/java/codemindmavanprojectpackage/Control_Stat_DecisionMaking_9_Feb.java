package codemindmavanprojectpackage;

class DecisionMaking{
int math_marks = 10;
String cast = "Maratha_Kunbi";
	
	void ifStatement() {
		
		if (math_marks == 10 && cast == "Maratha_Kunbi") {
			System.out.println("\nCongratulation ! You will get the Reservation ");
			System.out.println("\nMarks of Math is :"+ math_marks +" and "+ " Cast is :" +cast);
		}
	}
	
     void IfElseStatement() {
		
		int precetage = 91;
		
		if (precetage < 90) {
			System.out.println("\nYou are pass.");
		} else {
			System.out.println("\nCongratulation ! You are in Distinction ");
		}		
	}
     
     void IfElseIfStatement() {
 		
 		int AccountMinBal = 100000;
 		
 		if (AccountMinBal < 1000) {
 			System.out.println("\nFine of Rs. 50 per Month");
 		} else if (AccountMinBal < 100000) {
 			System.out.println("\nCongratulation you will get Interest 2.5%");
 		} else if (AccountMinBal < 150000) {
 			System.out.println("\nCongratulation you will get Interest 3.5%");
 		} else if (AccountMinBal < 200000) {
 			System.out.println("\nCongratulation you will get Interest 4.5%");
 		} else {
 			System.out.println("\nCongratulation you will get Interest 5.5%");
 		}
 		
 	}
     
     void nestedIfStatement() {
    	 int age=25;    
    	 int weight=48;      
    	    
    	    if(age>=18){      
    	        if(weight>50){    
    	            System.out.println("\nYou are eligible to donate blood");    
    	        } 
    	        else
    	        {  
    	            System.out.println("\nYou are not eligible to donate blood");    
    	        }  
    	    } 
    	    else
    	    {  
    	      System.out.println("\nAge must be greater than 18");  
    	    } 
}
     
     void switchStatement() {
 		
 		String Operator = "+";
 		int a = 10;
 		int b = 20;
 		switch(Operator) {
 			
 			case "+":  System.out.println("\nAddition operation = " + (a+b));		            
 						  break;
 			  
 			case "-" : System.out.println("\nSubstraction operation = " + (a-b));
 			  			  break;
 			  			   
 			case "*" : System.out.println("\nMultiplication operation = " + (a*b));
 			  			  break;
 			
 			case "/" : System.out.println("\nDivision operation = " + (a/b));
 			  			  break;
 					  			  
 			default: System.out.println("No Operator selected !");
 		}
 		
 	}
     
}

public class Control_Stat_DecisionMaking_9_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionMaking dm = new DecisionMaking();
		dm.ifStatement();
		dm.IfElseStatement();
		dm.IfElseIfStatement();
		dm.nestedIfStatement();
		dm.switchStatement();
	}

}
