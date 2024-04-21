package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Implementation_17_April implements ITestListener{
   
	        //if error line not shown, then for add the unimplemented  method then 
			//right click >>> click on sources >>> Click on Override/Implement  method
			//check the check box of ITestListeners.
			//click OK.
	@Override
	public void onTestStart(ITestResult result) { //ITestResult: this is one of the interface of the TestNG , current static of executed test case are in that.
		System.out.println("Test case started " + result.getName());  //this is printing the log.
	   //write any code for at the test case start like logging , printing log 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case sucess  " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed  " + result.getName());
	}
	
	//after this code writing go to testng.xml file and below code written there.
	
/*	<listeners>
	<listener class-name="utility.Listeners_Implementation_17_April"></listener>
</listeners>
<test thread-count="5" name="Test">
*/	//Run the testng.xml file.

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
}
