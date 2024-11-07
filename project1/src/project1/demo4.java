//forget password and user name 

package project1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class demo4 {

    public static void main(String[] args) {
        // Set the path to your WebDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en/community/signin.html");

            // Step 3: Click on "Forget Username"
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[2]/span[2]/a[1]"))).click();
            
            // Step 4: Fill in Details for Username Retrieval
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/div[1]/form/div[1]/input[1]"))).sendKeys("shweta@example.com");
            delay(5);
            // Step 5: Submit the Form
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/div[1]/form/div[2]/button")).click();

            // Assuming we need to navigate back or access the "Forget Password" from a different location
            driver.navigate().to("https://luma.enablementadobe.com/content/luma/us/en/community/signin.html");
            delay(5);

            // Step 6: Click on "Forget Password"
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[2]/span[2]/a[2]"))).click();
            
            // Step 7: Fill in Details for Password Reset
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/div[1]/form/div[1]/input[1]"))).sendKeys("shweta@example.com");
            
            // Step 8: Submit the Password Reset Form
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/div[1]/form/div[2]/button")).click();

            // Add assertions or checks as necessary to verify the expected outcomes
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
