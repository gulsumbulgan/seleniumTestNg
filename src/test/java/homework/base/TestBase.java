package homework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilites.BrowserUtils;
import utilites.DriverUtil;
import utilites.WebDriverUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

        //test base for code reusability
        //use access modifier here
        protected WebDriver driver;

        @BeforeClass
        public void setup(){
            driver= DriverUtil.getDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @AfterClass
        public void closing() throws InterruptedException {
            BrowserUtils.wait(3);
            //  driver.close();
        }
    }


