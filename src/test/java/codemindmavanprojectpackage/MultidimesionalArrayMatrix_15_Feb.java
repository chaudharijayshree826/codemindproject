package codemindmavanprojectpackage;

public class MultidimesionalArrayMatrix_15_Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //2)5*5 matrix print 
		
		int matrix[][] = {{1,2,3,4,5},
				          {11,22,33,44,55},
				          {10,20,30,40,50},
				          {100,200,300,400,500},
				          {1000,2000,3000,4000,5000}};
		
		for(int i=0;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}	
		
	}

}
 