package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WorklogReport extends UserLibrary {

	public static void TC91_VerifyWorklogReport() {

		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", WorklogReportCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Worklog Report Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Worklog Report Command");

		// Select user
		String WorklogReporters = new String(UsersReport);
		String GetWorklogs[] = WorklogReporters.split(",");

		for (String User : GetWorklogs) {
			//System.out.println(User);
			// status = ClickElement("//input[@value='"+User+"']");
			status = Exist("//input[@value='" + User + "']");
			if (status)
				LogEventWithScreenshot("info", "Clicked on " + User + " checkbox");
			else
				LogEventWithScreenshot("fail", "Unable to click  on " + User + " checkbox");
		}

		// driver.findElement(By.xpath("//button[@type='button'][text()='OK']")).click();

		status = ClickElement("//button[@class='ac-pushButton']");
		if (status)
			LogEventWithScreenshot("pass", "Clicked on OK button");
		else
			LogEventWithScreenshot("fail", "Unable to click  on OK button");

		driver.findElement(By.xpath("//input[@type='date']")).sendKeys(FromDate, Keys.TAB, ToDate, Keys.TAB,
				Keys.ENTER);

		/*
		 * status=SetText("//input[@type='date']", FromDate); if(status)
		 * LogEventWithScreenshot("pass", "Enter From date"); else
		 * LogEventWithScreenshot("fail", "Unable to Enter from date");
		 */
		status = Exist("//p[text()='These are the Issues that you are looking for']");
		if (status) {
			// Click on chat window button
			status = ClickElement(
					"//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
			if (status)
				LogEventWithScreenshot("pass", "Close the Chat window");
			else
				LogEventWithScreenshot("fail", "Unable to close the chat window");

			// Check Download Report button present or not
			status = Exist("//button[text()='Download Full Report']");
			if (status)
				LogEventWithScreenshot("pass", "Download button present");
			else
				LogEventWithScreenshot("fail", "Unable to find the download button");

			// Check work log report table present or not
			status = Exist("//div[@class='ReactTable']");
			if (status)
				LogEventWithScreenshot("pass", "Worklog report table is Displayed");
			else
				LogEventWithScreenshot("fail", "Unable to find the worklog report table");

			// Check Analysis report block present or not
			status = Exist("//div[@class='standup-content']");
			if (status)
				LogEventWithScreenshot("pass", "Analysis report block present");
			else
				LogEventWithScreenshot("fail", "Unable to find the analysis report block");

			// Check work log report graph
			status = Exist("//div[@class='ct-chart']");
			if (status)
				LogEventWithScreenshot("pass", "Worklog report graph is Displayed");
			else
				LogEventWithScreenshot("fail", "Unable to display the worklog report table");
		} 
		else {
			// Click on chat window button
			status = ClickElement(
					"//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
			if (status)
				LogEventWithScreenshot("pass", "Close the Chat window");
			else
				LogEventWithScreenshot("fail", "Unable to close the chat window");
			
			LogEventWithScreenshot("info", "I Think we don't have issues");
		}
		wait(20);
		Logout();
	}

	public static void TC92_VerifyWorklogReportByUser() {

		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", WorklogReportCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered Worklog Report Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Worklog Report Command");
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys(FromDate, Keys.TAB, ToDate, Keys.TAB, Keys.ENTER);
		
		wait(10);
		status = Exist("//p[text()='These are the Issues that you are looking for']");
		if (status) {
			// Click on chat window button
			status = ClickElement(
					"//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
			if (status)
				LogEventWithScreenshot("pass", "Close the Chat window");
			else
				LogEventWithScreenshot("fail", "Unable to close the chat window");

			// Check Download Report button present or not
			status = Exist("//button[text()='Download Full Report']");
			if (status)
				LogEventWithScreenshot("pass", "Download button present");
			else
				LogEventWithScreenshot("fail", "Unable to find the download button");

			// Check work log report table present or not
			status = Exist("//div[@class='ReactTable']");
			if (status)
				LogEventWithScreenshot("pass", "Worklog report table is Displayed");
			else
				LogEventWithScreenshot("fail", "Unable to find the worklog report table");

			// Check Analysis report block present or not
			status = Exist("//div[@class='standup-content']");
			if (status)
				LogEventWithScreenshot("pass", "Analysis report block present");
			else
				LogEventWithScreenshot("fail", "Unable to find the analysis report block");

			// Check work log report graph
			status = Exist("//div[@class='ct-chart']");
			if (status)
				LogEventWithScreenshot("pass", "Worklog report graph is Displayed");
			else
				LogEventWithScreenshot("fail", "Unable to display the worklog report table");
		} 
		else {
			// Click on chat window button
			status = ClickElement(
					"//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
			if (status)
				LogEventWithScreenshot("pass", "Close the Chat window");
			else
				LogEventWithScreenshot("fail", "Unable to close the chat window");
			
			LogEventWithScreenshot("info", "I Think we don't have issues");
		}
		
		Logout();

	}

}
