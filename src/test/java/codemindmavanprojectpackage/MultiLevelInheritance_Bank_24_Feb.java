package codemindmavanprojectpackage;

class Bank{
	String BankName ;
	int AccountNo;
	String BankAddress;
	int amount;
	int BankContactNo;
	//String IFSCCode;
	public void loan()
	{
		System.out.println("\nThis mehtod from the Bank Class");
		System.out.println("Congratualtion !! Interest rate on Home Loan : 9.5%");
		System.out.println("........................................................................................");
	}
}
class SBI extends Bank{
	int BankContactNo;
	//String IFSCCode;
	public void credit()
	{
		System.out.println("\nSBI Credit method called here .");
		System.out.println("Account Holder = "+ this.AccountNo +"\n"+"Credit Ammount = "+ this.amount+"\n"+"Bank Name: "
		+ this.BankName +"\n"+"Bank Contcat No : " + this.BankContactNo);
	    System.out.println("..............................................................................................");
	}
}
class Kotak extends SBI{
	public void deposit()
	{
		System.out.println("\nKotak deposit  method called here.");
		System.out.println("\nAccount Holder = "+ this.AccountNo +"\n"+"Deposit Ammount = "+ this.amount+"\n"+"Bank Name: "
		+ this.BankName +"\n"+"Bank Contcat No : " + this.BankContactNo);
	}
}
public class MultiLevelInheritance_Bank_24_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Kotak k = new Kotak();
		k.AccountNo = 12345;
		k.BankAddress="Wakad";
		k.BankContactNo = 123456789;
		k.BankName="SBI";
		//k.IFSCCode = "12345abcd";
		k.amount = 5000;
		k.credit();
		k.AccountNo = 898989;
		k.BankAddress ="Pune";
		k.BankContactNo = 7777;
		k.BankName ="Kotak";
		k.deposit();
		k.loan();
		
		String str4="abc";
		str4.concat("xyz");
		System.out.println(str4);
	}

}
