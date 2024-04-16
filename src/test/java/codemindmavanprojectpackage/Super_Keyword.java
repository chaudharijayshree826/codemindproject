package codemindmavanprojectpackage;
class student1
{
	String name ;int id;
	student1(int id , String name) //Parameterized constructor
	  {
		this.id = id;      //this used here to refer current class instance variable.
		this.name = name;   //    -//-
	  }}
class standard extends student1{
	float fees;
	standard(int id , String name ,float fees)  //Parameterized constructor
	{
		super(id, name);      //super keyword used here to inherits the parent_class--student1 properties.
		this.fees = fees;     //this used here to refer current class instance variable.
	}	
	void show()
	{
		System.out.println("\nStudent ID : "+id +"\n"+"Studnet Name : " +name + "\n"+"Fees : "+ fees);
	}}
public class Super_Keyword {
	public static void main(String[] args) {
	
		standard s = new standard(10,"JC",500);
		s.show();
	}
}
