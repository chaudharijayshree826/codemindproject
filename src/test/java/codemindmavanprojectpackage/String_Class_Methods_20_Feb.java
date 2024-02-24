package codemindmavanprojectpackage;

public class String_Class_Methods_20_Feb {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       //String Methods 
		
		String str = "Java String Methods";
		
		String str1 = "New java string methods ";
		
		// Returns the length of this string.
		System.out.println("\nlength() Method:-----");
		System.out.println("1)First String length : "+str.length());  //o/p---19
		System.out.println("2)Second String length : "+str1.length());  //o/p--24
		
		//CompareTo(string var)
		/*The String class compareTo() method compares values lexicographically and returns an integer value that describes 
		if first string is less than, equal to or greater than second string.*/
		System.out.println("\n3)CompareTo(string var) Method :-----");
		System.out.println("Compare First Str to Second Str1 : "+str1.compareTo(str)); //o/p---(-4)     //this method and compareToIgnoreCase(str1) both are same .
	   
		//CharAt(Index no.)
		/* Returns the char value at the specified index. An index ranges from 0 to
		  length() - 1.*/
		System.out.println("\n4)charAt(Index No.) Method:-----");
		char ch = str1.charAt(4);
		System.out.println("Character at 5th place is : "+ch);  //o/p--J
		
		//compareToIgnoreCase(string var)
		/* Compares two strings lexicographically, ignoring case differences. */
		System.out.println("\n5)compareToIgnoreCase(str1) Method:-----");
		System.out.println("Compares two strings ignoring Upper and lowercase :"+str.compareToIgnoreCase(str1)); //o/p-----(-4)
	
		// Concatenates the specified string to the end of this string.
	   System.out.println("\n6)concat(str1) Method:-----");
	   System.out.println("Join two Strings : "+str.concat(str1));
	   System.out.println("Join two String var str and string value : "+str.concat("....Method of String class"));
	
	   // Returns True/False if and only if this string contains the specified sequence of
	  // char values
	   System.out.println("\n7) contains(string) Method:-----");
	   System.out.println("1) Check is the given string (Pune)present in the str var : "+str.contains("pune"));
	   System.out.println("2) Check is the given string (Java String)present in the str var : "+str.contains("Java String"));
	   
	   //endsWith("String")
	   // Tests if this string ends with the specified suffix.
	    System.out.println("\n8) endsWith(String) Method:-----");
		System.out.println("Return true/False based on the end string : "+ str.endsWith("Methods"));
	
		
		/* Compares this string to the specified object. */
		System.out.println("\n9) equals Method:-----");
		System.out.println("Compare given string with  str var : "+str.equals("Welcome to codemind"));
	
		/*Compares this String to another String, ignoring case considerations*/
		System.out.println("\nequalsIgnoreCase(String value) Method:-----");
		System.out.println("Compares this String to another String "+str.equalsIgnoreCase("WELCOME TO Codemind"));

		
		System.out.println("\nindexOf(char) Method :-----");
		System.out.println("Index of Str 'r' : "+str.indexOf('r'));
		System.out.println("Index of Str 'g' : "+str1.indexOf('g'));
		
		
		// Returns true if, and only if, length() is 0.
		System.out.println("\nisEmpty() Method :----- ");
		System.out.println("str = Java String Methods : "+str.isEmpty());
		 String s3="";
		System.out.println("s3 = null : "+"".isEmpty());

		/* Returns a string whose value is this string, with all leading and trailing space removed*/
		System.out.println("\ntrim() Method:-----");
		System.out.println("     my name    is      ".trim());
		
		
		// Converts all of the characters in this String to upper case using the rules of the default locale
		System.out.println("\ntoUpperCase() Method:-----");
		System.out.println(str.toUpperCase());
		
		/*Converts all of the characters in this String to lower case using the rules of the default locale */
		System.out.println("\ntoLowerCase() Method:-----");
		System.out.println(str.toLowerCase());
		
		// Converts this string to a new character array.    String str = "Java String Methods";
		System.out.println("\n....................................toCharArray() Method:-----");
		char[] array = str.toCharArray(); // equals to split

		for (char abc : array) {
			System.out.println("\t"+abc);
			
		}
		
/*-----------------------------------------------------------------------------------------------------------------*/		
   //Tests if this string starts with the specified prefix.
	//startsWith("Welcome")
	System.out.println("\ns.startsWith(\"Welcome\")");
	String s ="Hello World!";
	System.out.println(s.startsWith("Welcome"));	
	
	//s.startsWith("W", 6)
	/* Tests if the substring of this string beginning at the specified index starts with the specified prefix.
	 */	
	System.out.println("\ns.startsWith(\"W\", 6) Start with the specified prefix and index");
	System.out.println("Start with the specified prefix and index : "+s.startsWith("W", 6));
	
	/*Returns a string resulting from replacing all occurrences of old Char in this string with new Char.*/	
	System.out.println("\n(s.replace('oldChar', 'NewChar')");
	System.out.println("Hello:  "+s.replace('H', 'h'));
	
	/*	  Replaces each substring of this string that matches the literal target
	  sequence with the specified literal replacement sequence.	 */
	System.out.println("\nreplace(CharSequence target," +"CharSequence replacement)");
	System.out.println(s.replace("Hello World", "Welcome to the Java World"));
		
	/*Replaces each substring of this string that matches the given regular expression with the given replacement.	 */	
	//regex - the regular expression to which this string is to be matched
	//replacement - the string to be substituted for each match
	System.out.println("\nreplaceAll(String regex," +"String replacement)");
	String abc="AbcD 123 @@@^###^&&&^% 567 PQr%";
	System.out.println(abc.replaceAll("[a-zA-Z0-9]", ""));  //o/p---  @@@^###^&&&^%  
	
	///replaceAll
	System.out.println("\n1) abc.replaceAll(\"[^0-9]\", \"\"))");
	System.out.println(abc.replaceAll("[^0-9]", "")); //o/p---123567
	
	System.out.println("\n2) abc.replaceAll(\"[^a-z]\", \"\")");
	System.out.println(abc.replaceAll("[^a-z]", ""));  //o/p---bcr
	
	System.out.println("\n3) replaceAll(\"[^A-Z]\", \"\")");
	System.out.println(abc.replaceAll("[^A-Z]", ""));  //o/p--ADPQ
	
	System.out.println("\n4) replaceAll(\"[0-9]\", \"\")");
	System.out.println(abc.replaceAll("[0-9]", ""));  //o/p--AbcD  @@@^###^&&&^%  PQr
	
	System.out.println("\n5) replaceAll(\"[^@#]\", \"\")");
	System.out.println(abc.replaceAll("[^@#%]", ""));  //o/p---@@@###
	
	System.out.println("\n6) replaceAll(\"[@#%^]\", \"1\")");
	System.out.println(abc.replaceAll("[@#%^]", "1"));	 //o/p----AbcD 123 11111111&&&11 567 PQr1
	 
	abc ="6789xyz";
	/*Replaces the first substring of this string that matches the given regular expression with the given replacement.*/
	System.out.println("\n7) abc.replaceFirst(\"[0-9]\", \"A\")");
	System.out.println("\t"+abc.replaceFirst("[0-9]", "A"));   //o/p----A789xyz
	
	// Splits this string around matches of the given regular expression.
    System.out.println("\n8) split(String regex--89)");
	String ar[]=abc.split("89");  //o/p67	xyz
    for(String ss :ar)
    {
    	System.out.println("\t"+ss);
    }
	System.out.println("....................................................................");
	
	System.out.println("\n9) abc.split(\"[0-9]\"");
	String ar1[] = abc.split("[0-9]");
	for(String sss :ar1)
	{
		System.out.println("....."+sss);
	}
	
	System.out.println("\n....................................................................");
	System.out.println("10)\n\"123123123123456\".split(\"2\", 5);");
	String ar2[] = "123123123123456".split("2", 5);
	for(String sss:ar2) {
	System.out.println(sss);
	}
	
	int no= 456;
	// Returns the string representation of the int argument.
    System.out.println("\n11) String.valueOf(var); find the length ");
	String a = String.valueOf(no);
    System.out.println(a.length());
 	
   // Returns the string representation of the string argument.
	System.out.println("\n12) String.valueOf(\"Dwe\")--the String  argument");
    String a1 =String.valueOf("Dwe");
	System.out.println(a1.length());
	
	// Returns the string representation of the float argument. .
    System.out.println("\n13) String.valueOf(10.225f) float argument.");
	String a2 = String.valueOf(10.225f);
    System.out.println(a2.length());
    
	
	}

	

}
