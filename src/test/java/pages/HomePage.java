package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }

    String baseURL = "facebook.com";
    By signInButtonBy = By.className("");


    String conflict = "sample";
    String conflict2 = "sammmmple";


    //********************* Page Methods **********************//
    //Go to Site
    public HomePage goToSite() {
        driver.get(baseURL);
        return this;
    }

    //Go To LoginPage
    public LoginPage goToLoginPage () {
        click(signInButtonBy);
        return new LoginPage(driver);
    }

}
