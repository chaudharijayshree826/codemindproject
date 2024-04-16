package SeleniumPackages;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadExcelAndProprtiesFile_1_10_March {

	public static void main(String[] args) throws IOException {
		
		File ff = new File("C:\\Users\\PLAPY-10\\Desktop\\FromCodeMind.txt");
		
		if(!(ff.exists()))
		{
		ff.createNewFile();
		}
		
		//getAbsolutePath()
		//Returns the absolute pathname string of this abstract pathname.
		System.out.println("............getAbsolutePath().....................................................................");
		System.out.println(ff.getAbsolutePath());
		
		//getCanonicalPath()
		//Returns the canonical pathname string of this abstract pathname
		System.out.println("\n............getAbsolutePath().....................................................................");
		System.out.println(ff.getCanonicalPath());
		String ss = "Welcome to the java world";
		
		//Constructs a FileWriter given the File to write and a boolean indicating whether to append the data written, 
		FileWriter fw = new FileWriter(ff, true);
		
		fw.append(ss);
		
		fw.close();
			
		//Returns the name of the file or directory denoted by this abstract pathname
		System.out.println("\n............getName().....................................................................");
		System.out.println(ff.getName());
		
		//The number of unallocated bytes on the partition 
		System.out.println("\n............getFreeSpace().....................................................................");
		System.out.println(ff.getFreeSpace());
		
		//Tests whether the application can execute the file denoted by this abstract pathname. On some platforms it may be possible to start theJava virtual machine with special privileges that allow it to executefiles that are not marked executable. Consequently this method may return true even though the file does not have execute permissions.
		// Consequently this method may return true even though the file does not have execute permissions.
		System.out.println("\n............canExecute().....................................................................");
		System.out.println("Always return true. : "+ff.canExecute());
		
		//Tests whether the application can read the file denoted by this abstract pathname. 
		System.out.println("\n............canRead()....................................................................");
		System.out.println(ff.canRead());
		
		
		//Tests whether the application can modify the file denoted by this abstract pathname.
		System.out.println("\n............canRead()....................................................................");
		System.out.println(ff.canWrite());
		
		
		System.out.println("\n............isHidden()....................................................................");
		//isHidden()
		System.out.println(ff.isHidden());
		
		
		//Creates a new FileReader, given the File to read
		System.out.println("\nCreates a new FileReader, given the File to read");
		 FileReader fr = new FileReader(ff);
		    
			int j ;
			while((j=fr.read())!=-1)
			{
				System.out.println((char)j);
			}
		    fr.close();
		    
		    
		    
		System.out.println("\n");
		System.out.println("\n.................PDF File Example...........................................");
		File pdf = new File("C:\\Users\\PLAPY-10\\Desktop\\FromCodeMindpdf.pdf");
		pdf.createNewFile();
		System.out.println("\n able to  read ."+pdf.canRead());
		System.out.println("\n able to  write . "+pdf.canWrite());
		System.out.println("\n PDF file deleted sucessfully ."+pdf.delete());
		System.out.println("\n PDF file deleted hence not able to read the file . "+pdf.canRead());
	
		
		System.out.println("\n.......................ppt file operations below........................................ ");
		File ppt = new File("C:\\Users\\PLAPY-10\\Desktop\\FromCodeMindppt.ppt");
		pdf.createNewFile();
		System.out.println("\n able to  read ."+ppt.canRead());
		//set read and set write proprty 
		System.out.println("\n able to  write . "+ppt.canWrite());
		System.out.println("\n PPT file deleted sucessfully ."+ppt.delete());
		System.out.println("\n PPT file deleted hence not able to read the file . "+ppt.canRead());
	
	     
		System.out.println("\n.......................zip file operations below........................................ ");
		File zipp = new File("C:\\Users\\PLAPY-10\\Desktop\\fromcodecindzipp.zip");
		zipp.createNewFile();
		System.out.println("\n able to  read ."+zipp.canRead());
		System.out.println("\n able to  write . "+zipp.canWrite());
		System.out.println("\n ZIP file deleted sucessfully ."+zipp.delete());
		System.out.println("\n ZIP file deleted hence not able to read the file . "+zipp.canRead());

		
		
		System.out.println("\n.................Word document file..........................");
		File docxx= new File("C:\\Users\\PLAPY-10\\Desktop\\fromcodecinddocx.docx");
		docxx.createNewFile();
		System.out.println("\n able to  read ."+docxx.canRead());
		System.out.println("\n able to  write . "+docxx.canWrite());
		System.out.println("\n docx file deleted sucessfully ."+docxx.delete());
		System.out.println("\n docx file deleted hence not able to read the file . "+docxx.canRead());

		  
	}

}
