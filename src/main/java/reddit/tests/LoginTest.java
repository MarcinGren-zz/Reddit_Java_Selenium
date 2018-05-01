package reddit.tests;

import org.testng.annotations.Test;
import reddit.base.BasicActions;

public class LoginTest {

    @Test
    public static void main(String[] args) {
        BasicActions ba = new BasicActions();
        ba.openRedditPage();
        ba.goToTheOldRedditLayout();
    }
}