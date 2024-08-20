package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.LoginPage;
import utilities.Driver;

public class LoginStepDefs
{
    LoginPage lp=new LoginPage();
    private WebDriver driver;
    @Given("User go to the amazon website")
    public void user_go_to_the_amazon_website()
    {
        driver= Driver.getDriver();
        driver.get("https://www.amazon.com.tr");
    }

    @When("User click the hello button")
    public void user_click_the_hello_button()
    {
        lp.clickHelloButton();
    }

    @When("user type mail or phone and click button {string}")
    public void user_type_mail_or_phone_and_click_button(String mail)
    {
        lp.typeMail(mail);
        lp.clickMailButton();
        //  //*[@id="auth-error-message-box"]/div/h4 //yanlış telefon numarası texti
    }

    @When("user type the password and click the button {string}")
    public void user_type_the_password_and_click_the_button(String pass)
    {
        lp.typePass(pass);
        lp.clickPassButton();
        //  //*[@id="auth-error-message-box"]/div/h4    // bir sorun oluştu texti
    }

    @Then("check the url contains signin")
    public void check_the_url_contains_signin()
    {
        System.out.println(driver.getCurrentUrl().contains("signin") ? "The URL contains signin words" : "The URL not contains signin words");
        Driver.closeDriver();
    }
}
