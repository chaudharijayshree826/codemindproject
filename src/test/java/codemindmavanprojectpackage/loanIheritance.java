package codemindmavanprojectpackage;
//hierarchical
class loan
{
	int income;
	String bank_stat;
	//String Name;
	//float amount;
	
	void dispayDocuments()
	{
		String Name;
		float amount;
		System.out.println("Print dispayDocuments from parents");
	}
	
	void results()
	{
		System.out.println("loan pass");
	}
}

class carloan extends loan
{
	void car()
	{
		System.out.println("car");
	}
}


class personalloan extends loan
{
	void personal()
	{
		System.out.println("personal");
	}
}

public class loanIheritance {

	public static void main(String[] args) {
		
		personalloan l = new personalloan();
		l.dispayDocuments();
		
		carloan cl = new carloan();
		cl.car();
		cl.dispayDocuments();
		
		loan ll = new loan();
		ll.results();
		
		
		

	}

}
