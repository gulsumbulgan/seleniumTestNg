package homework.homework2;

import homework.base.TestBase;
import homework.base.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//Second page is for home page and you need to locate : text Manger Id
public class HomePage extends base {
    @FindBy(xpath = "//tr[@class='heading3']/td")
    WebElement managerID;

    @FindBy(linkText = "New Customer")
    WebElement newCustomerButton;

    public String checkManagerID()
    {
        String manager = managerID.getText();
        String id = manager.split(":")[1].trim();
        return id;
    }

    public void clickNewCustomerButton()
    {
        newCustomerButton.click();
    }

}
