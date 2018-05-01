package reddit.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static reddit.config.ChromeConfig.*;
import static reddit.utils.Constants.XPATH;
import static reddit.utils.XpathConstants.*;
import static reddit.utils.UtilityMethods.findElementByXpath;

public class BasicActions {

    static public void openRedditPage() {

        WebDriver driver = new ChromeDriver();
        setWebdriver();
        String baseUrl = "http://www.reddit.com/";
        driver.get(baseUrl);
    }

    static public void goToTheOldRedditLayout() {

        findElementByXpath(oldRedditButtonXpath, XPATH).click();
    }
}
