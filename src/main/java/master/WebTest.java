package master;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebTest {
    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\juran\\Downloads\\Selenium WebDrivers\\edgedriver_win64\\msedgedriver.exe");
    }
    @Test
    public void positiveLoginTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameEditBox = driver.findElement(By.name("username"));
        WebElement passwordEditBox = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        boolean succesfulMessage = driver.getPageSource().contains("Congratulations");

        usernameEditBox.sendKeys("student");
        passwordEditBox.sendKeys("Password123");

        submitButton.click();

        assertTrue(succesfulMessage);
    }

}
