package reddit.base;

import org.testng.annotations.AfterMethod;
import reddit.config.ChromeConfig;

import java.lang.reflect.Method;

public class TestBase extends ChromeConfig {

//    @BeforeMethod
//    public void setup() {
//        getDriver();
//    }

    @AfterMethod
    public void teardown(Method method) {
//        if (method.getName().equals("oldLoginTest")) {
//
//        } else {
            driver.quit();
//        }

    }

}
