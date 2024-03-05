package codemindmavanprojectpackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class CompileTime_Exception_9_March {

	public static void main(String[] args) throws ClassNotFoundException,SQLException,IOException//decalre compile time exception using throws keywords. 
	//this  declaration is only for  alerting purpose , if some one will use this methods while using this he can easily unersthad that  this method might throw this kind of exception. 
	{
		Class.forName("");
		
		Connection con = DriverManager.getConnection("");
		
		File file = new File("");
		
		FileInputStream fis = new FileInputStream(file);
		
		fis.close();

	}

}
