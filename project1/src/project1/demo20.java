//luma contact

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class demo20 {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver.exe");

        // Initialize WebDriver and WebDriverWait
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://luma.enablementadobe.com/content/luma/us/en/about-us.html");

        try {
            // Click on the "Contact Luma" link
            WebElement contactLumaLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-31f5d67aad\"]/div[1]/div/div/div[3]/div/div[2]/ul/li[1]/article/a/span[1]")));
            contactLumaLink.click();

            // Fill in the required information
            WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("form-text-1099988975")));
            nameField.sendKeys("Shweta ");
            delay(2);

            WebElement emailField = driver.findElement(By.id("form-text-552840626"));
            emailField.sendKeys("shweta@gmail.com");
            delay(2);

            WebElement messageField = driver.findElement(By.id("form-text-301134498"));
            messageField.sendKeys("1235894562.");
            delay(5);

            // Click on the submit button
            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"form-button-26787124\"]"));
            submitButton.click();

            // Optionally, you can add verification steps here, such as checking for a success message.

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser session
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
