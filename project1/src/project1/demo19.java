//equipment

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class demo19 {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver.exe");

        // Initialize WebDriver and WebDriverWait
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://luma.enablementadobe.com/content/luma/us/en/equipment.html");

        try {
            // Click on "Shop Our Gear" link
            WebElement shopOurGearLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-cef1e20e21\"]/div[1]/div/div/div[2]/div/div/div/p[2]/a")));
            shopOurGearLink.click();

            // Add the first item to the cart
            WebElement firstAddToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-4abedc7924\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[5]/div/a")));
            firstAddToCartButton.click();
            delay(2);

            // Add the second item to the cart
            WebElement secondAddToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-149121f9e3\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div/div/div[2]/div/button")));
            secondAddToCartButton.click();
            delay(2);

            // Optionally, you can add verification steps here, such as checking if the items are added to the cart.

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser session
            driver.quit();
            delay(2);
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
