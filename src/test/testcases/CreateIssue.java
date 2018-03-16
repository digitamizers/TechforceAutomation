package test.testcases;

import org.openqa.selenium.By;

public class CreateIssue extends UserLibrary {

	
	public static void TC51_VerifyCreateIssuesAddSprint() {

		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display home page");

		// Enter Create issue command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Create Issue Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Issue Command");

		// Select Project
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", CreateIssueProject);
		if (status)
			LogEventWithScreenshot("info", "Select the Project");
		else
			LogEventWithScreenshot("fail", "Unable to select project");

		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[1]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");

		// Select the create issue type
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]", CreateIssueType);
		if (status)
			LogEventWithScreenshot("info", "Select the Issue type");
		else
			LogEventWithScreenshot("fail", "Unable to select Issue type");

		// Click Ok button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[2]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");

		// Enter Issue summary
		status = SetText("//input[@placeholder='enter summary']", CreateIssueSummary);
		if (status)
			LogEventWithScreenshot("info", "Enter Summary");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Summary");

		// Enter Time spent
		status = SetText("//input[@placeholder='for eg \"2d\"\']", CreateIssueTimeSpent);
		if (status)
			LogEventWithScreenshot("info", "Enter Time Spent");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Time Spent");

		// submit
		status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
		if (status)
			LogEventWithScreenshot("info", "Click submit button");
		else
			LogEventWithScreenshot("fail", "Unable to click submit button");

		// Select User
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[3]", CreateIssueSelectUser);
		if (status)
			LogEventWithScreenshot("info", "Select the user");
		else
			LogEventWithScreenshot("fail", "Unable to select user");

		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[3]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");

		// Add Sprint
		status = ClickElement("//BUTTON[@type='button'][text()='Yes']");
		if (status) {
			LogEventWithScreenshot("info", "Click YES button");
			// Select Board
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[4]", CreateIssueSelectBoard);
			if (status)
				LogEventWithScreenshot("info", "Select the board");
			else
				LogEventWithScreenshot("fail", "Unable to select board");
			// Click OK button
			status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[4]");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click OK button");

			// Select Sprint
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[5]",
					CreateIssueSelectSprint);
			if (status)
				LogEventWithScreenshot("info", "Select the board");
			else
				LogEventWithScreenshot("fail", "Unable to select board");
			// Click OK button
			status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[5]");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click OK button");

			// Complete Msg
			status = Exist("//P[contains(text(),'successfully')]");
			if (status)
				LogEventWithScreenshot("info", "create issue successfull");
			else
				LogEventWithScreenshot("fail", "Unable to create issue");
			
			String textmsg = driver.findElement(By.xpath("(//div[@class='format-markdown']/p)[2]")).getText();
			System.out.println(CreateIssueKey);
			String[] words = textmsg.split(" ");
			String tc = words[3];
			CreateIssueKey = tc.substring(1, words[3].length()-1);
			
			System.out.println(CreateIssueKey);
		} else {
				LogEventWithScreenshot("fail", "Unable to click YES  button");
		}
        Logout();
		
		wait(20);
		
		VerifyJiraCreateIssues();
		
	}

	public static void TC52_VerifyCreateIssuesNoSprint() {

		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display home page");

		// Enter Create issue command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Create Issue Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Issue Command");

		// Select Project
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", CreateIssueProject);
		if (status)
			LogEventWithScreenshot("info", "Select the Project");
		else
			LogEventWithScreenshot("fail", "Unable to select project");

		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[1]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");

		// Select the create issue type
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]", CreateIssueType);
		if (status)
			LogEventWithScreenshot("info", "Select the Issue type");
		else
			LogEventWithScreenshot("fail", "Unable to select Issue type");

		// Click Ok button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[2]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");

		// Enter Issue summary
		status = SetText("//input[@placeholder='enter summary']", CreateIssueSummary);
		if (status)
			LogEventWithScreenshot("info", "Enter Summary");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Summary");

		// Enter Time spent
		status = SetText("//input[@placeholder='for eg \"2d\"\']", CreateIssueTimeSpent);
		if (status)
			LogEventWithScreenshot("info", "Enter Time Spent");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Time Spent");

		// submit
		status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
		if (status)
			LogEventWithScreenshot("info", "Click submit button");
		else
			LogEventWithScreenshot("fail", "Unable to click submit button");

		// Select User
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[3]", CreateIssueSelectUser);
		if (status)
			LogEventWithScreenshot("info", "Select the user");
		else
			LogEventWithScreenshot("fail", "Unable to select user");

		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[3]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");

		// No Sprint
		status = ClickElement("//BUTTON[@type='button'][text()='No']");
		if (status) {
			LogEventWithScreenshot("info", "Click No button");
			// Complete Msg
			status = Exist("//P[contains(text(),'successfully')]");
			if (status)
				LogEventWithScreenshot("info", "create issue successfull");
			else
				LogEventWithScreenshot("fail", "Unable to create issue");
			
			String textmsg = driver.findElement(By.xpath("(//div[@class='format-markdown']/p)[2]")).getText();
			System.out.println(CreateIssueKey);
			String[] words = textmsg.split(" ");
			String tc = words[3];
			CreateIssueKey = tc.substring(1, words[3].length()-1);
			
			System.out.println(CreateIssueKey);
			
		} else {
			LogEventWithScreenshot("fail", "Unable to click NO button");
		}
		
		Logout();
		
		wait(20);
		
		VerifyJiraCreateIssues();
	}

	public static void TC53_VerifyCreateIssueForUserAddSprint() {
		
		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display home page");

		// Enter Create issue command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Create Issue Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Issue Command");

		// Select Project
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", CreateIssueProject);
		if (status)
			LogEventWithScreenshot("info", "Select the Project");
		else
			LogEventWithScreenshot("fail", "Unable to select project");

		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[1]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");
	
		// Enter Issue summary
		status = SetText("//input[@placeholder='enter summary']", CreateIssueSummary);
		if (status)
			LogEventWithScreenshot("info", "Enter Summary");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Summary");

		// Enter Time spent
		status = SetText("//input[@placeholder='for eg \"2d\"\']", CreateIssueTimeSpent);
		if (status)
			LogEventWithScreenshot("info", "Enter Time Spent");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Time Spent");

		// submit
		status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
		if (status)
			LogEventWithScreenshot("info", "Click submit button");
		else
			LogEventWithScreenshot("fail", "Unable to click submit button");
		
		// Click YES button
		status = ClickElement("//BUTTON[@type='button'][text()='Yes']");
		if (status) {
			LogEventWithScreenshot("info", "Click YES button");
			// Select Board
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[2]", CreateIssueSelectBoard);
			if (status)
				LogEventWithScreenshot("info", "Select the board");
			else
				LogEventWithScreenshot("fail", "Unable to select board");
			// Click OK button
			status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[2]");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click OK button");

			// Select Sprint
			status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[3]",
					CreateIssueSelectSprint);
			if (status)
				LogEventWithScreenshot("info", "Select the board");
			else
				LogEventWithScreenshot("fail", "Unable to select board");
			// Click OK button
			status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[3]");
			if (status)
				LogEventWithScreenshot("info", "Click Ok button");
			else
				LogEventWithScreenshot("fail", "Unable to click OK button");

			// Complete Msg
			status = Exist("//P[contains(text(),'successfully')]");
			if (status)
				LogEventWithScreenshot("info", "create issue successfull");
			else
				LogEventWithScreenshot("fail", "Unable to create issue");
			
			String textmsg = driver.findElement(By.xpath("(//div[@class='format-markdown']/p)[2]")).getText();
			System.out.println(CreateIssueKey);
			String[] words = textmsg.split(" ");
			String tc = words[3];
			CreateIssueKey = tc.substring(1, words[3].length()-1);
			
			System.out.println(CreateIssueKey);
		} else {
			LogEventWithScreenshot("fail", "Unable to click YES  button");
		}
		
		Logout();
		
		wait(20);
		
		VerifyJiraCreateIssues();
	}

	public static void TC54_VerifyCreateIssueForUserNoSprint() {
		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display home page");

		// Enter Create issue command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Create Issue Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Issue Command");

		// Select Project
		status = SelectOPtionByText("(//SELECT[@class='ac-input ac-multichoiceInput'])[1]", CreateIssueProject);
		if (status)
			LogEventWithScreenshot("info", "Select the Project");
		else
			LogEventWithScreenshot("fail", "Unable to select project");

		// Click OK button
		status = ClickElement("(//BUTTON[@type='button'][text()='Ok'][text()='Ok'])[1]");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click OK button");
	
		// Enter Issue summary
		status = SetText("//input[@placeholder='enter summary']", CreateIssueSummary);
		if (status)
			LogEventWithScreenshot("info", "Enter Summary");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Summary");

		// Enter Time spent
		status = SetText("//input[@placeholder='for eg \"2d\"\']", CreateIssueTimeSpent);
		if (status)
			LogEventWithScreenshot("info", "Enter Time Spent");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Time Spent");

		// submit
		status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
		if (status)
			LogEventWithScreenshot("info", "Click submit button");
		else
			LogEventWithScreenshot("fail", "Unable to click submit button");
		
		// No Sprint
		status = ClickElement("//BUTTON[@type='button'][text()='No']");
		if (status) {
			LogEventWithScreenshot("info", "Click No button");
			// Complete Msg
			status = Exist("//P[contains(text(),'successfully')]");
			if (status)
				LogEventWithScreenshot("info", "create issue successfull");
			else
				LogEventWithScreenshot("fail", "Unable to create issue");
			
			String textmsg = driver.findElement(By.xpath("(//div[@class='format-markdown']/p)[2]")).getText();
			System.out.println(CreateIssueKey);
			String[] words = textmsg.split(" ");
			String tc = words[3];
			CreateIssueKey = tc.substring(1, words[3].length()-1);
			
			System.out.println(CreateIssueKey);

		} else {
			LogEventWithScreenshot("fail", "Unable to click NO button");
		}
		
		Logout();
		
		wait(20);
		
		VerifyJiraCreateIssues();
	}
	
	public static void VerifyJiraCreateIssues() {
		
		boolean status;
		status = JiraLogin(JiraURL,JiraEmail, JiraPassword);
		if(status)
			LogEventWithScreenshot("pass","Jira Login successfull");
		else
			LogEventWithScreenshot("fail","Unable to login Jira");
			
		wait(10);
		
		status = ClickElement("(//BUTTON[@type='button'])[1]");
		if(status)
			LogEventWithScreenshot("info","Click On search box");
		else
			LogEventWithScreenshot("fail","Unable to click on search box");
		
		status = SetText("//INPUT[@type='text']",CreateIssueKey );
		if(status)
			LogEventWithScreenshot("info","Enter search issues Key");
		else
			LogEventWithScreenshot("pass","Unable to enter search issue key");
		wait(5);
		System.out.println(driver.findElement(By.xpath("(//A[@aria-disabled='false'])[5]")).getText());
		
		status = Exist("(//A[@aria-disabled='false'])[5]");
		if(status)
			LogEventWithScreenshot("info","Issue Present in Jira ");
		else
			LogEventWithScreenshot("fail","Issue not present");
		
		
		status = ClickElement("//div[@class='fBQmCr']");
		if(status)
			LogEventWithScreenshot("info","Click on Arrow button");
		else
			LogEventWithScreenshot("fail","Unable to click on arrow button");
		
		JiraLogout();
	}
	
	
}
