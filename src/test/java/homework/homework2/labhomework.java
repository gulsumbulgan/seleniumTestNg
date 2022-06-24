package homework.homework2;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;
import homework.base.TestBase;
import homework.base.base;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilites.DriverUtil;
import utilites.PropertiesReadingUtil;

import java.io.IOException;
//POM Example TEST - Share Github Link for this
//        Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
//        Step 2) In Login page check text "Guru99 Bank" is present
//        Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
//        Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
//        Step 5) Click on new customer button and verify you are in New Customer Entry Page
//        Step 6) Fill the information for new customer
//        Step 7) Verify new customer added sucessfully
//        ##// Hint-TestNG :

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
// while testing first you will verify "Guru99 Bank" is present
// then you need to Login into application
// then verify Home page contains text as "Manger Id: mngr368294"
// click on new customer tab then verify title contains New Customer Entry Page
// fill all information to be able create a customer // verify the message customer registered sucessfully.
public class labhomework extends TestBase {
    loginPage login ;

    @Test
    public void TC1() {
        login = new loginPage();
        // while testing first you will verify "Guru99 Bank" is present
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("Websiteurl"));
        Assert.assertTrue(login.verifyHeader("Guru99 Bank"));
    }

    @Test
    public void TC2() throws IOException {
        // then you need to Login into application
        login.useridinput(PropertiesReadingUtil.getProperties("userID"));
        login.Passwordinput(PropertiesReadingUtil.getProperties("password"));
        login.clickLoginButton();

    }

    @Test
    public void TC3() {
        //then verify Home page contains text as "Manger Id: mngr368294"
        HomePage home = new HomePage();
        Assert.assertEquals(home.checkManagerID(),PropertiesReadingUtil.getProperties("userID"));
        home.clickNewCustomerButton();
    }

    @Test
    public void TC4() {
        newCostumerEntry entry = new newCostumerEntry();
        Assert.assertTrue(entry.verifyHeader());

    }
    @Test
    public void TC5(){
        // click on new customer tab then verify title contains New Customer Entry Page
        newCostumerEntry newcostum = new newCostumerEntry();
        System.out.println(PropertiesReadingUtil.getProperties("name"));
        newcostum.enterCustomerName(PropertiesReadingUtil.getProperties("name"));
        newcostum.femaleGenderChoice();
        newcostum.enterDOB(PropertiesReadingUtil.getProperties("dob"));
        newcostum.inputAddress(PropertiesReadingUtil.getProperties("address"));
        newcostum.inputCity(PropertiesReadingUtil.getProperties("city"));
        newcostum.inputState(PropertiesReadingUtil.getProperties("state"));
        newcostum.inputPIN(PropertiesReadingUtil.getProperties("pin"));
        newcostum.inputphoneNumber(PropertiesReadingUtil.getProperties("phoneNumber"));
        newcostum.inputEmail(PropertiesReadingUtil.getProperties("email"));
        newcostum.inputPassword(PropertiesReadingUtil.getProperties("password1"));
        newcostum.clickSubmit();



    }
    }
