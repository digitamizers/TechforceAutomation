package test.testcases;

public class StandUpMeeting extends UserLibrary {

	/*public static void TC61_VerifyStandupMeeting() {

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
		if (status)
			LogEventWithScreenshot("info", "info");
		else
			LogEventWithScreenshot("fail", "info");

		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		} else {
			// Select the in progress issues
			status = SelectOPtionByValue("//select[class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Click Ok button
			status = ClickElement("//BUTTON[@type='button'][text()='Ok']");
			if (status)
				LogEventWithScreenshot("info", "Click on Button");
			else
				LogEventWithScreenshot("fail", "Unable to click on button");

			// Enter Progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");

			// Enter Work Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered Progress Description");
			else
				LogEventWithScreenshot("fail", "Unable to enter Progress Description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered Time spent on the issues");
				else
					LogEventWithScreenshot("pass", "Unable to enter time spent");
			} else
				LogEventWithScreenshot("fail", "Unable to enter time spent");

			// Click on Submit Button
			status = Exist("//button[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "clicked on submit button");
			else
				LogEventWithScreenshot("fail", "unable to click on submit button");

			// add worklog YES button
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'])[1]");
			if (status)
				LogEventWithScreenshot("info", "Click on YES button");
			else {
				status = ClickElement("(//BUTTON[@type='button'][text()='No'])[1]");
				if (status)
					LogEventWithScreenshot("info", "Click on NO button");
				else {
					LogEventWithScreenshot("fail", "Unable to click on YES or NO buttons");
				}
			}

			// add hindrances
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'])[2]");
			if (status) {
				LogEventWithScreenshot("info", "Click on YES button");

				status = SetText("(//TEXTAREA[@class='ac-input ac-textInput ac-multiline'])[2]", StandupHindrances);
				if (status)
					LogEventWithScreenshot("info", "Enter the hindrances");
				else
					LogEventWithScreenshot("fail", "Unable to enter hindrances");

				status = ClickElement("(//BUTTON[@type='button'][text()='OK'][text()='OK'])[1]");
				if (status)
					LogEventWithScreenshot("info", "Click on Button");
				else
					LogEventWithScreenshot("fail", "Unable to click on button");
			} else {
				status = ClickElement("(//BUTTON[@type='button'][text()='No'])[2]");
				if (status)
					LogEventWithScreenshot("info", "Click on NO button");
				else {
					LogEventWithScreenshot("fail", "Unable to click on YES or NO buttons");
				}
			}

			// add band width
			status = ClickElement("(//BUTTON[@type='button'][text()='Yes'])[3]");
			if (status) {
				LogEventWithScreenshot("info", "Click on YES button");

				status = SetText("(//INPUT[@type='text'])[2]", SandupBandwidthTime);
				if (status)
					LogEventWithScreenshot("info", "Enter the hindrances");
				else
					LogEventWithScreenshot("fail", "Unable to enter hindrances");

				status = ClickElement("(//BUTTON[@type='button'][text()='OK'][text()='OK'])[2]");
				if (status)
					LogEventWithScreenshot("info", "Click on Button");
				else
					LogEventWithScreenshot("fail", "Unable to click on button");
			} else {
				status = ClickElement("(//BUTTON[@type='button'][text()='No'])[3]");
				if (status)
					LogEventWithScreenshot("info", "Click on NO button");
				else {
					LogEventWithScreenshot("fail", "Unable to click on YES or NO buttons");
				}
			}

		}
*/
	/*public static void TC61_VerifyStandupMeetingAddWorklogNoHindrancesNoBamdwidth() {

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
		if (status)
			LogEventWithScreenshot("info", "info");
		else
			LogEventWithScreenshot("fail", "info");

		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByValue("//select[class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Enter Progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");

			// Enter Work Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered Progress Description");
			else
				LogEventWithScreenshot("fail", "Unable to enter Progress Description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered Time spent on the issues");
				else
					LogEventWithScreenshot("pass", "Unable to enter time spent");
			} else
				LogEventWithScreenshot("fail", "Unable to enter time spent");

			// Click on Submit Button
			status = Exist("//button[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "clicked on submit button");
			else
				LogEventWithScreenshot("fail", "unable to click on submit button");

			// Add worklog yes
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog YES button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog YES button");

			// Any hindrances No
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on hindrances NO button");

			// Any Bandwidth
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[9]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
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

	public static void TC62_VerifyStandupMeetingAddWorklogNoHindrancesAddBandwidth() {

		boolean status;
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Stand up command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");

		//
		status = Exist("//p[text()='What issue did you work on yesterday?']");
		if (status)
			LogEventWithScreenshot("info", "info");
		else
			LogEventWithScreenshot("fail", "info");
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the In progress Issue
			status = SelectOPtionByValue("//select[@class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Selected In progress Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select In progress");

			// Click OK button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button after selecting Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Click Ok button after selecting Issue");

			// Enter The Work progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");

			// Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered work progress description");
			else
				LogEventWithScreenshot("fail", "Unable to Entered work progress description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered time spent on the issue");
				else
					LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");

			// Click submit button
			status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "Click on Submit button");
			else
				LogEventWithScreenshot("fail", "Unable to click on submit button");

			// Click Add Worklog YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "If u add worklog click YES button");
			else
				LogEventWithScreenshot("fail", "Unable to click worklog YES button");

			// Click Hindrances NO button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "Click Hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Hindrances No button");

			// Click Bandwidth YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[9]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Bandwidth YES button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Bandwidth YES button");

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

	public static void TC63_VerifyStandupMeetingAddWorklogAddHindrancesNoBandwidth() {

		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Stand up command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");

		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the In progress Issue
			status = SelectOPtionByValue("//select[@class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Selected In progress Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select In progress");

			// Click OK button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button after selecting Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Click Ok button after selecting Issue");

			// Enter The Work progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");

			// Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered work progress description");
			else
				LogEventWithScreenshot("fail", "Unable to Entered work progress description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered time spent on the issue");
				else
					LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");

			// Click submit button
			status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "Click on Submit button");
			else
				LogEventWithScreenshot("fail", "Unable to click on submit button");

			// Click Add Worklog YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "click add worklog YES button");
			else
				LogEventWithScreenshot("fail", "Unable to click worklog YES button");

			// Hindrances YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
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
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[10]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
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

	}*/

/*	public static void TC64_VerifyStandupMeetingAddWorklogAddHindrancesAddBandwidth() {

		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Stand up command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");

		// No In progress Issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}	
		else {
			// Select the In progress Issue
			status = SelectOPtionByValue("//select[@class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Selected In progress Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select In progress");

			// Click OK button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button after selecting Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Click Ok button after selecting Issue");

			// Enter The Work progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");

			// Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered work progress description");
			else
				LogEventWithScreenshot("fail", "Unable to Entered work progress description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered time spent on the issue");
				else
					LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");

			// Click submit button
			status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "Click on Submit button");
			else
				LogEventWithScreenshot("fail", "Unable to click on submit button");

			// Click Add Worklog YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "click add worklog YES button");
			else
				LogEventWithScreenshot("fail", "Unable to click worklog YES button");

			// Hindrances YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
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

			// Click Bandwidth YES Button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[10]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Bandwidth YES button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Bandwidth YES button");
			// Bandwidth hours
			status = SetTextAndTab("//input[@placeholder='for eg : \"please enter available hours\"']",
					SandupBandwidthTime);
			if (status)
				System.out.println("Enter bandwidth  hours");
			else
				System.out.println("unable to enter bandwidth hours");

			// Compled Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				System.out.println("Stadup meeting completed");
			else
				System.out.println("Unable to do standup meeting");
		}

		Logout();

	}
*//*
	public static void TC65_VerifyStatndupMeetingNoWorklogNoHindrancesNOBandwidth() {

		
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
		if (status)
			LogEventWithScreenshot("info", "info");
		else
			LogEventWithScreenshot("fail", "info");

		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the in progress issues
			status = SelectOPtionByValue("//select[class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Select the Inprogress Issues");
			else
				LogEventWithScreenshot("fail", "Unable to Select to Inprogres issues");

			// Enter Progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to enter Progress Percentage");

			// Enter Work Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered Progress Description");
			else
				LogEventWithScreenshot("fail", "Unable to enter Progress Description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered Time spent on the issues");
				else
					LogEventWithScreenshot("pass", "Unable to enter time spent");
			} else
				LogEventWithScreenshot("fail", "Unable to enter time spent");

			// Click on Submit Button
			status = Exist("//button[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "clicked on submit button");
			else
				LogEventWithScreenshot("fail", "unable to click on submit button");

			// Add worklog No
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on worklog NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on worklog NO button");

			// Any hindrances No
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "Clicked on hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to clicked on hindrances NO button");

			// Any Bandwidth
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[9]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
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

	public static void TC66_VerifyStandupMeetingNoWorklogNoHindrancesAddBandwidth() {
		boolean status;
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Stand up command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");

		//
		status = Exist("//p[text()='What issue did you work on yesterday?']");
		if (status)
			LogEventWithScreenshot("info", "info");
		else
			LogEventWithScreenshot("fail", "info");
		
		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the In progress Issue
			status = SelectOPtionByValue("//select[@class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Selected In progress Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select In progress");

			// Click OK button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button after selecting Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Click Ok button after selecting Issue");

			// Enter The Work progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");

			// Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered work progress description");
			else
				LogEventWithScreenshot("fail", "Unable to Entered work progress description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered time spent on the issue");
				else
					LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");

			// Click submit button
			status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "Click on Submit button");
			else
				LogEventWithScreenshot("fail", "Unable to click on submit button");

			// Click Add Worklog NO button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "If u add worklog click NO button");
			else
				LogEventWithScreenshot("fail", "Unable to click worklog NO button");

			// Click Hindrances NO button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "Click Hindrances NO button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Hindrances No button");

			// Click Bandwidth YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[9]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Bandwidth YES button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Bandwidth YES button");

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

	public static void TC67_VerifyStandupMeetingNoWorklogAddHindrancesNoBandwidth() {
		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Stand up command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");

		// No In Progress issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}
		else {
			// Select the In progress Issue
			status = SelectOPtionByValue("//select[@class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Selected In progress Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select In progress");

			// Click OK button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button after selecting Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Click Ok button after selecting Issue");

			// Enter The Work progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");

			// Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered work progress description");
			else
				LogEventWithScreenshot("fail", "Unable to Entered work progress description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered time spent on the issue");
				else
					LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");

			// Click submit button
			status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "Click on Submit button");
			else
				LogEventWithScreenshot("fail", "Unable to click on submit button");

			// Click Add Worklog No button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "click add worklog NO button");
			else
				LogEventWithScreenshot("fail", "Unable to click worklog No button");

			// Hindrances YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
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
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[10]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
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

	public static void TC68_VerifyStandupMeetingNoWorklogAddHindrancesAddBandwidth() {
		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Stand up command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Standup meeting command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Standup meeting command");

		// No In progress Issues
		status = Exist("//P[text()='I think you dont have any Inprogress Issues']");
		if (status) {
			LogEventWithScreenshot("pass", "I think you dont have any Inprogress Issues");
		}	
		else {
			// Select the In progress Issue
			status = SelectOPtionByValue("//select[@class='ac-input ac-multichoiceInput']", StandupSelectIssues);
			if (status)
				LogEventWithScreenshot("info", "Selected In progress Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Select In progress");

			// Click OK button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button after selecting Issue");
			else
				LogEventWithScreenshot("fail", "Unable to Click Ok button after selecting Issue");

			// Enter The Work progress Percentage
			if (StandupProgressPercentage <= 100) {
				if (StandupProgressPercentage >= 0) {
					String ProgressPercentage = Integer.toString(StandupProgressPercentage);
					status = SetText("//input[@type='number']", ProgressPercentage);
					if (status)
						LogEventWithScreenshot("info", "Entered Progress Percentage");
				} else
					LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered Progress Percentage");

			// Progress Description
			status = SetText("//textarea[@class='ac-input ac-textInput ac-multiline']", StandupProgressDescription);
			if (status)
				LogEventWithScreenshot("info", "Entered work progress description");
			else
				LogEventWithScreenshot("fail", "Unable to Entered work progress description");

			// Enter Time Spent on the issues
			boolean timeh = StandupTimeSpent.contains("h");
			boolean timed = StandupTimeSpent.contains("d");

			if (timeh || timed) {
				status = SetText("//input[@placeholder='Enter Time Spent']", StandupTimeSpent);
				if (status)
					LogEventWithScreenshot("info", "Entered time spent on the issue");
				else
					LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");
			} else
				LogEventWithScreenshot("fail", "Unable to Entered time spent on the issue");

			// Click submit button
			status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
			if (status)
				LogEventWithScreenshot("info", "Click on Submit button");
			else
				LogEventWithScreenshot("fail", "Unable to click on submit button");

			// Click Add Worklog NO button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[2]");
			if (status)
				LogEventWithScreenshot("info", "click add worklog No button");
			else
				LogEventWithScreenshot("fail", "Unable to click worklog NO button");

			// Hindrances YES button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
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

			// Click Bandwidth YES Button
			status = ClickElement(
					"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[10]/div[1]/div/div/div[2]/div/div/div[3]/div[1]/div/button[1]");
			if (status)
				LogEventWithScreenshot("info", "Click Bandwidth YES button");
			else
				LogEventWithScreenshot("fail", "Unable to Click Bandwidth YES button");
			// Bandwidth hours
			status = SetTextAndTab("//input[@placeholder='for eg : \"please enter available hours\"']",
					SandupBandwidthTime);
			if (status)
				System.out.println("Enter bandwidth  hours");
			else
				System.out.println("unable to enter bandwidth hours");

			// Compled Message
			status = Exist("//P[text()='Thank you for completing your standup. See you tomorrow!']");
			if (status)
				System.out.println("Stadup meeting completed");
			else
				System.out.println("Unable to do standup meeting");
		}

		Logout();
	}

*/}
