package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchPage extends AbstractHelper
{
    WebDriver driver;
    public SearchPage()
    {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "sp-cc-accept")
    private WebElement cookiesAcceptButton;

    public void clickCookies()
    {
        clickElement(cookiesAcceptButton);
    }

    @FindBy(id = "nav-hamburger-menu")
    private WebElement allButton;

    public void clickAllButton()
    {
        clickElement(allButton);
    }

    @FindBy(xpath = "//*[@class=\"hmenu hmenu-visible\"]/li[10]/a")
    private WebElement computerButton;

    public void clickComputerButton()
    {
        clickElement(computerButton);
    }

    @FindBy(xpath = "//*[@class=\"hmenu hmenu-visible hmenu-translateX\"]/li[3]/a")
    private WebElement notebookButton;

    public void clickNotebook() throws InterruptedException {
        clickwithJS(notebookButton);
    }

    @FindBy(xpath = "//*[@aria-labelledby=\"Windows 11 Home\"]")
    private WebElement win11HomeButton;

    public void clickWin11HomeButton() throws InterruptedException {
        clickwithJS(win11HomeButton);
    }

    @FindBy(xpath = "(//*[@id=\"filter-p_n_operating_system_browse-bin\"]/span/span)[2]/li/span/a")
    private WebElement winn11ProButton;

    public void clickWin11ProButton() throws InterruptedException {
        clickwithJS(winn11ProButton);
    }

    @FindAll({@FindBy(xpath = "//*[@class=\"a-price-whole\"]")})
    private List<WebElement> prices;

    public void PrintAllPrices()
    {
        PrintAllElementOnList(prices);
    }



}
