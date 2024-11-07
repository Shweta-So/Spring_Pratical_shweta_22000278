//login 

package project1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class demo3 {

    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the URL
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/community/signin.html");
            // Assuming the user is not already on the login page, locate and click the login/sign-in link or button
            // For demonstration, I'm directly going to the login URL
            // In a real scenario, if there's a specific login button on the homepage, you would click that
            // Example: driver.findElement(By.id("signInLink")).click();

            // Wait for the login fields to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // Enter the email address
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[1]/input[1]")));
            emailField.sendKeys("shweta@gmail.com");

            // Enter the password
            WebElement passwordField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[1]/input[2]"));
            passwordField.sendKeys("shweta123");

            // Click the login button
            WebElement loginButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[2]/button"));
            loginButton.click();
            delay(5);

            // Add any assertions here to verify successful login
            // For example, you might check for the presence of a logout link or a specific welcome message

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up by closing the browser
            driver.quit();
        }
    }
    public static void delay(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted Exception");
        }
    }
}
