//create account

package project1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class demo2 {

    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the URL
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/community/signin.html");

            // Wait for the Create Account button to be clickable and click it
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[2]/span[1]/a")));
            createAccountButton.click();
            
            

            // Fill in the form - Example fields (Change according to actual field names and ids)
       
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[1]/div/input")).sendKeys("Shweta");
            delay(2);
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[2]/div/input")).sendKeys("Solanki");
            delay(2);
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[3]/div/input")).sendKeys("shweta@gmail.com");
            delay(2);
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[6]/div/input")).sendKeys("shweta123");
            delay(2);
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[7]/div/input")).sendKeys("shweta123");
            delay(10);

            // Assume there's a 'Create an Account' button to submit the form - adjust the selector accordingly
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[8]/div/button[1]")).click();

            // Add assertions here to verify account creation if needed
            // For example, checking for a welcome message, etc.

        } finally {
            // Clean up and close the browser
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
