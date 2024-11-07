//mens option 

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class demo10 {

    public static void main(String[] args) {
        // Specify the path to your ChromeDriver if it's not in your system's PATH
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Navigate to the Luma homepage
            driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");

            // Maximize the window
            driver.manage().window().maximize();

            // Click on the "Men" option to navigate to the men's section
            // Note: Adjust the selector if necessary
            WebElement menOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-fd3cee8df8\"]/ul/li[2]/a")));
            menOption.click();

            // Wait for the "Men's Clothing" option to become clickable and click on it
            // Note: You might need to adjust the selector based on the actual structure of the webpage
            WebElement mensClothingOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[2]/div/div/div/p[2]/a")));
            mensClothingOption.click();

            WebElement jacket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-7cfb237d1e\"]/div[1]/div/div/div[5]/div/div[1]/div/a")));
            jacket.click();
            

            // Add the first product to the cart
            WebElement addToCartButtonFirst = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-d514571e48\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[1]/div/a")));
            addToCartButtonFirst.click();
            
           // WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-f6d1ed3dc7\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
            //cart.click();
            
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/products/men.html");
            
            WebElement pants = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-7cfb237d1e\"]/div[1]/div/div/div[5]/div/div[2]/div/a")));
            pants.click();
           

            // Add the first product to the cart
            WebElement cart1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-ae299b7984\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[1]/div/a")));
            cart1.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
