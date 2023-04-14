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
        System.setProperty("webdriver.http.factory", "jdk-http-client");
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
        driver.close();
    }

    @Test
    public void negativeUsernameTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameEditBox = driver.findElement(By.name("username"));
        WebElement passwordEditBox = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        boolean errorMessage = driver.getPageSource().contains("Your username is invalid!");

        usernameEditBox.sendKeys("incorrectUser");
        passwordEditBox.sendKeys("Password123");

        submitButton.click();

        assertTrue(errorMessage);
        driver.close();
    }

    @Test
    public void negativePasswordTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameEditBox = driver.findElement(By.name("username"));
        WebElement passwordEditBox = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        boolean errorMessage = driver.getPageSource().contains("Your password is invalid!");

        usernameEditBox.sendKeys("student");
        passwordEditBox.sendKeys("incorrectPassword");

        submitButton.click();

        assertTrue(errorMessage);
        driver.close();
    }
}
