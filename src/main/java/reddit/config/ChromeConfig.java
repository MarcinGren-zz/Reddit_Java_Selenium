package reddit.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConfig {

    static public void setWebdriver() {

      //  WebDriver driver = new ChromeDriver(); //doesn't really work atm, might use setter/getter? to be changed
        System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
     //   return driver;
    }


}
