package reddit.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reddit.config.ChromeConfig;

public class UtilityMethods extends ChromeConfig {


    static public WebElement findElement(String locator, String method) {

        WebElement element = driver.findElement(convertMethodToBy(locator, method));
        return element;
    }

    static public void typeIntoInputField(String locatorToBeSelected, String method, String keysToBeUsed) throws NullPointerException {
            WebElement element = UtilityMethods.findElement(locatorToBeSelected, method);
            element.sendKeys(keysToBeUsed);
    }

    static public void clickElement(String locatorToBeSelected, String method) throws NullPointerException{
            WebElement element = UtilityMethods.findElement(locatorToBeSelected, method);
            element.click();
    }

    static public String getText(String locatorToBeSelected, String method) {
        WebElement element = UtilityMethods.findElement(locatorToBeSelected, method);
        String textValue = element.getText();
        return textValue;
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
            case "text":
                byType = By.linkText(xpath);
                break;
            case "class":
                byType = By.className(xpath);
                break;
            case "css":
                byType = By.cssSelector(xpath);
                break;
            default:
                byType = By.xpath(xpath);
                break;
        }
        return byType;
    }
}