//about us 

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class demo21 {

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
            // Click on the "Customer Service" link
            WebElement customerServiceLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-31f5d67aad\"]/div[1]/div/div/div[3]/div/div[2]/ul/li[2]/article/a/span[1]")));
            customerServiceLink.click();
            
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/about-us.html");

            // Click on the "Luma Privacy Policy" link
            WebElement privacyPolicyLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-31f5d67aad\"]/div[1]/div/div/div[3]/div/div[2]/ul/li[3]/article/a/span[1]")));
            privacyPolicyLink.click();

            // Optionally, you can add verification steps here, such as checking the title of the privacy policy page.

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser session
            driver.quit();
        }
    }
}
