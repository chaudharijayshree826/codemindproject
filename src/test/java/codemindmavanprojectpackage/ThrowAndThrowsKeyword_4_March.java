package codemindmavanprojectpackage;
//Howw to Throw Custom Exception
public class ThrowAndThrowsKeyword_4_March {

	int age = 17; 
	
	public void eligibileForVoting() {
		if(age >=18) {
			System.out.println("user is  eligible for voting.");
		}
		if(age < 18) {
			//System.out.println("user is not eligible for voting.");
		   // throw new NullPointerException("USER IS NOT ELIGIBLE FOR VOTING");
		   //we can use any kind of exception.
			throw new ArithmeticException("USER IS NOT ELIGIBLE FOR VOTING");

		}
	}
	public static void main(String[] args) {
		ThrowAndThrowsKeyword_4_March r = new ThrowAndThrowsKeyword_4_March();
		r.eligibileForVoting();

	}

}
