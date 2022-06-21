package homework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
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
    public TestBase() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }


    public static String readPropertiesFile(String key) throws IOException {
        Properties prop = new Properties();

        String fileName = "lab13.properties";
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        prop.load(fis);

        String value = prop.getProperty(key);

        return value;


    }
    }


