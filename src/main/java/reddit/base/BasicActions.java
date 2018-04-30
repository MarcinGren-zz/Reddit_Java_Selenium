package reddit.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicActions {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
        String baseUrl = "http://www.reddit.com/";
        driver.get(baseUrl);
    }

}
