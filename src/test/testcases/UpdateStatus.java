package test.testcases;

public class UpdateStatus extends UserLibrary {

	public static void TC81_VerifyUpdateIssueStatus() {

		boolean status;
		status = Login(URL, UserName, Password);

		status = SetText("//input[@class='wc-shellinput']", UpdateStatusCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Update Issue Status  command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Update Issue Status  command");

		
		
		Logout();
	}
}
