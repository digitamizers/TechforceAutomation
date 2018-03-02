package test.driver;

import test.resources.generic.FrameworkLibrary;

/* ######################################################################################################
 * Class Name: TestRunner
 * Description: This serves as driver script and drives the complete execution
 * ######################################################################################################
 */
public class TestRunner extends FrameworkLibrary
{
/* ######################################################################################################
 * Class Name: main
 * Description: The Main Method of the Complete Framework
 * ######################################################################################################
 */
	public static void main(String []args) 
	{
		onExecutionStart();
		String SelectedTestCases = getTestCases();
 	    for (String TestCase: SelectedTestCases.split(";;"))
	    {
	    	 if(TestCase.length()==0) continue;
	    	 CurrentTestCase = TestCase;
	    	 getIterations();
	    	 for(int Iteration = StartIteration;Iteration<=EndIteration;Iteration++)
	    	 { 
	    		 if (isIterationDataExist(Iteration)) 
	    		 {
	    			 	onTestCaseStart();
	    			 	execute(ClassPath);
	    			 	onTestCaseFinish();
	    		 }
	    	 }
	    }
 	    
 	  //onExecutionFinish();	
 	   
	}
}
