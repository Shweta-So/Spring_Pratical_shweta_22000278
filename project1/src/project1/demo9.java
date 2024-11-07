//home page down ***

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class demo9 {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.manage().window().maximize();
            driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");

            // Scroll to the "Beginner's Luck" section
            // This assumes "Beginner's Luck" is a button or a link text. You may need to change it to an appropriate locator.
            //WebElement beginnersLuckSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Beginner\'s Luck')]")));
            //js.executeScript("arguments[0].scrollIntoView(true);", beginnersLuckSection);
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            // Wait for the element to be clickable before clicking
            WebElement secondProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"page-702890ad52\\\"]/div[1]/div/div/div[3]/div/div[11]/ul/li[1]/article/a/span[1]")));
            secondProduct.click();
           
            
            // Add any further actions you wish to perform within the "Beginner's Luck" section here
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up by closing the browser
            driver.quit();
        }
    }
}
