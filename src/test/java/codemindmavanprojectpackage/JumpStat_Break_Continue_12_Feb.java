package codemindmavanprojectpackage;

class jumpstatement{
	void breakstatement() {
	   int x = 10;
	   while(x<=30) {
		   if(x==20)    //skip this value to print
		   {    
			   break;
		   }
		   System.out.println("Value of x : " + x);
		   x++;
	      // System.out.println("\n");
	  }
  }
	
	void continuestatement() {
		int x = 10;
		do {
			System.out.println("----------------------------------------------------------------------");
			x++;
			if(x==15)    //skip this value to print
			{
				continue ;
			}
			
			System.out.println("Value of x "+ x);
		}while(x<20);
		
	 }
 }

public class JumpStat_Break_Continue_12_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jumpstatement br = new jumpstatement();
		br.breakstatement();
		br.continuestatement();
		
	}

}
