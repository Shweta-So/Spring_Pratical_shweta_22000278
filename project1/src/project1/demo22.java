//products

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo22 {

    public static void main(String[] args) {
        // Set the path to chromedriver
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://luma.enablementadobe.com/content/luma/us/en/products.html");
        driver.get("https://luma.enablementadobe.com/content/luma/us/en/products/women.html");
        driver.get("https://luma.enablementadobe.com/content/luma/us/en/products/men.html");


        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Find the product button element
            WebElement productButton = driver.findElement(By.xpath("//a[text()='Shop All Products']"));
            WebElement productButton1 = driver.findElement(By.xpath("//a[text()='Shop All Products']"));

            // Click on the product button
            productButton.click();

            // Wait for a few seconds to see the result
            Thread.sleep(5000); // Note: Thread.sleep() should be replaced with explicit waits

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}