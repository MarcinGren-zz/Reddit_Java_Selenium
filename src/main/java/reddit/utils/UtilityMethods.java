package reddit.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reddit.config.ChromeConfig;

public class UtilityMethods extends ChromeConfig {


    static public WebElement findElementByXpath(String xpath, String method) {

        WebElement element = driver.findElement(convertMethodToBy(xpath, method));
        return element;
    }

    static public void typeIntoInputField(String xpathToBeSelected, String method, String keysToBeUsed) {
        try {
            WebElement element = UtilityMethods.findElementByXpath(xpathToBeSelected, method);
            element.sendKeys(keysToBeUsed);
        } catch (NullPointerException e) {
            System.out.println("couldnt find the " + xpathToBeSelected + " field");
        }
    }

    static public void clickElement(String xpathToBeSelected, String method) {
        try {
            WebElement element = UtilityMethods.findElementByXpath(xpathToBeSelected, method);
            element.click();
        } catch (NullPointerException e) {
            System.out.println("couldnt find the " + xpathToBeSelected + " field");
        }
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
