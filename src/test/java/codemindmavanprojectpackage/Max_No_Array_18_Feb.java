package codemindmavanprojectpackage;

public class Max_No_Array_18_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix [][] = {{10,20,30 },{50,60,70},{40,50,60}};
		System.out.println("\n array class name  "+matrix.getClass());
		System.out.println("Matrix of 3*3 :");
		for(int p=0;p<matrix.length;p++)   //row
		{ 
			for(int q=0;q<matrix[p].length;q++)    //column
			{
				System.out.print(matrix[p][q]+"\t");
				
			}
			System.out.println();
		}
		
		//Diagonal element print and sum
		System.out.println("--------------------------------------------------------------------------");
		int sum = 0;
		for (int i=0 ;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i==j) 
				{
					System.out.println("Diagonal element: " + matrix[i][j]);
					sum =sum+ (matrix[i][j]);
				}
			}
		}
		System.out.println("Addition of Diagonal element : "+sum);
		System.out.println("--------------------------------------------------------------------------");
//1. Write a Program to find Maximum number from below 1-D Array
		
	  int value[]= {10,67,87,23,34};
	 
	   int max = value[0];
    	System.out.println("The value of array: ");
	
    	//for each loop 
    		for(int print :value) 
    		{           
    				System.out.println(print);
    			}
	
    			for(int x=0;x<value.length;x++) 
    			{
    				if(value[x] > max) 
    				{
    					max =value[x];	  
    				}
    			}
	  
    			System.out.println("\nMaximum Value in the array:" +max);
    			System.out.println("--------------------------------------------------------------------------");

	
 //2. Write a Program to find Minimum number from below 1-D Array
    			int arr[] = {50, 67, 87, 23, 34};
    			int min = arr[0];
    			
    			System.out.println("The value of array :");
    			for(int newarray :arr) {
    				System.out.println(newarray);
    			}
    			
    			for(int l=1;l<arr.length;l++) {
    				if(arr[l]<min) {
    					min = arr[l];
    				}
    			}
    			
    			System.out.println("Minmum value in array :"+ min);    			
	}
}
