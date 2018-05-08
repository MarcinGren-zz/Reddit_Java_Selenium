package reddit.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import reddit.config.ChromeConfig;

import java.lang.reflect.Method;

public class TestBase extends ChromeConfig {

    //move open reddit webpage and try/catch welcome popup here
//    @BeforeMethod
//    public void setup() {
//        getDriver();
//    }

   // @AfterMethod
    public void teardown(Method method) {
        if (method.getName().equals("oldLoginTestValidUsername") == false) {
            getDriver().quit();
            driver = null;
        }
    }

}
