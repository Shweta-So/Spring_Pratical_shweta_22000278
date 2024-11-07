package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class demo23 {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver.exe");

        // Initialize WebDriver and WebDriverWait
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://luma.enablementadobe.com/content/luma/us/en/community.html");

        try {
            // Find all the options
            List<WebElement> options = driver.findElements(By.xpath("//ul[@class='section-items']/li"));

            // Click on the first option
            options.get(0).click();

            // Wait for a brief moment before proceeding to the next option
            Thread.sleep(2000); // Adjust the time as needed

            // Click on the second option
            options.get(1).click();

            // Wait for a brief moment before proceeding to the next option
            Thread.sleep(2000); // Adjust the time as needed

            // Repeat this process for each option...

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser session
            driver.quit();
        }
    }
}
