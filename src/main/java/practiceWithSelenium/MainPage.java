package practiceWithSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @params MainPage  - pattern PageObject -> главной страницы и создания поста;
 */
public class MainPage {
    private final WebDriverWait wait;
    @FindBy(id = "create-btn")
    WebElement createNewPost;
    public MainPage(WebDriver driver,WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void createPost() {
        createNewPost.click();
    }
}