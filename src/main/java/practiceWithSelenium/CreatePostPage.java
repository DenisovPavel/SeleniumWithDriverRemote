package practiceWithSelenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @params CreatePostPage - pattern PageObject -> создания Поста на странице;
 */
public class CreatePostPage {
    private final WebDriverWait wait;
    @FindBy(xpath = "//*[@type='text']")
    private WebElement title;
    @FindBy(xpath = "//textarea[@class='mdc-text-field__input']")
    private WebElement description;
    @FindBy(xpath = "//*[@type='submit']")
    private WebElement buttonSave;


    public CreatePostPage(WebDriver driver,WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait=wait;
    }

    public void savePost(String titleText, String descriptionText) {
        title.sendKeys(titleText);
        description.sendKeys(descriptionText);
        buttonSave.click();
    }
}

