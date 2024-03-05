package TestPackage;

public class mockinterview_3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*int sum=0;
      for
      (int i=1;i<=10;i++)
      {
    	  sum= sum+i;
      }
      System.out.println(sum);
	
		*/
		/*String day = "Monday";
		
		switch(day) {
		    case "Monday":
		          System.out.println("Monday");
		          break;
		    case "Tuesday":
		    	  System.out.println("Tuesday");
		    	  break;
		    default:
		    	   System.out.println("day of the week");
		}*/
		
		/*int i=0;
		System.out.println("Printing the list of first 10 even numbers ");
		while(i<=10)
		{
			System.out.println(i);
			i=i+2;
		}*/
		
		/*
		int age=21;
		if(age%2==0)
		{
			System.out.println("age is even");
		}
		else {
			System.out.println("the age is odd");
		}
		*/
		
		/*
		int year = 2024;
		if(year %4 ==0)   //if((year %4 ==0)&& (year%100!=0) || (year %400==0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
		*/
		/* Pyramid using for loop*  1 to 10 /
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				System.out.print(" @ ");
			}
			System.out.println();
		}
		*/
		/*Pyramind 10 to 1*/
        /*
        for(int i=1;i<=5;i++)
        {
        	for(int j=5 ;j>=i;j--)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }*/
	    /*	
		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
       */
		/*
		int a[]= {11,22,33,44,55,66};
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		/*
		int b[]= {11,22,33,44,55,66};
		for(int j=b.length-1;j>=0;j--)
		{
			System.out.println(b[j]);
		}
		*/
		
		/*int [][] arr = new int[2][2];*/
		/*int [][] arr= {{11,22,55},{33,44,66}};//wrong code
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}*/
		/*
        int a[]= {23,4,3,2,2,12,77,3,2,1,2,34,3,2,};
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i] <a[j])//  this if(a[i] >a[j]) --this for print array in ascending order
        		{
        		int num = a[i];
        		a[i]=a[j];
        		a[j]= num;
        	   }
        	}	
        }
        for(int arr :a)
        {
        	System.out.println(arr);
        }
		*/
		/*Diagoanl element sum */
		/*int matrix [][] = {{10,20,30 },{50,60,70},{40,50,60}};
        
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[i].length;j++)
        	{
        		System.out.print(matrix[i][j]+"\t");
        	}
        	System.out.println( );
        }
        */
		/*int matrix [][] = {{10,20,30 },{50,60,70},{40,50,60}};

        int sum =0;
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[i].length;j++)
        	{
        		if(i==j)
        		{
        			sum = sum+(matrix[i][j]);
        		}
        	}
        }
        System.out.println(sum);
		*/
		
		/*String str="codemind";
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='d')
			{
				count++;
			}
		}
		System.out.println(count);
		*/	
//1) Find only no. from the given string and do addition those number
System.out.println("\n1) Find only no. from the given string and do addition those number");
		String str="abc123@#$456";                                 //1
		String  num = str.replaceAll("[^0-9]", "") ;              //2
		System.out.println("\nFounded No. in string :" +num);     //3
		int add=0;                                                //4
		for(int i =0;i<num.length();i++)                          //5
		{
			int sum=Character.getNumericValue(num.charAt(i));     //6
			add=add+sum;                                          //7
		}
		System.out.println("\n Addition of the Given no.: "+add);  //8 
		System.out.println(".............................................................................................");
//2)find the no. of occurrence count of 'r' and 'o' in "todays mock interview" String.
System.out.println("\n2)find the no. of occurrence count of 'r' and 'o' in \"todays mock interview\" String.\r");
		String str1 ="Todays mock interview";  //1
		int count_r = 0;                       //2
		int count_o = 0;                       //3
		for(int j=0;j<=str1.length()-1;j++)    //4
        {
        	if(str1.charAt(j)=='r')            //5
        	{
        		count_r++;                     //6
        		
        	}
        	if(str1.charAt(j)=='o')           //7
        	{
        		count_o++;                    //8		 
        	}
        }
System.out.println("\nOccurance  of 'r' in the string : "+count_r + " times"); //9
System.out.println("\nOccurance of 'o' in the string : "+count_o+" times");//10  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
