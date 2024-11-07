//all men's product.

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class demo12 {

    public static void main(String[] args) {
        // Set the path to the WebDriver, if not already in your PATH
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/men.html");

            // Wait for and then click on the 'All Men's Products' link or button
            WebElement allMensProductsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-e590d8a77d\"]/div[1]/div/div/div[3]/div/div[3]/a")));
            allMensProductsLink.click();

            // Optionally, perform further actions here, like verifying that the click worked by checking the URL, page title, or an element on the resulting page

            System.out.println("Clicked on All Men's Products successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
