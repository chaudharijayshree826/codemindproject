package codemindmavanprojectpackage;

public class Parameterized_Constructor {
	int car_model;
	float car_price;
	String car_name;
	 //creating a parameterized constructor  
	   Parameterized_Constructor (int carmodel, float carprice,String carname){
		   
		   System.out.println("Constructer which accept value's");
		   car_model = carmodel;
		   car_price = carprice;
		   car_name = carname;		   
	   }    
	     void show() {
	    	 System.out.println("Car model : " +car_model);
	    	 System.out.println("Car price :" +car_price);
	    	 System.out.println("Car name : " +car_name);
	     }	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_Constructor pc = new Parameterized_Constructor(111,1200000f,"Punch");
	    pc.show();
	    
	}

}
