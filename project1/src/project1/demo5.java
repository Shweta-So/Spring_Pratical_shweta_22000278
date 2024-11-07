//home page shop now 

package project1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class demo5 {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");

            // Click on the "Shop Now" button
            WebElement shopNowButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-702890ad52\"]/div[1]/div/div/div[2]/div/div/div/p[2]/a"))); // Update this XPath based on actual value
            shopNowButton.click();

            // Select and add first item to cart
            // Update XPaths based on actual values
            WebElement firstItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-f4560e5e2b\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[8]/div/a")));
            firstItem.click();
            
            WebElement addToCartButtonFirst = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-5226569efb\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div/div/div[2]/div/button")));
            addToCartButtonFirst.click();

            // Wait for item to be added to cart, then navigate back to products page
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'confirmation-modal')]"))); // Update this XPath based on actual value
            driver.navigate().back();

            // Repeat the process for the second item
            WebElement secondItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'product-item')])[2]")));
            secondItem.click();
            
            WebElement addToCartButtonSecond = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add to Cart')]")));
            addToCartButtonSecond.click();

            // After adding the second item, you can proceed to verify items in the cart or perform further actions
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up by closing the browser
            driver.quit();
        }
    }
}
