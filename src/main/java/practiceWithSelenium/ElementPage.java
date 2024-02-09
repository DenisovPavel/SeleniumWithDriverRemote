package practiceWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @params ElementPage - отдельный случай PageObject;
 */
public class ElementPage {
    private final WebDriverWait wait;
    @FindBy(xpath = "//button")
    List<WebElement> elements;

    public ElementPage(WebDriver driver,WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait=wait;
    }

    public void deletePost() {
        elements.get(1).click();
    }
    public void editButton(){
        elements.get(0).click();
    }
}