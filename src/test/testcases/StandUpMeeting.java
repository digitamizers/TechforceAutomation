package test.testcases;

public class StandUpMeeting extends UserLibrary {

public static void TC61_VerifyStandupMeeting() {
		
		boolean status;
		status = Login(URL, UserName, Password);
		
		status = SetText("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");
		
		
		
		
		
		
		Logout();
	}
	
}
