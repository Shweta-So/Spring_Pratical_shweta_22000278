//home men 

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class demo7 {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");

           
            WebElement clickmen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-702890ad52\"]/div[1]/div/div/div[3]/div/div[3]/div/a")));
            clickmen.click();

            WebElement jacket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-7cfb237d1e\"]/div[1]/div/div/div[5]/div/div[1]/div/a")));
            jacket.click();
            delay(2);

            // Add the first product to the cart
            WebElement addToCartButtonFirst = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-d514571e48\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[1]/div/a")));
            addToCartButtonFirst.click();
            
           // WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-f6d1ed3dc7\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
            //cart.click();
            
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/products/men.html");
            
            WebElement pants = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-7cfb237d1e\"]/div[1]/div/div/div[5]/div/div[2]/div/a")));
            pants.click();
            delay(2);

            // Add the first product to the cart
            WebElement cart1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-ae299b7984\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[1]/div/a")));
            cart1.click();
            
            
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
