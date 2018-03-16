package test.testcases;

public class StandUpMeeting extends UserLibrary {

	public static void TC61_VerifyStandupMeetingAddWorklogNoHindrancesNoBamdwidth() {

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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// YES worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog YES button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog YES button");

			// NO hindrances 
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[2]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on hindrances NO button");

			// NO Bandwidth 
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on Bandwidth NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on Bandwidth NO button");

			// Stand up Complete msg
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("pass", "Entered Standup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to enter standup meeting");
		}
		Logout();
	}

	public static void TC62_VerifyStandupMeetingNoWorklogNoHindrancesNoBamdwidth() {

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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// No worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog No button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog No button");

			// NO hindrances 
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[2]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on hindrances NO button");

			// NO Bandwidth 
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on Bandwidth NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on Bandwidth NO button");

			// Stand up Complete msg
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("pass", "Entered Standup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to enter standup meeting");
		}
		Logout();
	}

	public static void TC63_VerifyStandupMeetingAddWorklogNoHindrancesAddBandwidth() {
		
	
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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// YES worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog YES button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog YES button");

			// NO hindrances 
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[2]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on hindrances NO button");

			// YES Bandwidth 
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on Bandwidth NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on Bandwidth NO button");

			// Entered Bandwidth hours
			status = SetTextAndTab("//input[@placeholder='for eg : \"please enter available hours\"']",
					SandupBandwidthTime);
			if (status)
				LogEventWithScreenshot("info", "Entered bandwidth hours");
			else
				LogEventWithScreenshot("fail", "Unable to Enter bandwidth hours");
			
			// Complete Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("info", "Stadup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to do standup meeting");
		}
		Logout();
}
	
	public static void TC64_VerifyStandupMeetingNoWorklogNoHindrancesAddBandwidth() {
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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// No worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog No button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog No button");

			// NO hindrances 
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[2]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on hindrances NO button");
		
			
			// YES Bandwidth
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on Bandwidth NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on Bandwidth NO button");

			// Entered Bandwidth hours
			status = SetTextAndTab("//input[@placeholder='for eg : \"please enter available hours\"']",
					SandupBandwidthTime);
			if (status)
				LogEventWithScreenshot("info", "Entered bandwidth hours");
			else
				LogEventWithScreenshot("fail", "Unable to Enter bandwidth hours");

			// Complete Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("info", "Stadup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to do standup meeting");
		}
		Logout();
			
		
		
	}

	public static void TC65_VerifyStandupMeetingAddWorklogAddHindrancesNoBandwidth() {
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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// YES worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog YES button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog YES button");
		
			// Hindrances YES button
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Hindrances YES button");
			else
				LogEventWithScreenshot("fail", "Unable Click Hindrances YES button");

			// Enter Hindrances
			status = SetTextAndTab("//textarea[@placeholder='for eg : \"please enter details\"']", StandupHindrances);
			if (status)
				LogEventWithScreenshot("info", "Enter Hidrances description");
			else
				LogEventWithScreenshot("fail", "Unable Enter Hindrances description");

			// Click Bandwidth No button
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[3]");		
			if (status)
				LogEventWithScreenshot("info", "Click Bandwidth No button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Banwidth No button");

			// Complete Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("info", "Stadup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to do standup meeting");
		}
		Logout();
	}

	public static void TC66_VerifyStandupMeetingNoWorklogAddHindrancesNoBandwidth() {
		
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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// No worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog No button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog No button");

			// Hindrances YES button
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Hindrances YES button");
			else
				LogEventWithScreenshot("fail", "Unable Click Hindrances YES button");

			// Enter Hindrances
			status = SetTextAndTab("//textarea[@placeholder='for eg : \"please enter details\"']", StandupHindrances);
			if (status)
				LogEventWithScreenshot("info", "Enter Hidrances description");
			else
				LogEventWithScreenshot("fail", "Unable Enter Hindrances description");

			// Click Bandwidth No button
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Click Bandwidth No button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Banwidth No button");

			// Complete Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("info", "Stadup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to do standup meeting");
		}
		Logout();
	}

	public static void TC67_VerifyStandupMeetingAddWorklogAddHindrancesAddBandwidth() {
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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// YES worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog YES button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog YES button");
		
			// Hindrances YES button
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Hindrances YES button");
			else
				LogEventWithScreenshot("fail", "Unable Click Hindrances YES button");

			// Enter Hindrances
			status = SetTextAndTab("//textarea[@placeholder='for eg : \"please enter details\"']", StandupHindrances);
			if (status)
				LogEventWithScreenshot("info", "Enter Hidrances description");
			else
				LogEventWithScreenshot("fail", "Unable Enter Hindrances description");

			// YES Bandwidth
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on Bandwidth NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on Bandwidth NO button");

			// Entered Bandwidth hours
			status = SetTextAndTab("//input[@placeholder='for eg : \"please enter available hours\"']",
					SandupBandwidthTime);
			if (status)
				LogEventWithScreenshot("info", "Entered bandwidth hours");
			else
				LogEventWithScreenshot("fail", "Unable to Enter bandwidth hours");

			// Complete Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("info", "Stadup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to do standup meeting");
		}
		Logout();
			
	}
	
	public static void TC68_VerifyStandupMeetingNoWorklogAddHindrancesAddBandwidth() {
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
		 Exist("//p[text()='What issue did you work on yesterday?']");
		/*if (status)
			LogEventWithScreenshot("info", "");
		else
			LogEventWithScreenshot("fail", "info");*/
		 
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click OK button
			status=ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click ok button");
			
			// Enter standup details
			StandupForm();
			
			
			// No worklog yes
			status = ClickElement("(//BUTTON[@type='button'][text()='No'][text()='No'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog No button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog No button");

			// Hindrances YES button
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Hindrances YES button");
			else
				LogEventWithScreenshot("fail", "Unable Click Hindrances YES button");

			// Enter Hindrances
			status = SetTextAndTab("//textarea[@placeholder='for eg : \"please enter details\"']", StandupHindrances);
			if (status)
				LogEventWithScreenshot("info", "Enter Hidrances description");
			else
				LogEventWithScreenshot("fail", "Unable Enter Hindrances description");
			
			// YES Bandwidth
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'][text()='Yes'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on Bandwidth NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on Bandwidth NO button");

			// Entered Bandwidth hours
			status = SetTextAndTab("//input[@placeholder='for eg : \"please enter available hours\"']",
					SandupBandwidthTime);
			if (status)
				LogEventWithScreenshot("info", "Entered bandwidth hours");
			else
				LogEventWithScreenshot("fail", "Unable to Enter bandwidth hours");

			// Complete Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				LogEventWithScreenshot("info", "Stadup meeting completed");
			else
				LogEventWithScreenshot("fail", "Unable to do standup meeting");
		}
		Logout();
	}
	public static void StandupForm() {
		Boolean status;
		// Enter Progress Percentage
		status = SetText("//INPUT[@type='number']", StandupProgressPercentage);
		if (status)
			LogEventWithScreenshot("info", "Enter Progress pecentage");
		else
			LogEventWithScreenshot("fail", "Unable to enter Progress pecentage");

		// Progress Description
		status = SetText("//TEXTAREA[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
		if (status)
			LogEventWithScreenshot("info", "Enter Progress description");
		else
			LogEventWithScreenshot("fail", "Unable to enter Progress description");

		status = SetText("(//INPUT[@type='text'])[1]", StandupTimeSpent);
		if (status)
			LogEventWithScreenshot("info", "Enter Time Spent");
		else
			LogEventWithScreenshot("fail", "Unable to enter Time Spent");

		// Click on Submit Button
		status = ClickElement("//button[@type='button'][text()='Submit']");
		if (status)
			LogEventWithScreenshot("info", "clicked on submit button");
		else
			LogEventWithScreenshot("fail", "unable to click on submit button");
	}
}
