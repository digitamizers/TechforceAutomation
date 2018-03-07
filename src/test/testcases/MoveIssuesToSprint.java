package test.testcases;

public class MoveIssuesToSprint extends UserLibrary {
	
	public static void TC131_VerifyMoveIssuesToSprint() {
		
		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Assignee Issues Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", MoveIssueToSprintCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Move Issues Sprint  Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Move Issues Sprint Command");
		

		// Select board
		status = SelectOPtionByText("//SELECT[@class='ac-input ac-multichoiceInput']", MoveIssueToSprintBoard);
		if (status)
			LogEventWithScreenshot("info", "Select the board");
		else
			LogEventWithScreenshot("fail", "Unable to Select the board");
		
		// Select board OK button
		status = ClickElement("//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Click board OK button");
		else
			LogEventWithScreenshot("pass", "Unable to Click board OK button");
		
		
		// Select Sprint
		status = SelectOPtionByText("//SELECT[@class='ac-input ac-multichoiceInput']", MoveIssueToSprintBoradSprint);
		if (status)
			LogEventWithScreenshot("info", "Select the board sprint");
		else
			LogEventWithScreenshot("fail", "Unable to Select the board sprint");

		// Select Sprint OK button
		status = ClickElement("//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Click Sprint OK button");
		else
			LogEventWithScreenshot("pass", "Unable to Click Sprint OK button");
		
		
		// Select the Types of issues
		String MoveIssuesToSprint = new String(MoveIssuesToSprintIssues);
		String MoveIssues[] = MoveIssuesToSprint.split(",");

		for (String Type : MoveIssues) {
			// System.out.println(Type);
			status = ClickElement("//input[@value='" + Type + "']");
			if (status)
				LogEventWithScreenshot("info", "Clicked on " + Type + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Type + " checkbox");
		}
		
		// 
		status = ClickElement("//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Click board OK button");
		else
			LogEventWithScreenshot("pass", "Unable to Click board OK button");
		
		
		// Success message
		status = Exist("//P[text()='Issues are added to sprint successfully!']");
		if(status)
			LogEventWithScreenshot("pass","Move Issue to sprint successfully");
		else
			LogEventWithScreenshot("fail","Unable to Move Issue to sprint successfully");
		
		Logout();
	}

}
