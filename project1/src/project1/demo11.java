//men's featured proudcts 

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class demo11 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");

                WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[2]/div/ul/li[1]/div/a")));
                addToCartButton.click();
                delay(5);

                // Wait for confirmation message or cart update
                // This part of the code may need to be adjusted based on how the website confirms the action
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-8dbaa85616\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
                
                driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
                
                WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[2]/div/ul/li[2]/div/a")));
                cart.click();
                delay(5);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"//*[@id=\"page-b70f46c1de\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
                
                driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
                
                WebElement cart1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[2]/div/ul/li[3]/div/a")));
                cart1.click();
                delay(5);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-d8363f7f1e\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
                
                driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
                
                WebElement cart2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div/div/div/div[3]/div/div[2]/div/ul/li[3]/we-product-item/div/a")));
                cart2.click();
                delay(5);
                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-d8363f7f1e\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
                
                driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
                
                WebElement cart3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div/div/div/div[3]/div/div[2]/div/ul/li[4]/we-product-item/div/a")));
                cart3.click();
                delay(5);
                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-73d4254d51\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
                
                driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
                
                WebElement cart4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div/div/div/div[3]/div/div[2]/div/ul/li[5]/we-product-item/div/a")));
                cart4.click();
                delay(5);
               // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-49cbefcbd7\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));                

                System.out.println("Product added to cart successfully.");
            
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
