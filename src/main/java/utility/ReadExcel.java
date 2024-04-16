package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static List<String> readExcel(String filePath,String sheetName) throws NullPointerException, InvalidFormatException, IOException
	{  
		//for reading excel file we need apache poi  dependencies to add in pom.xml file 
		
		File file = new File(filePath);
	    FileInputStream fileinputstream = new FileInputStream(file);
	 
	    List<String> userData = new ArrayList<String>();
	        
	    //class from apache poi used belo //it a class
	    //High level representation of a SpreadsheetML workbook. This is the first object most userswill construct whether they are reading or writing a workbook. It is also thetop level object for creating new sheets/etc.

	    XSSFWorkbook xssfworkbook = new XSSFWorkbook(file);
	    
	    //XSSFSheet is also a class 
	    XSSFSheet xssfsheet=  xssfworkbook.getSheet(sheetName); //give excel sheet name.
	    
	    int lastrownum = xssfsheet.getLastRowNum();
	
	    for(int i=1;i<=lastrownum;i++) //int i=0
	    {
	    	XSSFRow xssfrow = xssfsheet.getRow(i);
	  
	    	int lastcellnumber = xssfrow.getLastCellNum();	    	
	    	for(int j=0;j<lastcellnumber;j++)
              {
	    		//System.out.println(xssfrow.getCell(j).toString());
	          
	    		userData.add(xssfrow.getCell(j).toString());
              } }    
	    xssfworkbook.close();
		return userData;
	
	}
	
}
