package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage extends AbstractHelper
{
    WebDriver driver;

    public SignInPage()
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


    @FindBy(id = "createAccountSubmit")//
    private WebElement accountSubmit;

    public void clickAccountSubmit()
    {
        clickElement(accountSubmit);
    }


    @FindBy(id = "ap_customer_name")//ap_customer_name
    private WebElement nameTxt;

    public void typeName(String txt)
    {
        sendKeysElements(nameTxt,txt);
    }


    @FindBy(id = "ap_email")//ap_customer_name
    private WebElement mailTxt;

    public void typeMail(String txt)
    {
        sendKeysElements(mailTxt,txt);
    }


    @FindBy(id = "ap_password")//ap_customer_name
    private WebElement passTxt;
    @FindBy(id = "ap_password_check")
    private WebElement passTxt2;

    public void typePass(String txt)
    {
        sendKeysElements(passTxt,txt);
        sendKeysElements(passTxt2,txt);
    }

    @FindBy(id = "continue")
    private WebElement continueButton;

    public void clickContinueButton()
    {
        clickElement(continueButton);
    }

    @FindBy(id = "cvf-aamation-challenge-iframe")
    private WebElement iframe;

    public void changeFrame()
    {
        driver.switchTo().frame(iframe);
    }

    @FindBy(xpath = "//*[@class=\"sc-nkuzb1-0 sc-d5trka-0 eZxMRy button\"]")
    private WebElement startPuzzleButton;

    public void clickStartPuzzleButton()
    {
        clickElement(startPuzzleButton);
    }
}
