package reddit.utils;

public class XpathConstants {

    static public String oldRedditButtonXpath = "//button[text()='back to Old Reddit.']";
    static public String oldInputUsernameFieldXpath = "//input[@name='user']";
    static public String oldInputPasswordFieldXpath = "//input[@name='passwd']";
    static public String oldLoginButtonXpath = "//button[text()='login']";

    static public String newLoginPopupXpath = "//div[@id='header']//a[text()='log in']";
    static public String newInputUsernameFieldXpath = "//input[@id='loginUsername']";
}
