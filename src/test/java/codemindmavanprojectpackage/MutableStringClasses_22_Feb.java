package codemindmavanprojectpackage;
public class MutableStringClasses_22_Feb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("String Buffer Class: ");
		StringBuffer buf = new StringBuffer("Welcome to the Programming World");
        
        buf.append("...!!Hello from JC");
        
        System.out.println(buf);
        
        System.out.println("\nSrting Reverse:  ");
        System.out.println(buf.reverse());
        
        System.out.println("...................---------------------------------.");
        
        System.out.println("String Builder Class : ");
        StringBuilder sb = new StringBuilder("String Builder Class Example.");
        System.out.println(sb.append("....first"));
        
        System.out.println("\nReverse String Example for String Builder class :  ");
        System.out.println(sb.reverse()); 
	}
}
