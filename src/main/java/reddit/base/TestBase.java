package reddit.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import reddit.config.ChromeConfig;

import java.lang.reflect.Method;

public class TestBase extends ChromeConfig {

//    @BeforeMethod
//    public void setup() {
//        getDriver();
//    }

    @AfterMethod
    public void teardown() {
//        if (method.getName().equals("oldLoginTest")) {
//
//        } else {
            getDriver().quit();
            driver = null;
//        }

    }

}
