//men's stronest clothes.

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class demo13 {

    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");

            // Navigate to "Our Strongest Clothes" section. You need to adjust the selector based on the actual page structure.
            WebElement strongestClothesSection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[4]/div/a")));
            strongestClothesSection.click();

            // Directly select and add the first item to the cart
            WebElement firstItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-d514571e48\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[4]/div/a")));
            firstItem.click();
            WebElement addToCartButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-4f18eb9cc1\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
            addToCartButton1.click();

            // Navigate back to the "Our Strongest Clothes" section to add the second item
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/products/men/tops.html");
            WebElement secondItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-d514571e48\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[6]/div/a")));
            secondItem.click();
            WebElement addToCartButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-f7f0972c63\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")));
            addToCartButton2.click();

            // Additional steps may be necessary, such as handling modals or confirming items in the cart, based on the site's behavior.

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Optionally, close the browser
            // driver.quit();
        }
    }
}
