package codemindmavanprojectpackage;
   class student{
        int rollNo;  //instance member variables
        String name;
        student(int rollNo, String name)
        {   this.rollNo = rollNo;  //rollNo = rollNo;
        	this.name = name;     }
        void display()
        {
           System.out.println("\nThis form the calling instance member variable.");
	       System.out.println("RollNo: "+  rollNo +"  Name: "+  name);
        }      
} 
   class teacher{
	     String Tech_name ;
	     String subject ;
	     int class1;
	     
	     //Constructor Chaining  //default Constructor
	   public teacher() {
	    	 this("JC","IT",10); //this and super are not called for constructor at  time .
	    	 System.out.println("\nDefault Constructor.");
	     }
	    
	     //Parameterized construct
	   public teacher(String Tech_name,String subject,int class1)
	     { 
		     this(23.500f);
		  // System.out.println(Tech_name,subject,class1);this line give compile time error
		    System.out.println("\nPrint value from parametreised constructor:");
	    	System.out.println(Tech_name);
	    	System.out.println(subject);
	    	System.out.println(class1);
	     }
	   
	   public teacher (float fees)
	   {   System.out.println("\nPrint the value from last constructor using 'this' keyword at first. ");
		   System.out.println(fees);
	   }
	    public void display()
	    {
	    	int class1=20;
	    	System.out.println(class1 + this.class1);
	    }
   }
public class This_Keyword {
	public static void main(String[] args) {
		
		student s = new student(10, "JC");
		s.display();
		
		teacher t = new teacher();
		t.display();
		
	}

}
