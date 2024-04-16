package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static String readProperty(String Key) {
		String value = null;
		try {
			File file = new File("src/test/resources/testdata.properties");// relative path

			FileInputStream fileinputstream = new FileInputStream(file); //ready to read the file 
		   
			 Properties properties = new Properties();
			 //Reads a property list (key and element pairs) from the input byte stream. 
			 properties.load(fileinputstream);           //connect the file
		
			 //Searches for the property with the specified key in this property list. 
			 value=properties.getProperty(Key); 
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			
		}
		return value;

		//after writing the above code let go to the .java file where we want common code just go there and
		// at driver.get(ReadProperty.readProperty("url"));
		//update there.
	}

}
