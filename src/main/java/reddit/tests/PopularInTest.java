package reddit.tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import reddit.base.BasicActions;
import reddit.base.OtherActions;
import reddit.base.TestBase;

public class PopularInTest extends TestBase {


    @Test
    public void checkIfPopularInCanBeChanged(){

        BasicActions ba = new BasicActions();
        OtherActions oa = new OtherActions();

        ba.openRedditPage();
        ba.goToTheOldRedditLayout();
        try {
            oa.changePopularInToEverywhere();
        } catch (NoSuchElementException e) {
            ba.goToTheOldRedditLayout();
            oa.changePopularInToEverywhere();
        }
        oa.checkIfEverywhereIsSelected();
    }
}
