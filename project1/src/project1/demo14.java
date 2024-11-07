//warmest jacket 

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class demo14 {

    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");

            // Navigate to "Our Strongest Clothes" section. You need to adjust the selector based on the actual page structure.
            WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[5]/div/a")));
            cart.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Optionally, close the browser
            // driver.quit();
        }
    }
}
