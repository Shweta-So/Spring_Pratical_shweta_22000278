//men's top tories

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class demo15 {

    public static void main(String[] args) {
        // Set path to your chromedriver.exe
       // System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        try {
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
            driver.manage().window().maximize();

            // Adjust the selector based on the actual button/link for "Our Warmest Jackets"
            // This might be an XPath or CSS Selector depending on the structure of the webpage.
            // The example below uses a placeholder XPath.
            WebElement warmestJacketsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[7]/ul/li[1]/article/a/span[1]")));
            warmestJacketsLink.click();
            
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
            
            WebElement warming = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[7]/ul/li[2]/article/a/span[1]")));
            warming.click();
            
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");
            
            WebElement keepmoving  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[7]/ul/li[3]/article/a/span[1]")));
            keepmoving.click();
            delay(5);

            // Add any further actions here (e.g., assertions to confirm the page has navigated or interact with items on the new page)

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
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
