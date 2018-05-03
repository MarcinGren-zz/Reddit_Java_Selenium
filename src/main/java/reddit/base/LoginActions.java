package reddit.base;

import reddit.config.ChromeConfig;

import static reddit.utils.Constants.*;
import static reddit.utils.LocatorConstants.*;
import static reddit.utils.UtilityMethods.*;

public class LoginActions extends ChromeConfig {

    public void enterUsername(String username) {

        typeIntoInputField(OLD_INPUT_USERNAME_FIELD_XPATH, XPATH, username);
    }

    public void enterPassword(String password) {

        typeIntoInputField(OLD_INPUT_PASSWORD_FIELD_XPATH, XPATH, password);
    }

    public void clickLoginButton() {

        clickElement(OLD_LOGIN_BUTTON_XPATH, XPATH);
    }

    public void clickLoginPopupNew() {

        clickElement(NEW_LOGIN_POPUP_XPATH, XPATH);
    }

    public void enterUsernameNew() {

        typeIntoInputField(NEW_INPUT_USERNAME_FIELD_XPATH, XPATH, USERNAME);
    }

    public void clickUserProfile() {

        clickElement(USERNAME, TEXT);
    }

    public void closeRedesignPopup() {

        clickElement(CLOSE_REDESIGN_POPUP_ID, ID);
    }

    public void checkLoggedUsername() {
        String usernameToCheck = getText(OLD_LOGGED_IN_USERNAME, XPATH);
        assert usernameToCheck.equals(USERNAME);
    }

    public void checkLoginFailedMessage() {
        String textToCheck = getText(STATUS_ERROR_XPATH, XPATH);
        assert textToCheck.equals(LOGIN_FAILED_MESSAGE);
    }
}
