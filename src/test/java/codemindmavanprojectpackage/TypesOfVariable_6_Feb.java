package codemindmavanprojectpackage;

class TypesOfVariables{
	
	 int ModelNO =1001;  //instance variable
	 
	 String color = "Black";  //instance Variable
	  
	 static int CarPrice= 1000000;  //Static Variable
	 
	 final float TaxOnCar = 13.4f;  //Final Variable
	 
	 void car()
	 {
	 	float average = 5.5f; //Local variable
	 	System.out.println("\nLocal Variable Average :  "+ average);
	 }
}
public class TypesOfVariable_6_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfVariables type = new TypesOfVariables();
        System.out.println("\nInstance Variable Model NO : "+ type.ModelNO);
        
        type.car(); //call member function of local variable
        
        System.out.println("\nStatic variable using object ,Car Price : "+ type.CarPrice);
        System.out.println("\nStatic variable using ClassName, Car Price: "+TypesOfVariables.CarPrice);
        
        System.out.println("\nFinal Variable using object Tax on car :" + type.TaxOnCar);        
	}

}
