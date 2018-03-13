package test.testcases;

public class SearchIssues extends UserLibrary {
	
	public static void TC21_VerifySearchIssuesBySummary() {

		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", SearchIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Search Issue command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter  Search Issues command");

		// select summary check box
		/*
		 * status = ClickElement("//input[@value='Summary']"); if(status)
		 * LogEventWithScreenshot("info", "Clicked on summary checkbox"); else
		 * LogEventWithScreenshot("fail", "Unable to click on summary checkbox");
		 * 
		 * status = ClickElement("//input[@value='Summary']"); if(status)
		 * LogEventWithScreenshot("info", "Clicked on summary checkbox"); else
		 * LogEventWithScreenshot("fail", "Unable to click on summary checkbox");
		 */

		status = ClickElement("//button[@type='button'][text()='OK']");
		if (status)
			LogEventWithScreenshot("info", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");

		// Enter search keyword
		status = SetTextAndTab("//input[@class='ac-input ac-textInput']", SearchKeyword);
		if (status)
			LogEventWithScreenshot("info", "Enter Summary Keyword");
		else
			LogEventWithScreenshot("fail", "Unable to enter summary keyword");

		// Select the Types of issues
		String TypeOfIssue = new String(SearchIssueType);
		String IssueType[] = TypeOfIssue.split(",");

		for (String Type : IssueType) {
			// System.out.println(Type);
			status = ClickElement("//input[@value='" + Type + "']");
			if (status)
				LogEventWithScreenshot("info", "Clicked on " + Type + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Type + " checkbox");
		}

		// Clicked on OK button after select issues type
		status = ClickElement(
				"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");

		// Select the Status of issues
		String StatusOfIssue = new String(SearchIssueStatus);
		String IssueStatus[] = StatusOfIssue.split(",");

		for (String Status : IssueStatus) {
			// System.out.println(temp);
			status = ClickElement("//input[@value='" + Status + "']");
			if (status)
				LogEventWithScreenshot("info", "Clicked on " + Status + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Status + " checkbox");
		}

		// Clicked on OK button after select issues status
		status = ClickElement(
				"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");
		
		
		status = Exist("//p[text()='These are the Issues that you are looking for']");
		if(status) {		
			// Click on chat window button
			status=ClickElement("//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
			if (status)
				LogEventWithScreenshot("pass", "Close the Chat window");
			else
				LogEventWithScreenshot("fail", "Unable to close the chat window");
			
			LogEventWithScreenshot("pass", "Issues displyed");
		}
		
		Logout();
	}

/*##################################################################################
 * Method Name: TC22_VerifySearchIssuesByAssignee()
 * Description: 
 * Input parameters: 
 * Output: 
 *###################################################################################
 */
	public static void TC22_VerifySearchIssuesByAssignee() {

		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");
		
		// Enter command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", SearchIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Search Issue command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter  Search Issues command");
		
		// select Assignee check box
		status = ClickElement("//input[@value='Assignee']");
		if (status)
			LogEventWithScreenshot("info", "Clicked on Assignee checkbox");
		else
			LogEventWithScreenshot("fail", "Unable to click on Assignee checkbox");
		
		status = ClickElement("//input[@value='Summary']"); 
		if(status)
			 LogEventWithScreenshot("info", "Clicked on summary checkbox"); 
		else
			 LogEventWithScreenshot("fail", "Unable to click on summary checkbox");
	
		// Click on OK button
		status = ClickElement("//button[@type='button'][text()='OK']");
		if (status)
			LogEventWithScreenshot("info", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");
		
		
		// Select the Developers
		String SelectDevelopres = new String(SearchIssueDeveloper);
		String Developers[] = SelectDevelopres.split(",");

		for (String Type : Developers) {
			// System.out.println(Type);
			status = ClickElement("//input[@value='" + Type + "']");
			if (status)
				LogEventWithScreenshot("info", "Clicked on " + Type + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Type + " checkbox");
		}
		
		// Click on OK button
		status = ClickElement("//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");

		// Select the Issue Type
		String TypeOfIssue = new String(SearchIssueType);
		String IssueType[] = TypeOfIssue.split(",");
		for (String Type : IssueType) {
			// System.out.println(Type);
			status = ClickElement("//input[@value='" + Type + "']");
			if (status)
				LogEventWithScreenshot("info", "Clicked on " + Type + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Type + " checkbox");
		}
		
		// Click on OK button
		status = ClickElement("//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[6]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");

		
		// Select the Status of issues
		String StatusOfIssue = new String(SearchIssueStatus);
		String IssueStatus[] = StatusOfIssue.split(",");

		for (String Status : IssueStatus) {
			// System.out.println(temp);
			status = ClickElement("//input[@value='" + Status + "']");
			if (status)
				LogEventWithScreenshot("info", "Clicked on " + Status + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Status + " checkbox");
		}

		// Clicked on OK button after select issues status
		status = ClickElement(
				"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");

		
		status = Exist("//p[text()='These are the Issues that you are looking for']");
		if(status) {		
			// Click on chat window button
			status=ClickElement("//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
			if (status)
				LogEventWithScreenshot("pass", "Close the Chat window");
			else
				LogEventWithScreenshot("fail", "Unable to close the chat window");
			
			LogEventWithScreenshot("pass", "Issues displyed");
		}
		else{
			LogEventWithScreenshot("","");
		}
		Logout();
	}

	
	public static void TC23_VerifySearchIssuesBySummaryAndAssignee() {
		
		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");
		
		// Enter command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", SearchIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Search Issue command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter  Search Issues command");
		
		// Select Assignee
		status = ClickElement("//input[@value='Assignee']");
		if (status)
			LogEventWithScreenshot("info","Clicked on Assignee checkbox");
		else
			LogEventWithScreenshot("fail", "Unable to click on Assignee checkbox");

		// Click on OK button
		status = ClickElement("//button[@type='button'][text()='OK']");
		if (status)
			LogEventWithScreenshot("info","Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");

		// Enter search keyword
		status = SetTextAndTab("//input[@class='ac-input ac-textInput']", SearchKeyword);
		if (status)
			LogEventWithScreenshot("info","Enter Summary Keyword");
		else
			LogEventWithScreenshot("fail", "Unable to enter summary keyword");
		
		

		// Select the Developers
		String SelectDevelopres = new String(SearchIssueDeveloper);
		String Developers[] = SelectDevelopres.split(",");

		for (String Type : Developers) {
			// System.out.println(Type);
			status = ClickElement("//input[@value='" + Type + "']");
			if (status)
				LogEventWithScreenshot("info","Clicked on " + Type + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Type + " checkbox");
		}
		

		//*[@id="root"]/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button
		
		status = ClickElement("//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info","Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");
	
		
		// Select the Issue Type
		String TypeOfIssue = new String(SearchIssueType);
		String IssueType[] = TypeOfIssue.split(",");
		for (String Type : IssueType) {
			// System.out.println(Type);
			status = ClickElement("//input[@value='" + Type + "']");
			if (status)
				LogEventWithScreenshot("info","Clicked on " + Type + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Type + " checkbox");
		}
		//*[@id="root"]/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button
		// Click on OK button
		status = ClickElement(
				"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info","Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");
		
		
		// Select the Status of issues
		String StatusOfIssue = new String(SearchIssueStatus);
		String IssueStatus[] = StatusOfIssue.split(",");

		for (String Status : IssueStatus) {
			// System.out.println(temp);
			status = ClickElement("//input[@value='" + Status + "']");
			if (status)
				LogEventWithScreenshot("info","Clicked on " + Status + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + Status + " checkbox");
		}

		//*[@id="root"]/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button
		// Clicked on OK button after select issues status
		status = ClickElement(
				"//*[@id='root']/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[5]/div[1]/div/div/div/div/div/div[3]/div[1]/div/button");
		if (status)
			LogEventWithScreenshot("info","Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click on OK button");
		
		
		// Complete msg
		status = Exist("//p[text()='These are the Issues that you are looking for']");
		if(status) {		
			// Click on chat window button
			status=ClickElement("//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
			if (status)
				LogEventWithScreenshot("info","Close the Chat window");
			else
				LogEventWithScreenshot("fail", "Unable to close the chat window");
			
			LogEventWithScreenshot("pass", "Issues displyed");
		}
		else{
			LogEventWithScreenshot("pass", "I think U don't have issues");
		}
		
		Logout();
	}

	public static void TC24_VerifySearchIssuesByUser() {
		
		boolean status;
		// Login
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");
		
		// Enter command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", SearchIssuesCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Search Issue command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter  Search Issues command");
		
		// Select the Issue Status
		String StatusOfIssue = new String(SearchIssueStatus);
		String IssueStatus[] = StatusOfIssue.split(",");

		for (String Status : IssueStatus) {
			// System.out.println(temp);
			status = ClickElement("//input[@value='" + Status + "']");
			if (status)
				LogEventWithScreenshot("info","Clicked on " + Status + " checkbox");
			else
				System.out.println("Unable to click  on " + Status + " checkbox");
		}
		
		// Click on OK button
		status = ClickElement("//BUTTON[@type='button'][text()='Ok']");
		if(status)
			LogEventWithScreenshot("info","Click OK button");
		else
			System.out.println("Unable click Ok button");
		
		// Completed Mesages
		status = Exist("//P[text()='These are the Issues that you are looking for']");
		if(status)
			LogEventWithScreenshot("pass","These are the issues you are lookibg for");
		else {
			status = Exist("//P[text()='I think there are no issues!']");
			if(status)
				LogEventWithScreenshot("pass","I think u don't have issues");
			else
				LogEventWithScreenshot("fail","Unable to display issues");
		}
	}

	
}
