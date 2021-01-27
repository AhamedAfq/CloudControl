package cloudControl.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    public static WebDriver driver;
    public static JavascriptExecutor js;

    static{
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js=(JavascriptExecutor) driver;
        driver.get("http://cloud-control-app.infra-sg.cld/microTracker");
    }
}
