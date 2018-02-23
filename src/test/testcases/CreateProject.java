package test.testcases;



public class CreateProject extends UserLibrary {

	public static void TC101_VerifyCreateProject() {

		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateProjectCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Create Project Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Project Command");
	
		// Enter Project Name
		status=SetText("//input[@placeholder='Project Name']", ProjectName);
		if(status)
			LogEventWithScreenshot("pass", "Entered Project Name");
		else
			LogEventWithScreenshot("fail", "Unable to enter Project Name");
		
		// Enter Project Key
		status=SetTextAndTab("//input[@placeholder='Project Key']", ProjectKey);
		if(status)
			LogEventWithScreenshot("pass", "Entered Project Key");
		else
			LogEventWithScreenshot("fail", "Unable to enter Project Key");
		
		
		//Select Project Type
		status=SelectOPtionByValueAndTab("//select[@class='ac-input ac-multichoiceInput']", ProjectType);
		if(status)
			LogEventWithScreenshot("pass", "Select the Project type");
		else
			LogEventWithScreenshot("fail", "Unable to select Project type");
		
		
		//Select Project Scheme Type
		status=SelectOPtionByValueAndTab("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]",ProjectSchemeType);
		if(status)
			LogEventWithScreenshot("pass", "Select the Project Scheme Type");
		else
			LogEventWithScreenshot("fail","Unable to select the Project schema type");
		
		
		status=Exist("//P[text()='Project Created with "+ ProjectKey +" key Successfully!']");
		if(status)
			LogEventWithScreenshot("pass", "Create Project successful");
		else {
			status=Exist("//p[text()='A project with that name already exists.']");
			if(status)
				LogEventWithScreenshot("info","Unable to create Project, This Project is aleady exit");
			else
				LogEventWithScreenshot("fail", "Unable to create project");
		}
		Logout();
		
	}
	
	
}
