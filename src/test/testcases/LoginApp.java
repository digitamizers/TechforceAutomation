package test.testcases;

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
        
        
        status = Exist("//button/div[contains(.,'Das')]");
        if (status)
            LogEventWithScreenshot("pass", "Login is sucessful");
        else
            LogEventWithScreenshot("pass", "Login is not sucessful");
        
        
        ClickElement(".//*[@id='root']/div/div[1]/div/div[1]/div/div[5]/div/div/button");
        status = ClickElement("html/body/div[2]/div/div/div/div/div/div[2]/span/div/div/div");
        if (status)
            LogEventWithScreenshot("info", "Clicked on Sign Out");
        else
            LogEventWithScreenshot("fail", "Unable to click on Sign Out");

        status = Exist("//*[@id='email']");
        if (status)
            LogEventWithScreenshot("pass", "Sign Out is successful");
        else
            LogEventWithScreenshot("fail", "Sign Out is Not successful");
        
    }
}
