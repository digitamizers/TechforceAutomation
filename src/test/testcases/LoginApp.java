package test.testcases;

import org.openqa.selenium.By;

public class LoginApp extends UserLibrary {
	
    public static void TC01_VerifyLogin()
    {
        Boolean status;
        status = OpenUrl(URL);
        if (status)
            LogEventWithScreenshot("info", "Application is Up and Running");
        else
            LogEventWithScreenshot("fail", "Unable to Launch Techforce.AI Application");
        
        
        status = SetText("//input[@type='email']", UserName);
        if (status)
            LogEventWithScreenshot("info", "Entered UserName");
        else
            LogEventWithScreenshot("fail", "Unable to Enter UserName");
        
        
        status = SetText("//input[@type='password']", Password);
        if (status)
            LogEventWithScreenshot("info", "Entered Password");
        else
            LogEventWithScreenshot("fail", "Unable to Enter Password");
        
        
        status = ClickElement("//button[contains(text(),'login')]");
        if (status)
            LogEventWithScreenshot("info", "Clicked on Login");
        else
            LogEventWithScreenshot("fail", "Unable to Click on login");
        
        
        /*status = Exist("//div[@class='wc-message-groups']");
		if (status) {
			LogEventWithScreenshot("pass", "Login is sucessful");
			Logout();
		}
		else 
			LogEventWithScreenshot("fail", "Login is not sucessful");
        */
        
        
        status = Exist("//DIV[@class='wc-message-groups']");
        if (status) {
            LogEventWithScreenshot("pass", "Login is sucessful");
            Logout();
        }
        // If both email id and password fields are empty then below code is executed
        else {
            String errorMessage = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText();
            status = Exist("/html/body/div[2]/div/div[1]/div/div/div[1]");
            if (status) 
                LogEventWithScreenshot("pass", errorMessage + " is displayed");
            else 
                LogEventWithScreenshot("fail", "There was an errors");
        }
        
        
    }
}
