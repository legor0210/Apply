package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup() {

        System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();

        //Maximized Window

        driver.manage().window().maximize();
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
