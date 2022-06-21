package homework.homework2;

import homework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {
    @FindBy(xpath = "//tr[@class='heading3']/td")
    WebElement managerID;

    @FindBy(linkText = "New Customer")
    WebElement newCustomerButton;

    public String checkManagerID()
    {
        String managerIDText = managerID.getText();
        String id = managerIDText.split(":")[1].trim();
        return id;
    }

    public void clickNewCustomerButton()
    {
        newCustomerButton.click();
    }

}
