package Utilities;


import WinCommands.winCommands;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass extends winCommands {
//    @BeforeSuite
//    public void serverOpen() throws IOException {
//        Desktop desktop= Desktop.getDesktop();
//        desktop.open(new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe"));
//    }
    public void OpenApplication() throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
         driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"),cap);
//        System.out.println(driver.getSessionId());
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    public void CloseApplication() throws IOException {
        driver.quit();
//        Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
    }
//    @AfterSuite
//    public void serverClose() throws IOException {
//        Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
//    }
}
