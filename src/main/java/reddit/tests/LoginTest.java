package reddit.tests;

import org.testng.annotations.Test;
import reddit.base.BasicActions;
import reddit.base.LoginActions;
import reddit.config.ChromeConfig;

public class LoginTest extends ChromeConfig {

    @Test
    public void oldLoginTest() {
        BasicActions ba = new BasicActions();
        LoginActions la = new LoginActions();

        ba.openRedditPage();
        ba.goToTheOldRedditLayout();
        la.enterUsername();
        la.enterPassword();
        la.clickLoginButton();
    }

    @Test
    public void newLoginTest() {
        BasicActions ba = new BasicActions();
        LoginActions la = new LoginActions();

        ba.openRedditPage();
        la.clickLoginPopupNew();
        la.enterUsernameNew();
    }
}