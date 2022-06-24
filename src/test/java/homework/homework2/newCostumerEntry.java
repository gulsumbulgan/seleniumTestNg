package homework.homework2;

import homework.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.DriverUtil;

//Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
public class newCostumerEntry extends TestBase {
    public newCostumerEntry() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }
    @FindBy(xpath = "//p[@class='heading3']")
    private WebElement addNewCustomerButton;

    public boolean verifyHeader(){
        System.out.println(addNewCustomerButton.getText());
        boolean isVerified=false;
        if(addNewCustomerButton.getText().equalsIgnoreCase("Add New Customer")){
            isVerified=true;
        }
        return isVerified;
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement Name;

    @FindBy(xpath = "(//input[@name='rad1'])[2]")
    public WebElement female;

    @FindBy(xpath = "//input[@type='date']")
    public WebElement dob;

    @FindBy(xpath = "//textarea")
    public WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;

    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password1;

    @FindBy(xpath = "//input[@value='Submit']" )
    public WebElement Submit;

    public void enterCustomerName(String customerNameInfo)
    {

        Name.sendKeys(customerNameInfo);
    }

    public void femaleGenderChoice()
    {
        female.click();
    }

    public void enterDOB(String date)  {

        dob.sendKeys(date, Keys.ARROW_RIGHT);

    }

    public void inputAddress(String Address)
    {
        address.sendKeys(Address);
    }

    public void inputCity(String cityName)
    {
        city.sendKeys(cityName);
    }

    public void inputState(String stateName)
    {
        state.sendKeys(stateName);
    }

    public void inputPIN(String pincode)
    {
        pin.sendKeys(pincode);
    }

    public void inputphoneNumber(String mobileNumberInfo)
    {
        phoneNumber.sendKeys(mobileNumberInfo);
    }

    public void inputEmail(String emailInfo)
    {
        email.sendKeys(emailInfo);
    }

    public void inputPassword(String passwordInfo)
    {
        password1.sendKeys(passwordInfo);
    }

    public void clickSubmit()
    {
        Submit.click();
    }

   // public void enterDOB(String dob) {

   // }
}
