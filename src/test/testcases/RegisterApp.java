package test.testcases;

public class RegisterApp extends UserLibrary {

public static void TC05_VerifyRegisterApp() {
        
        boolean status;
        // Launch Application
        status = OpenUrl(URL);
        if (status)
            LogEventWithScreenshot("info", "Techforce.AI Application is Launch and Running");
        else
            LogEventWithScreenshot("fail", "Unable to Launch Techforce.AI Application");
        
        
        // Click on register Link
        status=ClickElement("//a[text()='Register Here']");
        if(status)
            LogEventWithScreenshot("info", "Click on Register Link");
        else
            LogEventWithScreenshot("fail","Unable to Click on Register Link");
        
        // Check register page open or not
        status=Exist("//button[@class='login-button'][text()='Register']");
        
        status = SetText("//input[@id='fullName']", RegFullName);
        if (status)
            LogEventWithScreenshot("info", "Entered Full Name");
        else
            LogEventWithScreenshot("fail", "Unable to Enter Full Name");
        
        // Enter Email id
        status = SetText("//input[@id='regEmail']", RegEmail);
        if(status)
            LogEventWithScreenshot("info", "Entered Register Email");
        else
            LogEventWithScreenshot("fail", "Unable to Enter Register Email");
            
        // Enter Company Name
        status = SetText("//input[@id='companyName']", RegCompany);
        if(status)
            LogEventWithScreenshot("info", "Entered Company Name");
        else
            LogEventWithScreenshot("fail", "Unable to Enter Company Name");
        
        // Enter Password
        status = SetText("//input[@id='regPassword']", RegPassword);
        if(status)
            LogEventWithScreenshot("info", "Entered Password");
        else
            LogEventWithScreenshot("fail", "Unable to Enter Password");
        
        // Click Register Button
        status = ClickElement("//button[@class='login-button'][text()='Register']");
        if(status)
            LogEventWithScreenshot("info", "Clicked Register Button");
        else
            LogEventWithScreenshot("fail", "Unable to Click Register Button");
        
        // Display Pop up window
        status=Exist("//div[text()='The input fields cannot be empty.Please fill up all the fields']");
        if(status)
            LogEventWithScreenshot("fail", "The input fields cannot be empty.Please fill up all the fields");
        else
        {
            status=Exist("//div[text()='Email id already exists']");        
            if(status)
                LogEventWithScreenshot("fail", "Email id already exists");
            else
                LogEventWithScreenshot("pass", "User Succesfully registered");
        }
        
        // Close pop up window
        status=ClickElement("//span[text()='Close']");
        if(status)
            LogEventWithScreenshot("info", "close the popup window");
        else
            LogEventWithScreenshot("fail", "Unable to close the popup window");
             
    }
}
