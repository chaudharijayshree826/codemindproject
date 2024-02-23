package codemindmavanprojectpackage;

public class OccurrenceOfChar_CountString_22_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("\nProgram to Count the Occurrences of Each Character : ");
		String to = "Welcome to the java world!!!!!";
		System.out.println("\t"+to);
		int count =0;
		
		for(int i=0;i<to.length();i++) 
		  {		
			count=0;
			for(int j=0; j<to.length();j++)
			{
				if(i>j && to.charAt(i)==to.charAt(j))
				break;
				
				if(to.charAt(i) == to.charAt(j))
					count++;
			}
			if(count !=0)
				System.out.print(to.charAt(i) +":" +count+" , ");
		} 
	}
}
