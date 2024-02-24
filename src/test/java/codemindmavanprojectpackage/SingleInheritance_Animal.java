package codemindmavanprojectpackage;
class Animal{
	 float weight ;    
	 public void eating()
	 { 
	  System.out.println("\nFrom parent class , All Animal are eating food.");		
	 }	 
	 public void speeling()
	 {   
		  System.out.println("From parent class , All animal are sleeping.");
	 }   }
class Dog extends Animal
{
	 String Color;
	 
	 public void playing()
	 {
		 System.out.println("\nFrom Child class");
		 System.out.println("Dog's puppy are playing with kids ");
	 }
}
public class SingleInheritance_Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog(); 
		a.speeling();
		a.eating();
		a.playing();
		a.weight=5.9f;
		System.out.println("\nWeight of the Dog : "+ a.weight);
		a.Color="Black";
		System.out.println("\nColor of the Dog : "+ a.Color);		
	}

}
