package test.testcases;

public class AssigneeIssue extends UserLibrary {

	public static void TC41_VerifyAssigneIssue() {

		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Assignee Issues Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", AssigneeIssuesCommand);
		if (status)
			LogEventWithScreenshot("pass", "Entered Assignee Issues Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Assignee Issues Command");

		status = Exist("//P[text()='I think you dont have any UnAssigned Issues in Current Sprint']");
		if (status) {
			LogEventWithScreenshot("pass", "There is no assigne issues");
		} else {

			// Select the issues
			status = SelectOPtionByValueAndTab("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]",
					SelectAssigneeIssue);
			if (status)
				LogEventWithScreenshot("pass", "Selected Assignee Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select Assignee Issues");

			// Select the User
			status = SelectOPtionByValueAndTab("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]",
					SelectAssigneeUser);
			if (status)
				LogEventWithScreenshot("pass", "Selected Assignee User");
			else
				LogEventWithScreenshot("fail", "Unable to Select Assignee User");

			// Issue Assigned Successfully!
			status = Exist("//p[text()='Issue Assigned Successfully!']");
			if (status)
				LogEventWithScreenshot("pass", "Issue Assigned Successfully");
			else
				LogEventWithScreenshot("fail", "Unable to Assigne Issue");
		}

		//wait(10);
		Logout();
	}
	
}
