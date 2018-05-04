package reddit.base;

import org.openqa.selenium.WebElement;

import static reddit.utils.Constants.EVERYWHERE;
import static reddit.utils.Constants.XPATH;
import static reddit.utils.LocatorConstants.*;
import static reddit.utils.UtilityMethods.clickElement;
import static reddit.utils.UtilityMethods.findElement;

public class OtherActions {

    public void changePopularInToEverywhere() {

        clickElement(POPULAR_IN_XPATH, XPATH);
        clickElement(EVERYWHERE_POPULAR_IN_XPATH, XPATH);
//        Select dropdown = new Select(element);
//        dropdown.selectByIndex(1);
    }

    public void checkIfEverywhereIsSelected() {

        WebElement element = findElement(SELECTED_SPAN_CLASS_XPATH, XPATH);
        assert element.getText().equals(EVERYWHERE);
    }
}