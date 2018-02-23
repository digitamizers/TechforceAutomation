package test.testcases;

public class CreateSprint extends UserLibrary {

	public static void TC111_VerifyCreateSprint() {
		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Assignee Issues Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateSprintCommand);
		if (status)
			LogEventWithScreenshot("pass", "Entered Create Sprint Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Sprint Command");
		
		// Selected Sprint Board
		status=SelectOPtionByValueAndTab("//SELECT[@class='ac-input ac-multichoiceInput']", SprintBoard);
		if (status)
			LogEventWithScreenshot("pass", " Selected Sprint Board");
		else
			LogEventWithScreenshot("fail", "Unable to Selected Sprint");
	}
}
