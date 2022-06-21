package homework.homework2;

import homework.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilites.BrowserUtils;
import utilites.DriverUtil;

import java.util.concurrent.TimeUnit;
//##// Hint-TestNG :

//Pages : In this task you will need to create 3 pages class
//First one for login page where you need to locate : username,password,Login and Guru99 Bank text
//Second page is for home page and you need to locate : text Manger Id
//Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
//Configuration File
//store username,pasword , and url
//Utils
//use our ready utils such as readingproperties,driver, browser utils
//Base
//use our ready testbase classes.
//Testing
public class homework2 {

    WebDriver driver;
        @BeforeClass
        public void setup() {
        // while testing first you will verify "Guru99 Bank" is present
        driver= DriverUtil.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public void done() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void TC1() throws InterruptedException {
        // then you need to Login into application
        LoginPage login = new LoginPage();
        driver.get("http://demo.guru99.com/V4/");
        Assert.assertEquals("Guru99 Bank", login.checkText());
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr416887");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("AvEnapU");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test
        public void TC2(){
            // then verify Home page contains text as "Manger Id: mngr368294"

        String verify=driver.findElement(By.xpath("//td[@style='color: green']")).getText();
        Assert.assertTrue(verify.contains("Manger Id : mngr416887"));
        System.out.println(verify);
        }
        @Test
        public void TC3(){
            // click on new customer tab then verify title contains New Customer Entry Page
        driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
        String verify2=driver.findElement(By.xpath("//p[@class='heading3']")).getText();
        Assert.assertTrue(verify2.contains("Add New Customer"));
        System.out.println(verify2);
        }
        @Test
        public void TC4() throws InterruptedException {

        // fill all information to be able create a customer // verify the message customer registered sucessfully.

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Gulsum");
        driver.findElement(By.xpath("//input[@value='f']")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01161988");
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("5th avenue");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Brooklyn");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Newyork");
        driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("12234555");
        driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("3156728978");
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("gulsum@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1223455");
        driver.findElement(By.xpath("//input[@name='sub']")).click();
        String register=driver.findElement(By.xpath("//p[@class='heading3']")).getText();
        Assert.assertTrue(register.contains("Customer Registered Successfully!!!"));
        System.out.println(register);
    }
}




