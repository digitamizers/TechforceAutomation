package test.testcases;

public class StandupReport extends UserLibrary {

	public static void TC71_VerifyStandupReport() {

		boolean status;
		// Launch Home page
		status=Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("info", "Open the Home Page");
		else
			LogEventWithScreenshot("fail", "Unable to Open HomePage");

		// Enter the command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", StandupReportCommand);
		if (status)
			LogEventWithScreenshot("info", "Entered  StandUpReport command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter StandupReport command");

		wait(20);
		
		// Click on chat window button
		status=ClickElement("//IMG[@src='data:image/svg+xml;base64, PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNDg5LjM2IDQ4OS4zNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNDg5LjM2IDQ4OS4zNjsiIHhtbDpzcGFjZT0icHJlc2VydmUiIHdpZHRoPSI1MTIiIGhlaWdodD0iNTEyIj48Zz48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0yODUuNzgsMzE4Ljg2aC04MC4xYy0xMS40LDAtMjAuOCw5LjQtMjAuOCwyMC44czkuNCwyMC44LDIwLjgsMjAuOGg4MC4xYzExLjQsMCwyMC44LTkuNCwyMC44LTIwLjggICAgUzI5Ny4xOCwzMTguODYsMjg1Ljc4LDMxOC44NnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8cGF0aCBkPSJNMzcyLjA4LDEwNy42NmgtMTQuOGwzNC43LTQ5LjdjMi41LDEuMyw1LjQsMS44LDguMiwxLjhjNi4yLDAsMTIuNS0zLjEsMTYuNi05LjRjNi4yLTkuNCw0LjItMjEuOC01LjItMjguMWwtMjYtMTguNyAgICBjLTkuNC02LjItMjEuOC00LjItMjguMSw1LjJjLTUuNCw4LjEtNC42LDE4LjUsMS44LDI1LjJsLTUxLjMsNzMuNmgtMTI2LjdsLTUwLjktNzNjNi45LTYuNyw4LTE3LjUsMi40LTI1LjggICAgYy02LjItOS40LTE4LjctMTEuNC0yOC4xLTUuMmwtMjYsMTguN2MtOS40LDcuMy0xMS40LDE5LjgtNS4yLDI5LjFjNC4yLDUuMywxMC41LDguNCwxNi43LDguNGMyLjcsMCw1LjMtMC40LDcuNy0xLjZsMzQuNSw0OS40ICAgIGgtMTUuMWMtNDUuOCwwLTgyLjIsMzYuNC04Mi4yLDgyLjJ2MjE3LjRjMCw0NS44LDM2LjQsODIuMiw4Mi4yLDgyLjJoMjU1LjljNDQuNywwLDgxLjEtMzYuNCw4MS4xLTgyLjJ2LTIxNy4zICAgIEM0NTQuMjgsMTQ0LjA2LDQxNy44OCwxMDcuNjYsMzcyLjA4LDEwNy42NnogTTQxMy43OCw0MDcuMjZjMCwyMi45LTE4LjcsNDEuNi00MS42LDQxLjZoLTI1NC45Yy0yMi45LDAtNDEuNi0xOC43LTQxLjYtNDEuNiAgICB2LTIxNy40YzAtMjIuOSwxOC43LTQxLjYsNDEuNi00MS42aDI1NC45YzIyLjksMCw0MS42LDE4LjcsNDEuNiw0MS42VjQwNy4yNnoiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvcGF0aD4KCQk8Y2lyY2xlIGN4PSIzMzIuNTgiIGN5PSIyMjcuMjYiIHI9IjIwLjUiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkY5NiIgZGF0YS1vbGRfY29sb3I9IiMwMEZGODciPjwvY2lyY2xlPgoJCTxjaXJjbGUgY3g9IjE1Ny43OCIgY3k9IjIyNy4yNiIgcj0iMjAuNSIgZGF0YS1vcmlnaW5hbD0iIzAwMDAwMCIgY2xhc3M9ImFjdGl2ZS1wYXRoIiBzdHlsZT0iZmlsbDojMDBGRjk2IiBkYXRhLW9sZF9jb2xvcj0iIzAwRkY4NyI+PC9jaXJjbGU+Cgk8L2c+CjwvZz48L2c+IDwvc3ZnPg==']");
		if (status)
			LogEventWithScreenshot("pass", "Close the Chat window");
		else
			LogEventWithScreenshot("fail", "Unable to close the chat window");

		
		// Click on Configuration tab
		status=ClickElement("//div[text()='Configuration']");
		if (status)
			LogEventWithScreenshot("pass", "Display Configuration Tab");
		else
			LogEventWithScreenshot("fail", "Unable To Click Configuration tab");
		
		// Check Stand up report table Display or not 
	    status=Exist("//button[text()='Download Full Report']");
	    if(status)
	    	LogEventWithScreenshot("pass", "Standup report Table Displayed");
	    else
	    	LogEventWithScreenshot("fail", "Standup report Table not Displayed");
		
	    
	    // Check Stand up Analysis Report block displayed or not 
	    status=Exist("//span[text()='Analysis']");
	    if(status)
	    	LogEventWithScreenshot("pass","Analysis block is Displayed");
	    else
	    	LogEventWithScreenshot("fail", "Analysis block is not Displayed");
	    
	    // Check graph displayed or not
	    status=Exist("//div[@class='graph']");
	    if(status)
	    	LogEventWithScreenshot("pass", "Graph is displayed");
	    else
	    	LogEventWithScreenshot("fail", "Graph is not displayed");
	   
	    
	    // Logout Function
		status=Logout();
		if (status)
			LogEventWithScreenshot("pass", "Logout is Successful");
		else
			LogEventWithScreenshot("fail", "Logout is UnSuccessful");

		
	}
}
