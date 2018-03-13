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
		status=SetText("//input[@placeholder='Project Key']", ProjectKey);
		if(status)
			LogEventWithScreenshot("pass", "Entered Project Key");
		else
			LogEventWithScreenshot("fail", "Unable to enter Project Key");
		
		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'])[1]");
		if (status)
			LogEventWithScreenshot("info", "Click OK button");
		else
			LogEventWithScreenshot("fail", "Unable to Click OK button");

		//Select Project Type
		status=SelectOPtionByText("//select[@class='ac-input ac-multichoiceInput']", ProjectType);
		if(status)
			LogEventWithScreenshot("pass", "Select the Project type");
		else
			LogEventWithScreenshot("fail", "Unable to select Project type");
		
		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'])[2]");
		if (status)
			LogEventWithScreenshot("info", "Click OK button");
		else
			LogEventWithScreenshot("fail", "Unable to Click OK button");

		//Select Project Scheme Type
		status=SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]",ProjectSchemeType);
		if(status)
			LogEventWithScreenshot("pass", "Select the Project Scheme Type");
		else
			LogEventWithScreenshot("fail","Unable to select the Project schema type");
		
		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'])[3]");
		if (status)
			LogEventWithScreenshot("info", "Click OK button");
		else
			LogEventWithScreenshot("fail", "Unable to Click OK button");
		
		status=Exist("//P[contains(text(),'"+ProjectKey+"')]");
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
