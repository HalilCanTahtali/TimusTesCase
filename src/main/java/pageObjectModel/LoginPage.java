package pageObjectModel;

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
}
