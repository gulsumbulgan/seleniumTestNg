package homework.homework2;

import homework.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.DriverUtil;

public class loginPage extends TestBase {
    //First one for login page where you need to locate : username,password,Login and Guru99 Bank text
    public loginPage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

    @FindBy(xpath="//h2[@class='barone']")
    public WebElement header;

    @FindBy(xpath = "//input[@name='uid']")
    public WebElement UserID;

    @FindBy(xpath = "//input[@type='password']" )
    public WebElement Password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;




    public boolean verifyHeader(String expectedHeader){
        if(header.getText().equalsIgnoreCase(expectedHeader)){
            return true;
        }else{
            return false;
        }}
      public void useridinput(String userID){
            UserID.sendKeys(userID);
        }

        public void Passwordinput(String pWord)
        {
            Password.sendKeys(pWord);
        }

        public void clickLoginButton()
        {
            loginButton.click();
        }

    }

