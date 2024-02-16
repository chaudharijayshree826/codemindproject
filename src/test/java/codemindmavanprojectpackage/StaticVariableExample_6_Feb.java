package codemindmavanprojectpackage;

class StaticVariable{
	int HouseNo= 10;
	static int RowHouseNo = 202; //static variable declaration and initialization 
}

public class StaticVariableExample_6_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable svar1 =new StaticVariable();
		StaticVariable svar2 =new StaticVariable();
		StaticVariable svar3 =new StaticVariable();
		
		System.out.println("\nVariable House No. using object svar1 : " + svar1.HouseNo);
		System.out.println("Variable House No. using object svar2 : " + svar2.HouseNo);
       
		 svar1.HouseNo = 101;//changing the value of variable using object
		 
		 System.out.println("\nPrint updated House No. using Object :" +svar1.HouseNo);
		 System.out.println("Variable House No. using Object :"+svar2.HouseNo);
		 
		 System.out.println("\nVariable House No. using Object :" +svar1.RowHouseNo);
		 System.out.println("Variable House No. using Object :" +svar2.RowHouseNo);
		 
		 StaticVariable.RowHouseNo = 303;//changing the value of Static variable using class name
		 
		 System.out.println("\nprint updated House No. using Object :" +svar1.RowHouseNo);
		 System.out.println("print updated House No. using Object :" +svar2.RowHouseNo);
	 
	}

}
