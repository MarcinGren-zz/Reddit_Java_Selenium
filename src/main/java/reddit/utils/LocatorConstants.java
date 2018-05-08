package reddit.utils;

public class LocatorConstants {

    static public String OLD_REDDIT_BUTTON_XPATH = "//button[text()='back to Old Reddit.']";
    static public String OLD_INPUT_USERNAME_FIELD_XPATH = "//input[@name='user']";
    static public String OLD_INPUT_PASSWORD_FIELD_XPATH = "//input[@name='passwd']";
    static public String OLD_LOGIN_BUTTON_XPATH = "//button[text()='login']";
    static public String OLD_LOGGED_IN_USERNAME = "//div[@class='titlebox']/h1";
    static public String STATUS_ERROR_XPATH = "//div[@class='status error']";
    static public String POPULAR_IN_XPATH = "//div[@class='dropdown lightdrop']";
    static public String EVERYWHERE_POPULAR_IN_XPATH = "//div[@class='drop-choices lightdrop inuse']/form[1]";
    static public String SELECTED_SPAN_CLASS_XPATH = "//span[@class='selected']";
    static public String LOGOUT_BUTTON_XPATH = "//a[text()='logout']";
    static public String WELCOME_TO_REDDIT_SIGN_UP_POPUP_XPATH = "//div[@id='desktop-onboarding-browse']";
    static public String SKIP_FOR_NOW_XPATH = "//a[@class='skip-for-now']";


    static public String NEW_LOGIN_POPUP_XPATH = "//div[@id='header']//a[text()='log in']";
    static public String NEW_INPUT_USERNAME_FIELD_XPATH = "//input[@id='loginUsername']";

    static public String CLOSE_REDESIGN_POPUP_ID = "close-a";
}