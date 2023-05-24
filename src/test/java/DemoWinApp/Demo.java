package DemoWinApp;

import WinCommands.winCommands;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Demo  {
   static WindowsDriver   driver;
    @BeforeMethod
            public void openApp() throws IOException {
        Desktop desktop= Desktop.getDesktop();
        desktop.open(new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe"));
        DesiredCapabilities descap=new DesiredCapabilities();
//        descap.setCapability("app","Microsoft.WindowsMaps_8wekyb3d8bbwe!App");
        descap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"),descap);
//        System.out.println(driver.getSessionId());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public  void  switchBrowser() throws IOException {
        driver.findElementByName("Open Navigation").click();
        driver.findElementByName("Settings").click();
        driver.findElementByName("Microsoft Software License Terms").click();
        Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver(options);

        driver1.get("https://www.microsoft.com/en-us/Useterms/Retail/Windows/10/UseTerms_Retail_Windows_10_English.htm");
//        driver1.findElements(By.xpath("//span[text()='All Microsoft']"));

    }

//        WebDriver webDriver=new ChromeDriver();

//    @Test
//    public void testcase() throws IOException, InterruptedException {
//
//     driver.findElementByAccessibilityId("DirectionsButton").click();
//     driver.findElementByName("Starting point").sendKeys("kempegowda International Airport");
//     driver.findElementByName("Destination").click();
//     driver.findElementByName("Destination").sendKeys("Shivamogga Airport");
//     driver.findElementByName("Get directions").click();
//     driver.findElementByXPath("//Button[@Name='Go']").click();
////     String text=driver.findElementByName("Final destination, Shivamogga Airport").getText();
////     System.out.println(text);
//    }
//    @AfterMethod
//    public  void closeApp() throws IOException {
//        driver.quit();
//        Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
//    }
}
