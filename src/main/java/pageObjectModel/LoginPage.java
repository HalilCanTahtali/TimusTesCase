package pageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends AbstractHelper
{
    WebDriver driver;

    public LoginPage()
    {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@data-nav-role=\"signin\"]")
    private WebElement helloButton;

    public void clickHelloButton()
    {
        clickElement(helloButton);
    }

    @FindBy(id = "ap_email")
    private WebElement mailTxt;

    public void typeMail(String txt)
    {
        sendKeysElements(mailTxt,txt);
    }

    @FindBy(xpath = "//*[@class=\"a-button a-button-span12 a-button-primary\"]")
    private WebElement mailButton;

    public void clickMailButton()
    {
        clickElement(mailButton);
    }

    @FindBy(id = "ap_password")
    private WebElement passTxt;

    public void typePass(String txt)
    {
        sendKeysElements(passTxt,txt);
    }

    @FindBy(id = "signInSubmit")
    private WebElement passButton;

    public void clickPassButton()
    {
        clickElement(passButton);
    }

    @FindBy(xpath = "(//*[@class=\"a-alert-heading\"])[1]")
    WebElement alertForWrongMailorPhone;
    @FindBy(xpath = "(//*[@class=\"a-alert-content\"])[4]")
    WebElement alertForInvalidMailorPhone;

    public void isPhoneAlertMessageDisplayed() {
        Assert.assertFalse("Invalid Mail or Phone",(isElementPresent(alertForInvalidMailorPhone)));
        Assert.assertFalse("Wrong Mail or Phone",(isElementPresent(alertForWrongMailorPhone)));
    }

    @FindBy(className = "a-list-item")
    WebElement alertForWrongPass;

    public void isPassAlertMessageDisplayed()
    {
        boolean control=isElementPresent(alertForWrongPass);

        if(!control)
        {
            System.out.println("Successfully SignIn");
        }
        Assert.assertFalse("Wrong Password",(control));

    }
}
