package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //******************** Constructor *********//
    By usernameBy = By.id("");
    By passwordBy = By.id("");
    By loginButtonBy = By.id("");


    //*********************Page Methods *****************//
    public LoginPage login (String username, String password) {
        //Enter UserName
        writeText(usernameBy,username);
        writeText(passwordBy,password);
        click(loginButtonBy);
        return this;
    }
}
