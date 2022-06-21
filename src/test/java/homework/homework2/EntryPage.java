package homework.homework2;

import homework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryPage extends TestBase {
    @FindBy(xpath = "//input[@name='name']")
    WebElement Name;

    @FindBy(xpath = "(//input[@name='rad1'])[2]")
    WebElement female;

    @FindBy(xpath = "//input[@type='date']")
    WebElement date;

    @FindBy(xpath = "//textarea")
    WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    WebElement pin;

    @FindBy(xpath = "//input[@name='telephoneno']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='emailid']")
    WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@value='Submit']" )
    WebElement Submit;



}

