package codemindmavanprojectpackage;

public class PalindromString_25_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Write a program to check wheather the string is Palindrome or not

		String str = "NayaN";
		String str1 ="";
		for(int i =str.length()-1;i>=0;i--)
		{
			str1 = str1+str.charAt(i);
		}
		
		if(str.equals(str1))
		{
			System.out.println("\n"+str1+" : String is Palindrom .");
		}
		
		else {
			System.out.println("\nString is NOT Palindrom.");
		}
		
	}

}
