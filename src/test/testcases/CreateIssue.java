package test.testcases;

public class CreateIssue extends UserLibrary {
	
public static void Tc51_VerifyCreateIssues() {
		
		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if(status)
			LogEventWithScreenshot("pass","Home page is displayed");
		else
			LogEventWithScreenshot("fail","Unable to display home page");

		//Enter Create issue command
		status = SetText("//input[@class='wc-shellinput']", CreateIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Create Issue Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Issue Command");
		
		
		
	
	
	
	
		Logout();
	}

}
