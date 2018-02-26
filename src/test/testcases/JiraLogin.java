package test.testcases;

public class JiraLogin extends UserLibrary {

	public static void TC10_VerifyJiraLogin() {

		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter jira login Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", JiraConfigureCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Jira configure Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter jira configure Command");
		// If jira is already configured for a existing user then it will execute below
		// code.
		status = Exist("//P[text()='You already have jira configured wanna reconfigure it ?']");
		if (status) {
			// if already configured it will ask wanna recofigure it enter yes or no.
			status = Exist("//P[text()='You already have jira configured wanna reconfigure it ?']");
			// Enter yes.
			if (status) {
				status = SetTextAndEnter("//input[@class='wc-shellinput']", YES);
				if (status)
					LogEventWithScreenshot("info", "Entered yes");
				else
					LogEventWithScreenshot("fail", "Unable to Enter yes");
				// Fills the jira login form
				JiraFormValue();
				// If given credentials are valid it will display the below message.
				status = Exist("//P[text()='Thank’s for your Jira Creds!']");
				if (status)
					LogEventWithScreenshot("info", "Jira login successfull");
				// If given credentials are not valid it will display the below message.
				status = Exist("//P[text()='The Jira Credentials details dont seem to work! Wanna try again ?']");
				if (status)
					LogEventWithScreenshot("info", "Entered wrong details so failed to login and TC is passed");
			}
		}
		// If jira is configured to a new user for the first time then it will execute
		// below code.

		else {
			JiraFormValue();
			// If given credentials are valid it will display the below message.
			status = Exist("//P[text()='Thank’s for your Jira Creds!']");
			if (status)
				LogEventWithScreenshot("info", "Jira login successfull");
			// If given credentials are not valid it will display the below message.
			status = Exist("//P[text()='The Jira Credentials details dont seem to work! Wanna try again ?']");
			if (status)
				LogEventWithScreenshot("info", "Entered wrong details so failed to login and TC is passed");
			else
				LogEventWithScreenshot("fail", "Entered worng details and still allow user to login");

		}
		Logout();
	}

	

	public static void JiraFormValue() {

		boolean status;
		status = SetText("//input[@placeholder='https://your-jira-host-url']", JiraURL);
		if (status)
			LogEventWithScreenshot("info", "Enter jira host url");
		else
			LogEventWithScreenshot("fail", "Unable to enter");

		status = SetText("//input[@placeholder='Username']", JiraEmail);
		if (status)
			LogEventWithScreenshot("info", "Enter Jira Email");
		else
			LogEventWithScreenshot("fail", "Unable to enter Jira Email");

		status = SetText("//input[@placeholder='Password']", JiraPassword);
		if (status)
			LogEventWithScreenshot("info", "Enter Jira Password");
		else
			LogEventWithScreenshot("fail", "Unable to enter Jira password");

		status = ClickElement("//button[@class= 'ac-pushButton']");
		if (status)
			LogEventWithScreenshot("info", "Clicked on Submit button");
		else
			LogEventWithScreenshot("fail", "Unable to click on submit button");
	}
}
