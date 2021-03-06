package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateSprint extends UserLibrary {

	public static void TC111_VerifyCreateSprint() {
		boolean status;
	/*	// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Sprint Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateSprintCommand);
		if (status)
			LogEventWithScreenshot("info", "Enter Sprint Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Sprint Command");

		// Selected Sprint Board
		status = SelectOPtionByText("//SELECT[@class='ac-input ac-multichoiceInput']", CreateSprintBoard);
		if (status)
			LogEventWithScreenshot("info", "Select "+ CreateSprintBoard +" board");
		else
			LogEventWithScreenshot("fail", "Unable to select Sprint board");

		// Click Ok button
		status = ClickElement("//BUTTON[@type='button'][text()='Ok']");
		if (status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click Ok button");

		// Enter Sprint Name
		status = SetText("(//INPUT[@placeholder='Sprint 1'])", CreateSprintName);
		if (status)
			LogEventWithScreenshot("info", "Enter Sprint Name as "+CreateSprintName);
		else
			LogEventWithScreenshot("fail", "Unable to Enter Sprint Name");

		// Enter From Date and To date
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys(CreateSprintFromDate, Keys.TAB, CreateSprintTodate, Keys.TAB,
				Keys.ENTER);

		// Click Submit
		status = ClickElement("//BUTTON[@type='button'][text()='Submit']");
		if (status)
			LogEventWithScreenshot("info", "Click on submit button");
		else
			LogEventWithScreenshot("fail", "Unable to click on submit button");

		// Complete msg
		status = Exist("//p[contains(text(),'Sprint with ID')]");
		if (status)
			LogEventWithScreenshot("info", "Sprint Create Successfully");
		else
			LogEventWithScreenshot("fail", "Unable to sprint create successfuuly");

		Logout();*/
		
		
		//Jira login
		JiraLogin(JiraURL,JiraEmail, JiraPassword);
		status = ClickElement("//*[@id=\"navigation-app\"]/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/button/div");
		if(status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click");
		
		status = SetText("//INPUT[@type='text']",CreateSprintBoard);
		if(status)
			LogEventWithScreenshot("info", "Click Ok button");
		else
			LogEventWithScreenshot("fail", "Unable to click");
		

	}

}
