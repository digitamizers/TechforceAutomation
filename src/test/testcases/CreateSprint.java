package test.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateSprint extends UserLibrary {

	public static void TC111_VerifyCreateSprint() {
		boolean status;
		// Home page
		status = Login(URL, UserName, Password);
		if (status)
			LogEventWithScreenshot("pass", "Home Page is Displayed");
		else
			LogEventWithScreenshot("fail", "Unable to display Home page");

		// Enter Assignee Issues Command
		status = SetTextAndEnter("//input[@class='wc-shellinput']", CreateSprintCommand);
		if (status)
			LogEventWithScreenshot("pass", "Entered Create Sprint Command");
		else
			LogEventWithScreenshot("fail", "Unable to Enter Create Sprint Command");
		
		// Selected Sprint Board
		status=SelectOPtionByText("//SELECT[@class='ac-input ac-multichoiceInput']", SprintBoard);
		if (status)
			LogEventWithScreenshot("pass", " Selected Sprint Board");
		else
			LogEventWithScreenshot("fail", "Unable to Selected Sprint");
		
		Exist("//SELECT[@class='ac-input ac-multichoiceInput']");
		Select oSelect = new Select(driver.findElement(By.xpath("//SELECT[@class='ac-input ac-multichoiceInput']")));
	    oSelect.selectByIndex(4);
		
	  //*[@id="root"]/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[1]/select/option[3]
	    
	    Logout(); 
		
	}
}
