package reddit.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import reddit.config.ChromeConfig;
import reddit.utils.UtilityMethods;

import static reddit.utils.Constants.XPATH;
import static reddit.utils.XpathConstants.*;

public class BasicActions extends ChromeConfig{

    static public void openRedditPage() {

        String baseUrl = "http://www.reddit.com/";
        driver.get(baseUrl);
    }

    static public WebElement goToTheOldRedditLayout() {

        try {
            WebElement element = UtilityMethods.findElementByXpath(oldRedditButtonXpath, XPATH);
            element.click();
            return element;
        } catch (NullPointerException e) {
            return null;
        }
    }
}
