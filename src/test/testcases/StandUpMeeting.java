package test.testcases;

public class StandUpMeeting extends UserLibrary {

public static void TC61_VerifyStandupMeeting() {
		
		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Standup command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");
		
		//
		status = Exist("//p[text()='What issue did you work on yesterday?']");
		if(status)
			LogEventWithScreenshot("info", "info");
		else
			LogEventWithScreenshot("fail", "info");
		
		// Select the inprogress issues
		status=SelectOPtionByText("//select[class='ac-input ac-multichoiceInput']", StandupSelectIssues);
		if(status)
			LogEventWithScreenshot("info","Select the Inprogress Issues");
		else
			LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");
		
		// Enter Progress Percentage
		if(StandupProgressPercentage<=100) {
			if (StandupProgressPercentage >= 0) {
				String ProgressPercentage = Integer.toString(StandupProgressPercentage);
				status = SetText("//input[@type='number']", ProgressPercentage);
				if (status)
					LogEventWithScreenshot("info", "Entered Progress Percentage");
			}
			else
				LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");
		}
		else
			LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");
		
		
		// Enter Work Progress Percentage
		status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']",StandupProgressDescription);
		if(status)
			LogEventWithScreenshot("info","Entered Progress Description");
		else
			LogEventWithScreenshot("fail","Unable to enter Progress Description");
		
		
		// Enter Time Spent on the issues
		boolean timeh = StandupTimeSpent.contains("h");
		boolean timed = StandupTimeSpent.contains("d");
		
		if(timeh || timed) {
			status = SetText("//input[@placeholder='Enter Time Spent']",StandupTimeSpent);
			if(status)
				LogEventWithScreenshot("info","Entered Time spent on the issues");
			else
				LogEventWithScreenshot("pass","Unable to enter time spent");
		}
		else
			LogEventWithScreenshot("fail","Unable to enter time spent");
		
		
		// Click on Submit Button
		status = Exist("//button[@type='button'][text()='Submit']");
		if(status)
			LogEventWithScreenshot("info","clicked on submit button");
		else
			LogEventWithScreenshot("fail","unable to click on submit button");
		
		
		
		
		
		
		
		
		
		
		
		Logout();
	}
	
}
