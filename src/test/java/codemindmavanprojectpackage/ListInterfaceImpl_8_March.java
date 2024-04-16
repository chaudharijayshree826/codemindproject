package codemindmavanprojectpackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceImpl_8_March {

	public static void main(String[] args) {
      List l = new ArrayList();
      //Store Heterogeneous objects
      System.out.println("\nStore Heterogeneous objects");
      l.add(10);  //its shows waring in yellow color underline 
      l.add(5.5f);
      l.add("ABC");
      l.add('J');
      
      for(int i =0 ; i<l.size();i++)
      {
    	  System.out.println(l.get(i));
      }
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
      
    //Generic <E> :--  
    //With Generic, it is required to specify the type of object we need to store.    
      
     System.out.println("\n---------------- ArrayList --------------------------");
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(10);   //allow to store duplicate elements.
    arrayList.add(null); //allow to insert value.
    arrayList.add(100); 
    arrayList.add(200); 
    ArrayList<String> arraystring = new ArrayList<String>();
    
    arraystring.add("Java");
    arraystring.add("Advance");
    
 
    ArrayList<Float> arrayFloat = new ArrayList<Float>();
    
    arrayFloat.add(11.11f);
    arrayFloat.add(22.22f);
   
    System.out.println("\nPrint the value of Integer type :");
    for(int j =0 ; j<arrayList.size();j++)
    {
  	  System.out.println(arrayList.get(j));
    }
    
    System.out.println("\nPrint the value of String type :");
    for(int p =0 ; p<arraystring.size();p++)
    {
  	  System.out.println(arraystring.get(p));
    }
    
    System.out.println("\nPrint the value of Float type :");
    for(int q =0 ; q<arrayFloat.size();q++)
    {
  	  System.out.println(arrayFloat.get(q));
    }
    
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
   
    
    System.out.println("\n---------------- LinkedList --------------------------");
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    
    linkedList.add(100);
    linkedList.add(200);
    linkedList.add(100);   //allow to store duplicate elements.
    linkedList.add(null); //allow to insert value.
    
    LinkedList<String> linkedstring = new LinkedList<String>();
    
    linkedstring.add("CodeMind");
    linkedstring.add("Technology");
    
 
    LinkedList<Float> linkedFloat = new LinkedList<Float>();
    
    linkedFloat.add(11.11f);
    linkedFloat.add(22.22f);
    linkedFloat.add(33.33f);
    linkedFloat.add(44.44f);
    linkedFloat.add(66.66f);
   
    System.out.println("\nPrint the value of Integer type :");
    for(int j =0 ; j<linkedList.size();j++)
    {
  	  System.out.println(linkedList.get(j));
    }
    
    System.out.println("\nPrint the value of String type :");
    for(int p =0 ; p<linkedstring.size();p++)
    {
  	  System.out.println(linkedstring.get(p));
    }
    
    System.out.println("\nPrint the value of Float type :");
    for(int q =0 ; q<linkedFloat.size();q++)
    {
  	  System.out.println(linkedFloat.get(q));
    }
    
    
    //ArrayList Methods:-----
    
    //add see above
    //add all
    
    ArrayList<Integer> arrlist = new   ArrayList<Integer>();
    arrlist.addAll(arrayList);
    arrlist.add(555555);
    arrlist.add(66666666);
    
    //addAll method:----------
    System.out.println("\nAdd and Print the value of arrayList using addAll method: ");
    for(Integer m :arrlist)
    {
    	System.out.println(m);
    }
    
    //remove method:--------------
    System.out.println("\nRemove and Print the value of arrlist after removing using 'remove' method: ");
    arrlist.remove(3);
    
    for(Integer n :arrlist)
    {
    	System.out.println(n);
    }
    
    //remove all
    //System.out.println("\nRemove all and Print the value of array list after removing all using 'removeAll' method: ");
   /* boolean b = arrlist.removeAll(arrayList);     //it will return the True if values are removed

    for(Integer o :arrlist)
    { 
    	System.out.println(o);
    }
    
    System.out.println("\nRemoved all values from array list using the 'removeAll()' method : "+b);
    */
    
    
    //contains() Method
    System.out.println("\ncontains() Method");
    System.out.println("Arraylist contains 555555 : "+arrlist.contains(555555));

    //size()
    System.out.println("\nlength of arrylist is :"+arrlist.size());
    
    //isEmpty() method
    System.out.println("\nisEmpty() method:--");
    System.out.println("check is the array is empty or not using 'isEmpty()' : "+arrlist.isEmpty());
    
    
    //iterator() method , this is the interface 
    Iterator<Integer> it =  arrlist.iterator();
    System.out.println("\niterator() method:--");
    System.out.println("Printing value of arraylist using 'iterator()' method : ");
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    
    //if want to remove  element using iterator 
    Iterator<Float>  f =  linkedFloat.iterator();
    System.out.println("\nthe value of linkedFloat using 'iteraor()' method: ");
    while(f.hasNext())
    {
    	Float storeIterator = f.next();
    	System.out.println(storeIterator);
    }
    
    /*
    ArrayList<Character> ArrayChar = new ArrayList<Character>();
    ArrayChar.add('J');
    ArrayChar.add('A');
    ArrayChar.add('Y');
    ArrayChar.add('U');
    
     Iterator<Character>  c = ArrayChar.iterator();
     while(c.hasNext())
     {
    	 Character cc = c.next();
    	 if(cc == 0)
    	 {
    		 ArrayChar.remove(Integer.valueOf(cc)); 
    	 }
    }
     System.out.println("\n list of char after removing element :"+c);
    */
    
    
	//clear():---
    //Removes all of the elements from this list. The list will be empty after this call returns.
    System.out.println("\nclear() Method");
    System.out.println("Removes all of the elements from this list. The list will be empty after this call returns.\r\n");
    arrlist.clear();
    for(Integer p :arrlist)
    { 
    	System.out.println(p);
    }
	
    //isEmpty() method
    System.out.println("\nisEmpty() method after clearing the list: ");
    System.out.println("check is the array is empty or not using 'isEmpty()' : "+arrlist.isEmpty());
    
	
    }

	}

//ctrl+f --replace all  for 
