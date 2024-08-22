package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.SignInPage;
import utilities.Driver;

public class SignInStepDefs
{
    SignInPage sp=new SignInPage();
    private WebDriver driver;
    @Given("user go to the amazon website")
    public void user_go_to_the_amazon_website()
    {
        driver= Driver.getDriver();
        driver.get("https://www.amazon.com.tr");
    }
    @When("user click the welcome button")
    public void user_click_the_welcome_button()
    {
        sp.clickHelloButton();
    }
    @When("user click the create account button")
    public void user_click_the_create_account_button()
    {
        sp.clickAccountSubmit();
    }
    @When("user type name {string}, email {string}, password {string} and repassword then click next button")
    public void user_type_name_email_password_and_repassword_then_click_next_button(String name, String mail, String pass)
    {
        sp.typeName(name);
        sp.typeMail(mail);
        sp.typePass(pass);
        sp.clickContinueButton();
    }
    @Then("user click the start puzzle button")
    public void user_click_the_start_puzzle_button() throws InterruptedException {
        sp.changeFrame();
        Thread.sleep(2000);
        sp.clickStartPuzzleButton();
        Driver.closeDriver();
    }
}
