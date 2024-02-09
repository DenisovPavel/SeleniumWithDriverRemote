package practiceWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    private final WebDriverWait wait;

    @FindBy(xpath = "//div[@class='mdc-menu mdc-menu-surface']/..")
    WebElement buttonProfile;

    @FindBy(xpath = "//span[contains(text(),'Profile')]")
    WebElement buttonInListFirst;

    @FindBy(xpath = "//button[@title='More options']")
    WebElement buttonEdit;

    @FindBy(xpath = "//input[@type='file']")
    WebElement editProfile;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSave;

    @FindBy(xpath = "//input[@type='date']")
    WebElement inputBirthday;
    @FindBy(xpath = "//button[@data-mdc-dialog-action='close']")
    WebElement buttonCloseWindowFrame;


    public String getNewBirthdayDate() {
        return wait.until(ExpectedConditions.visibilityOf(inputBirthday)).getText();
    }
    //
    public void openProfilePage() {
        wait.until(ExpectedConditions.visibilityOf(buttonProfile)).click();
        buttonInListFirst.click();
    }

//        public void clickEditButtonInProfilePage(String path) throws InterruptedException {
//            wait.until(ExpectedConditions.visibilityOf(buttonEdit)).click();
//            Thread.sleep(5000l);
////        editProfile.shouldBe(visible).click(); // после клика открывается окно windows
////            editProfile.shouldBe(visible).uploadFile(new File(path));
////            Selenide.sleep(5000);
////            buttonSave.shouldBe(visible).click();
//        }

    public void changeBirthday(String newBirthday) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(buttonEdit)).click();
        Thread.sleep(5000l);
        wait.until(ExpectedConditions.visibilityOf(inputBirthday)).sendKeys(newBirthday);
    }

    public void buttonSaveClick() throws InterruptedException {
        Thread.sleep(5000l);
        buttonSave.click();
    }

    public void closeFrameWindow() throws InterruptedException {
        Thread.sleep(5000l);
        buttonCloseWindowFrame.click();
    }

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }
}
