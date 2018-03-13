package test.testcases;

public class UpdateStatus extends UserLibrary {

	public static void TC81_VerifyUpdateIssueStatus() {

		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if(status)
			LogEventWithScreenshot("pass","Displayed Home page");
		else
			LogEventWithScreenshot("fail","Unable to display Home Page");
		
		// Enter command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", UpdateStatusCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Update Issue Status  command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Update Issue Status  command");

		// Select Issues
		status = SelectOPtionByContainsTextAndTab("//select[@class='ac-input ac-multichoiceInput']", UpdateStatusIssue);
		if(status)
			LogEventWithScreenshot("info","Selected the issues");
		else
			LogEventWithScreenshot("fail", "Unable to select the issue");
		
		// Select Issue status
		status = SelectOPtionByTextAndTab("//select[@class='ac-input ac-multichoiceInput']",UpdateStatusIssueStatus);
		if(status)
			LogEventWithScreenshot("info","Selected the issue status");
		else
			LogEventWithScreenshot("fail", "Unable to select the issue status");
		
		// Succesful message
		status = Exist("//P[text()='status changed Successfully!']");
		if(status)
			LogEventWithScreenshot("pass","Status changes Successfull");
		else
			LogEventWithScreenshot("fail","Unsuccessful status changes");
		
		Logout();
	}

}
