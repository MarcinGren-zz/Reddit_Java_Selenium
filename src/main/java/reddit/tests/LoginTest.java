package reddit.tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import reddit.base.BasicActions;
import reddit.base.LoginActions;
import static reddit.utils.Constants.*;

public class LoginTest {

    @Test
    public void oldLoginTest() {
        BasicActions ba = new BasicActions();
        LoginActions la = new LoginActions();

        ba.openRedditPage();
        ba.goToTheOldRedditLayout();
        la.enterUsername(USERNAME);
        la.enterPassword(PASSWORD);
        la.clickLoginButton();
        try {
            la.clickUserProfile();
        } catch (NoSuchElementException e) {
            la.closeRedesignPopup();
            ba.goToTheOldRedditLayout();
            la.clickUserProfile();
        }
        la.checkLoggedUsername();
    }

    @Test
    public void oldLoginTestInvalidUsername() {
        BasicActions ba = new BasicActions();
        LoginActions la = new LoginActions();

        ba.openRedditPage();
        ba.goToTheOldRedditLayout();
        la.enterUsername(INVALID);
        la.enterPassword(PASSWORD);
        la.clickLoginButton();
        la.checkLoginFailedMessage();
    }

    @Test
    public void oldLoginTestInvalidPassword() {
        BasicActions ba = new BasicActions();
        LoginActions la = new LoginActions();

        ba.openRedditPage();
        ba.goToTheOldRedditLayout();
        la.enterUsername(USERNAME);
        la.enterPassword(INVALID);
        la.clickLoginButton();
        la.checkLoginFailedMessage();
    }

    @Test   //unfinished
    public void newLoginTest() {
        BasicActions ba = new BasicActions();
        LoginActions la = new LoginActions();

        ba.openRedditPage();
        la.clickLoginPopupNew();
        la.enterUsernameNew();
    }
}