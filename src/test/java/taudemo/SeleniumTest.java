package taudemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SeleniumTest {
 private WebDriver driver;
 private final String url = "https://www.google.com";



    @Before
    public void beforeAll() {
        System.setProperty("webdriver.chrome.driver","src/test/browserDrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void afterAll() {
        driver.close();
        driver.quit();
    }

    @Test
    public void openGoogleAndCheckTheTitle() {
        //Do something

        driver.get(url);
        assertEquals("Google", driver.getTitle());

    }

    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        //Do something
        driver.get(url);
        assertEquals("Google", driver.getTitle());
    }
}
