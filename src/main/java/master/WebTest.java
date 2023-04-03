package master;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTest {
    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\juran\\Downloads\\Selenium WebDrivers\\edgedriver_win64\\msedgedriver.exe");
    }
    @Test
    public void login() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
}
