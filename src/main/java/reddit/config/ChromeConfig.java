package reddit.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeConfig {

    public static WebDriver driver;

    public ChromeConfig() {

        if (driver == null) {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }
}