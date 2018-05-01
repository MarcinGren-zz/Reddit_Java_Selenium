package reddit.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import reddit.config.ChromeConfig;

public class UtilityMethods extends ChromeConfig {


    static public WebElement findElementByXpath(String xpath, String method) {

        WebElement element =  driver.findElement(convertMethodToBy(xpath, method));
        return element;
    }

    //More to add, for now xpath set as default and as a case. Most likely going to change default in the future
    static private By convertMethodToBy(String xpath, String method) {
        By byType;
        switch (method) {
            case "id":
                byType = By.id(xpath);
                break;
            case "xpath":
                byType = By.xpath(xpath);
                break;
            default:
                byType = By.xpath(xpath);
                break;
        }
        return byType;
    }
}
