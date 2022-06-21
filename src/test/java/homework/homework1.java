package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homework1 {
    @Test
    public void TC1(){
        //    POM Example TEST - Share Github Link for this
//    Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
//    Step 2) In Login page check text "Guru99 Bank" is present
//    Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
//    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
//    Step 5) Click on new customer button and verify you are in New Customer Entry Page
//    Step 6) Fill the information for new customer
//    Step 7) Verify new customer added sucessfully
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
        String loginpage=driver.findElement(By.xpath("//h2[@class='barone']")).getText();
        Assert.assertTrue(loginpage.contains("Guru99 Bank"));
        System.out.println(loginpage);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr416887");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("AvEnapU");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String verify=driver.findElement(By.xpath("//td[@style='color: green']")).getText();
        Assert.assertTrue(verify.contains("Manger Id : mngr416887"));
        System.out.println(verify);
        driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
        String verify2=driver.findElement(By.xpath("//p[@class='heading3']")).getText();
        Assert.assertTrue(verify2.contains("Add New Customer"));
        System.out.println(verify2);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Gulsum");
        driver.findElement(By.xpath("//input[@value='f']")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01161988");
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("5th avenue");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Brooklyn");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Newyork");
        driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("12234555");
        driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("3156728978");
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("gulsum@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1223455");
        driver.findElement(By.xpath("//input[@name='sub']")).click();
        String register=driver.findElement(By.xpath("//p[@class='heading3']")).getText();
        Assert.assertTrue(register.contains("Customer Registered Successfully!!!"));
        System.out.println(register);


    }

}
