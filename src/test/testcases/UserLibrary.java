package test.testcases;

import test.resources.generic.WebLibrary;


/* ######################################################################################################
 * Class Name: UserLib
 * Description: Contains the methods which are used for the common functionalities of the application
 * ######################################################################################################
 */
public class UserLibrary extends WebLibrary 
{
	/*
	 * ######################################################################################################
	 *  Method Name: Login
	 *  Description: To Login to a Speedops Application,Based on UID,Password
	 *  Input Parameters:URL,UID,Password
	 *  Output: True/False 
	 * ######################################################################################################
	 */
	public static boolean Login(String URL, String UID, String Password) 
	{
		boolean loginstatus = true;
		boolean status;

		status = OpenUrl(URL);
		if (status)
			LogEventWithScreenshot("info", "Techforce.AI Application is Launch and Running");
		else
			LogEventWithScreenshot("fail", "Unable to Launch Techforce.AI Application");
		
		
		status = SetText("//input[@type='email']", UID);
		if (status)
			LogEventWithScreenshot("info", "Entered UserName");
		else
			LogEventWithScreenshot("fail", "Unable to Enter UserName");

		
		status = SetText("//input[@type='password']", Password);
		if (status)
			LogEventWithScreenshot("info", "Entered Password");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Password");

		
		
		status = ClickElement("//button[@class='login-button'][text()='login']");
		if (status)
			LogEventWithScreenshot("info", "Clicked on Login");
		else
			LogEventWithScreenshot("fail", "Unable to Click on login");

		
		status = Exist("//div[@class='wc-message-groups']");
		if (status)
			LogEventWithScreenshot("pass", "Login is sucessful");
		else {
			LogEventWithScreenshot("fail", "Login is not sucessful");
			loginstatus = false;
		}

		return loginstatus;
	}
	/* ######################################################################################################
	 * Method Name: Logout
	 * Description: To Logout the Speedops Appilication
	 * Input:
	 * Output: True/False
	 * ######################################################################################################
	 */

	public static boolean Logout() 
	{
		wait(10);
		Boolean status;
		ClickElement("//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIGlkPSJMYXllcl8xIiB4PSIwcHgiIHk9IjBweCIgdmlld0JveD0iMCAwIDI5OS45OTcgMjk5Ljk5NyIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgMjk5Ljk5NyAyOTkuOTk3OyIgeG1sOnNwYWNlPSJwcmVzZXJ2ZSIgd2lkdGg9IjUxMiIgaGVpZ2h0PSI1MTIiIGNsYXNzPSIiPjxnIHRyYW5zZm9ybT0ibWF0cml4KDAuOTg5MTA5IDAgMCAwLjk4OTEwOSAxLjYzMzU4IDEuNjMzNTgpIj48Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0xNDkuOTk2LDBDNjcuMTU3LDAsMC4wMDEsNjcuMTU4LDAuMDAxLDE0OS45OTdjMCw4Mi44MzcsNjcuMTU2LDE1MCwxNDkuOTk1LDE1MHMxNTAtNjcuMTYzLDE1MC0xNTAgICAgQzI5OS45OTYsNjcuMTU2LDIzMi44MzUsMCwxNDkuOTk2LDB6IE0xNTAuNDUzLDIyMC43NjN2LTAuMDAyaC0wLjkxNkg4NS40NjVjMC00Ni44NTYsNDEuMTUyLTQ2Ljg0NSw1MC4yODQtNTkuMDk3bDEuMDQ1LTUuNTg3ICAgIGMtMTIuODMtNi41MDItMjEuODg3LTIyLjE3OC0yMS44ODctNDAuNTEyYzAtMjQuMTU0LDE1LjcxMi00My43MzgsMzUuMDg5LTQzLjczOGMxOS4zNzcsMCwzNS4wODksMTkuNTg0LDM1LjA4OSw0My43MzggICAgYzAsMTguMTc4LTguODk2LDMzLjc1Ni0yMS41NTUsNDAuMzYxbDEuMTksNi4zNDljMTAuMDE5LDExLjY1OCw0OS44MDIsMTIuNDE4LDQ5LjgwMiw1OC40ODhIMTUwLjQ1M3oiIGRhdGEtb3JpZ2luYWw9IiMwMDAwMDAiIGNsYXNzPSJhY3RpdmUtcGF0aCIgc3R5bGU9ImZpbGw6IzAwRkZBRCIgZGF0YS1vbGRfY29sb3I9IiMyOUU2QTkiPjwvcGF0aD4KCTwvZz4KPC9nPjwvZz4gPC9zdmc+']");
		
		status = ClickElement("//div[text()='Sign Out']");
		if (status)
			LogEventWithScreenshot("info", "Clicked on Sign Out button");
		else
			LogEventWithScreenshot("fail", "Unable to clickon Clicked on Sign Out");

		status = Exist("//input[@type='email']");
		if (status)
			LogEventWithScreenshot("pass", "Sign Out is successful");
		else
			LogEventWithScreenshot("fail", "Sign Out is Not successful");
		
		return status;
	}
}
