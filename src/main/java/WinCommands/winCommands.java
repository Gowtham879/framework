package WinCommands;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class winCommands {
    public static WindowsDriver driver;

       public WebElement getWebelementByName(String name)
    {
        WebElement element =winCommands.driver.findElementByName(name);
        return element;
    }
    public void clickName( String name)
    {
        WebElement ele = this.getWebelementByName(name);
        ele.click();
    }
    public WebElement AutomationId(String id)
    {
        WebElement element = winCommands.driver.findElementByAccessibilityId(id);
        return element;
    }
    public void ClickAutomationID(String id)
    {
        WebElement ele = this.AutomationId(id);
        ele.click();
    }
    public void delayScript(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
        }
    }
    public String gettext(String id) {
        WebElement ele=this.AutomationId(id);
        String text = ele.getText();
//        System.out.println(text);
//        String str1 = text.split(" ")[0].trim();
//        String str2 = text.split(" ")[1].trim();
//        str3 = text.split(" ")[2].trim();
        return text;
    }
    public void assertion(){}
}


