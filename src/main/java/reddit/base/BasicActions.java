package reddit.base;

import org.openqa.selenium.WebElement;
import reddit.config.ChromeConfig;
import reddit.utils.UtilityMethods;

import static reddit.utils.Constants.XPATH;
import static reddit.utils.XpathConstants.oldRedditButtonXpath;

public class BasicActions extends ChromeConfig {

    public void openRedditPage() {

        String baseUrl = "http://www.reddit.com/";
        getDriver().get(baseUrl);
    }

    public void goToTheOldRedditLayout() {

        try {
            WebElement element = UtilityMethods.findElementByXpath(oldRedditButtonXpath, XPATH);
            element.click();
        } catch (NullPointerException e) {
            return;
        }
    }
}
