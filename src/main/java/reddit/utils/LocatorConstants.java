package reddit.utils;

public class LocatorConstants {

    static public String OLD_REDDIT_BUTTON_XPATH = "//button[text()='back to Old Reddit.']";
    static public String OLD_INPUT_USERNAME_FIELD_XPATH = "//input[@name='user']";
    static public String OLD_INPUT_PASSWORD_FIELD_XPATH = "//input[@name='passwd']";
    static public String OLD_LOGIN_BUTTON_XPATH = "//button[text()='login']";
    static public String OLD_LOGGED_IN_USERNAME = "//div[@class='titlebox']/h1";
    static public String STATUS_ERROR_XPATH = "//div[@class='status error']";

    static public String NEW_LOGIN_POPUP_XPATH = "//div[@id='header']//a[text()='log in']";
    static public String NEW_INPUT_USERNAME_FIELD_XPATH = "//input[@id='loginUsername']";

    static public String CLOSE_REDESIGN_POPUP_ID = "close-a";
}