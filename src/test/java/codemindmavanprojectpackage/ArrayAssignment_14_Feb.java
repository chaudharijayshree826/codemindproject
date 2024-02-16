package codemindmavanprojectpackage;

public class ArrayAssignment_14_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Array Declaration
		 String name[]; //String [] name1;
		 
		//Array Declaration and Initialization with object
		 int num[] = new int[5];
		 
		 num[0]=1;  
		 num[1]=2;
		 num[2]=3;
		 num[3]=4;
		 num[4]=5;
		 
		 String days[]= {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		 
		 //Access single array element
		 System.out.println("\nShows only one particule array index value 4th place= "+num[4]);
		 System.out.println("Shows only one particule array index value 4th place= "+days[4]);
		 
		 //Array specific value Replacement
		 
		 days[4]="Weekend start";
		 System.out.println("\nReplace value at 4th plcae of array= "+days[4]);
		 
		 //array length
		 System.out.println("\nLength of days array= "+days.length);
		 
		 //for loop for accessing all array element.
		 System.out.println("\nPrint value using For Loop:---");
		 for(int i=0;i<num.length;i++)
		 { 
			System.out.println(num[i]); 
		 }
		 System.out.println("-------------------------------------------------------------------");
		 //for each loop accessing all array element
		 System.out.println("Print value using For Each Loop:---");
		 for(String d:days) {
			 System.out.println( d);
		 }
	}
}
