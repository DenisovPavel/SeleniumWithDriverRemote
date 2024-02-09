package practiceWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @params LoginPage - pattern PageObject -> авторизация странице;
 */
public class LoginPage {

    private final WebDriverWait wait;
    @FindBy(xpath = "//*[@type='text']")
    private WebElement loginField;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@class='mdc-button__label']")
    private WebElement button;


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void loginInSystem(String login1, String password1) {
        loginField.sendKeys(login1);
        passwordField.sendKeys(password1);
        wait.until(ExpectedConditions.visibilityOf(button)).click();
    }

    public void LoginInSystemWithOutParams() {
        //  loginField.sendKeys(null);
        //passwordField.sendKeys(null);
        button.click();
    }

}