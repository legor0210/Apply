package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {

    HomePage homePage;

    @BeforeClass
    public void beforeClass() {
        homePage = new HomePage(driver);
    }

    @Test
    public void tc1(){
        homePage.goToSite();

    }
}
