package codemindmavanprojectpackage;
//it also called bubble sort.
public class ArrayAsceDescOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int days[]= {34,56,34,89,6,23,11,37};
		System.out.println("\nPrint numbers in Ascending order ");
		for(int i=0;i < days.length; i++) 
		{		
			for(int j=i+1;j<days.length;j++)
			{
				if(days[i] > days[j]) 
				{  
					int num= days[i];
					days[i]=days[j];
					days[j]=num;
				}
			}
		}
		for(int a:days) 
		{
			System.out.println(a);
		}
	}

}
