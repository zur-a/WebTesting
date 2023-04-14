package master;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestExceptions {
    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\juran\\Downloads\\Selenium WebDrivers\\edgedriver_win64\\msedgedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
    }

    @Test
    public static void test() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");
    }
}
