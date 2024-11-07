//home women 

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class demo6 {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");

            // Navigate to the "DISCOVER THE FINEST IN YOGA FASHION FROM LUMA" section
            // This might require scrolling to the section or clicking on a navigation link
            // For demonstration, let's assume we are clicking on a link that takes us there
            WebElement yogaFashionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-702890ad52\"]/div[1]/div/div/div[3]/div/div[2]/div/a")));
            yogaFashionLink.click();

            // Assume the page now shows products. We'll select the first two.
            // These selectors are placeholders and need to be replaced with actual ones.
            WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-26c0d7c7c3\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[1]/div/a")));
            firstProduct.click();
            delay(2);

            // Add the first product to the cart
            WebElement addToCartButtonFirst = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-3d674bd2cd\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
            addToCartButtonFirst.click();
            
            // Wait for confirmation that the item has been added, then navigate back
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'confirmation-message')]"))); // This is a placeholder
            driver.navigate().back();
            
            // Now select the second product
            WebElement secondProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-26c0d7c7c3\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[2]/div/a")));
            secondProduct.click();
            delay(2);

            // Add the second product to the cart
            WebElement addToCartButtonSecond = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-5487eaa530\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
            addToCartButtonSecond.click();
            
            // Confirmation for the second item
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'confirmation-message')]"))); // Placeholder

            // Further actions can be performed here, such as checking the cart contents
            
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
