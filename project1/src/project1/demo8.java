//home equiment 

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class demo8 {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");

            WebElement equiment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-702890ad52\"]/div[1]/div/div/div[3]/div/div[4]/div/a")));
            equiment.click();

            // Assume the page now shows products. We'll select the first two.
            // These selectors are placeholders and need to be replaced with actual ones.
            WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-4abedc7924\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[3]/div/a")));
            firstProduct.click();
            delay(2);

            // Add the first product to the cart
            WebElement addToCartButtonFirst = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-8883d75e29\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div/div/div[2]/div/button")));
            addToCartButtonFirst.click();
            
            // Wait for confirmation that the item has been added, then navigate back
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'confirmation-message')]"))); // This is a placeholder
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/products/gear.html");
            
            // Now select the second product
            WebElement secondProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-4abedc7924\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[8]/div/a")));
            secondProduct.click();
            delay(2);

            // Add the second product to the cart
            WebElement addToCartButtonSecond = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-18a25c53f1\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div/div/div[2]/div/button")));
            addToCartButtonSecond.click();
            
            
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
