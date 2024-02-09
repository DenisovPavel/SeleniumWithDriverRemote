package practiceWithSelenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProfilePageTest extends AbstractTest{
    @Test
    @DisplayName("Change Birthday to new")
    void changeNameToNew() throws InterruptedException {
        driver.get("https://test-stand.gb.ru/login");
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.loginInSystem(getLogin(),getPassword());

        ProfilePage profilePage = new ProfilePage(driver,wait);
        profilePage.openProfilePage();
        profilePage.changeBirthday("08.02.2024");
        profilePage.buttonSaveClick();
        profilePage.closeFrameWindow();

        List<WebElement> searchElements = driver.findElements(By.cssSelector("div.content.svelte-vyyzan"));

        Assertions.assertEquals("08.02.2024",searchElements.get(1).getText());
    }
}
