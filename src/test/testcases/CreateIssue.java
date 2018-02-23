package test.testcases;

public class CreateIssue extends UserLibrary {
	
public static void Tc51_VerifyCreateIssues() {
		
		boolean status;
		status = Login(URL, UserName, Password);

		status = SetText("//input[@class='wc-shellinput']", CreateIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Create Issue Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Issue Command");
	
	
	
	
		Logout();
	}

}
