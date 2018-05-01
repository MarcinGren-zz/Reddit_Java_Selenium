package reddit.tests;

import org.testng.annotations.Test;
import reddit.base.BasicActions;
import static reddit.base.BasicActions.*;

public class LoginTest {

    @Test
    public static void main(String[] args) {
        openRedditPage();
        goToTheOldRedditLayout();
    }



}
