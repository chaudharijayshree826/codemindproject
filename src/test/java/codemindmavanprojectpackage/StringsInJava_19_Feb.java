package codemindmavanprojectpackage;

public class StringsInJava_19_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //String using string literal
		
		String str = "CodeMind";
		System.out.println("String value using first String Literal  : "+str);
		System.out.println("\nHasCode for first String : "+str.hashCode());

	
		String  str1="Technology";
		System.out.println("\nString value using Second String Literal : "+str1);
			
		//str = str3 
		String str3="CodeMind";
		System.out.println("\nString value using Third String Literal : "+str3);
		System.out.println("\nHasCode for Third String : "+str3.hashCode());
	
       //String using new keyword
		String str4 = new String("CoreJava");
		System.out.println("\nString using new keyword : "+ str4);
		
	  //Immutable String 
		String PanNo = "CXPj00012";
		System.out.println("\nOriginal String Value : "+PanNo);
		String Pan2 = PanNo.concat("XYZ");
		System.out.println("\nConcatinated XYZ to String value : "+Pan2);	
	}	

}
