package codemindmavanprojectpackage;

public class StringPrograms_21_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Reverse a given string 
		String str1 = "Hello World!";
		String str2 ="";
		System.out.println("1) Reverse a given string");
		for(int i =(str1.length()-1);i>=0;i--) {
			str2 = str2+str1.charAt(i);
			System.out.print(str1.charAt(i));  //o/p----!dlroW olleH
		}
		
		System.out.println("\n.............................................................................................");

		//System.out.println(str2);
		
		//Word reverse
		System.out.println("\n2) Word reverse");
		String arr[]= str1.split(" ");
		String str3 = "";
		for(String print :arr) {
			for(int i=(print.length()-1) ;i>=0 ;i--) {
				str3 = str3+print.charAt(i);
			}
			str3 = str3+" ";
		}
		System.out.println("\n Word reverse: "+str3.trim());  //o/p-----olleH !dlroW
	    System.out.println(".............................................................................................");
		
	    // find only digits and do addition of digits
	    System.out.println("\n3) find only digits and do addition of digits");
		String charnum ="abc12345";
		String num = charnum.replaceAll("[^0-9]", "");
		System.out.println("This are the num found in string : "+num);
		int add=0;
		for(int i=0;i<num.length();i++)
		{
			int sum = Character.getNumericValue(num.charAt(i));
			add = add +sum;
		}
		System.out.println("\nAddition of the founded no. : "+add);
		System.out.println(".............................................................................................");

		
		
	}

}
