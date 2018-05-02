package reddit.base;


import reddit.config.ChromeConfig;

import static reddit.utils.Constants.*;
import static reddit.utils.UtilityMethods.typeIntoInputField;
import static reddit.utils.UtilityMethods.clickElement;
import static reddit.utils.XpathConstants.*;

public class LoginActions extends ChromeConfig {

    public void enterUsername() {

        typeIntoInputField(oldInputUsernameFieldXpath, XPATH, USERNAME);
    }

    public void enterPassword() {

        typeIntoInputField(oldInputPasswordFieldXpath, XPATH, PASSWORD);
    }

    public void clickLoginButton() {

        clickElement(oldLoginButtonXpath, XPATH);
    }

    public void clickLoginPopupNew() {

        clickElement(newLoginPopupXpath, XPATH);
    }

    public void enterUsernameNew() {

        typeIntoInputField(newInputUsernameFieldXpath, XPATH, USERNAME);
    }

}
