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
		status = SelectOPtionByValue("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", IssueStatusProject);
		if (status)
			System.out.println("select Project");
		else
			System.out.println( "Unable to Select Project");
		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[1]");
		if (status)
			System.out.println("Click OK button");
		else
			System.out.println( "Unable to Click OK button");
		
		// Select Issue
		status = SelectOPtionByValue("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]", IssueStatusIssue);
		if (status)
			System.out.println("select Issue");
		else
			System.out.println( "Unable to Select issue");
		
		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[2]");
		if (status)
			System.out.println("Click OK button");
		else
			System.out.println( "Unable to Click OK button");
		
		// Complete Msg
		status = Exist("//P[text()='Issues that you are looking for']");
		if (status)
			System.out.println("display the issue status");
		else
			System.out.println( "Unable to Display the Issue status");
		
		}
}
