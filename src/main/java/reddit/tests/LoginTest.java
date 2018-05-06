package reddit.tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.testng.annotations.Test;
import reddit.base.BasicActions;
import reddit.base.LoginActions;
import reddit.base.TestBase;
import sun.rmi.runtime.Log;

import static reddit.utils.Constants.*;

public class LoginTest extends TestBase {

    @Test(priority = 1)
    public void oldLoginTestValidUsername() {
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

//    @Test(priority = 2)
//    public void logoutOld() {
//        LoginActions la = new LoginActions();
//        la.logout();
//    }

    @Test(priority = 3)
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

    @Test(priority = 4)
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

//    @Test   //unfinished
//    public void newLoginTestValidUsername() {
//        BasicActions ba = new BasicActions();
//        LoginActions la = new LoginActions();
//
//        ba.openRedditPage();
//        la.clickLoginPopupNew();
//        la.enterUsernameNew();
//    }
}