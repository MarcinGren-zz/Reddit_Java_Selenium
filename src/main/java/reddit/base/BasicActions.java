package reddit.base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import reddit.config.ChromeConfig;
import reddit.utils.UtilityMethods;

import static reddit.utils.Constants.XPATH;
import static reddit.utils.LocatorConstants.OLD_REDDIT_BUTTON_XPATH;

public class BasicActions extends ChromeConfig {

    public void openRedditPage() {

        String baseUrl = "http://www.reddit.com/";
        getDriver().get(baseUrl);
    }

    public void goToTheOldRedditLayout() {

        try {
            WebElement element = UtilityMethods.findElement(OLD_REDDIT_BUTTON_XPATH, XPATH);
            element.click();
        } catch (NullPointerException | NoSuchElementException e) {
            return;
        }
    }
}
