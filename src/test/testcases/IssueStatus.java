package test.testcases;

public class IssueStatus extends UserLibrary {

	public static void TC141_VerifyIssueStatus() {
		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter IssueStatus Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", IssueStatusCommand);
		if (status)
			LogEventWithScreenshot("info", "Enter Sprint Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Sprint Command");
		
		// Select the Project
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", IssueStatusProject);
		if (status)
			LogEventWithScreenshot("info", "select Project");
		else
			LogEventWithScreenshot("fail", "Unable to Select Project");
		
		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[1]");
		if (status)
			LogEventWithScreenshot("info", "Click OK button");
		else
			LogEventWithScreenshot("fail","Unable to Click OK button");

		status = Exist("//P[text()='I think you dont have access to fetch users!']");
		if (status)
			LogEventWithScreenshot("pass", "I think you don't have any issues");
		else {
			// Select Issue
			status = SelectOPtionByValue("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]", IssueStatusIssue);
			if (status)
				LogEventWithScreenshot("info", "select Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select issue");

			// Click OK button
			status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[2]");
			if (status)
				LogEventWithScreenshot("info", "Click OK button");
			else
				LogEventWithScreenshot("fail", "Unable to Click OK button");

			// Complete Msg
			status = Exist("//P[text()='Issues that you are looking for']");
			if (status)
				LogEventWithScreenshot("pass", "successfully display the issue status");
			else
				LogEventWithScreenshot("info", "Unable to Display the Issue status");
		}
		
		status = Exist("//P[text()='Due to error I shall leave it here']");
		if(status)
			LogEventWithScreenshot("fail","This message not showing 'Due to error I shall leave it here'");
	}
}
