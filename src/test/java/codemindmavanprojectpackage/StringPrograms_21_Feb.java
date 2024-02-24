package codemindmavanprojectpackage;

public class StringPrograms_21_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Reverse a given string 
		String str1 = "Hello World!";//12
		String str2 =" ";
		System.out.println("1) Reverse a given string");
		for(int i =(str1.length()-1);i>=0;i--) {//12 ,11, 10m  , 9  8 ,7,6,5,4,3,2,1,0
			str2 = str2+str1.charAt(i);
			System.out.print(str1.charAt(i));  //o/p----!dlroW olleH
		}
		
		System.out.println("\n.............................................................................................");

		//System.out.println(str2);
		
		//Word reverse
		System.out.println("\n2) Word reverse");
		String arr[]= str1.split(" "); //h e  l l o
		String str3 = " ";
		for(String print :arr) {
			for(int i=(print.length()-1) ;i>=0 ;i--) { //12 ,11 ,10
				str3 = str3+print.charAt(i); //!
			}
			str3 = str3+" ";
		}
		System.out.println("\n Word reverse: "+str3.trim());  //o/p-----olleH !dlroW
		
		
		
	    System.out.println(".............................................................................................");
		
	    // find only digits and do addition of digits
	    System.out.println("\n3) find only digits and do addition of digits");
		String charnum ="abc2222";
		String num = charnum.replaceAll("[^0-9]", ""); //12345
		System.out.println("This are the num found in string : "+num);
		int add=0;
		for(int i=0;i<num.length();i++)   //123 4 5
		{ 
			int sum = Character.getNumericValue(num.charAt(i));
			add = add +sum;
			//0+1=1 add 2+2=4
			//1+2=3 add  4+2=6
			//3+3=6 add  6+2=8
			//6+4=10 add
			//10+5 =15	
		}
		System.out.println("\nAddition of the founded no. : "+add);
		System.out.println(".............................................................................................");

		
		//------------------------------------------------------------------------------------------------------------------------------------------
		//Counting Frequency of a character in a String by Using the charAt() Method
        System.out.println("\nCounting Frequency of a character in a String by Using the charAt() Method\r\n" + 
        		"");
		String a1="Welcome to javatpoint portal";
		int count = 0;
		System.out.println("Lenght if a1 : "+a1.length());
		for(int x=0; x<=a1.length()-1;x++) //28-1, x+1
		{
			if(a1.charAt(x)=='a') {
				count++; //1 ,2 ,3 ,4
			}
		}
		System.out.println("Frequency of t is : "+count);
		
		
		//Print Characters Presented at Odd Positions by Using the charAt() Method
		System.out.println("\nPrint Characters Presented at Odd Positions by Using the charAt() Method");
		String a2 = "Welcome to javatpoint";
		for(int y=0;y<=a2.length()-1;y++)
		{
			if(y%2!=0) //1 3 5b 7..
			{
				System.out.println("Char at "+ y + " Place :"+a2.charAt(y));
			}
		}
		
		//Accessing First and Last Character by Using the charAt() Method
        System.out.println("\nAccessing First and Last Character by Using the charAt() Method");
		String a3 = "Welcome to javatpoint";
		int strLength = a3.length();
		System.out.println("string lengjr  :  "+strLength);
		//Fetching the 1st characters:
		System.out.println("Character at 0 index is:  "+a3.charAt(0));
		
		//The last char is present at the string length-2 index.
		System.out.println("\n Characters at last index : " +a3.charAt(strLength-1));	
	}

}
