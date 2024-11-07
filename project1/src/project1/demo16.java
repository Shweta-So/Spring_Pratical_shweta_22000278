//women's shop now

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class demo16 {

    public static void main(String[] args) {
        // Set path to your WebDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        driver.get("https://luma.enablementadobe.com/content/luma/us/en/women.html");

        // Directly click on "Shop Women's Clothing", assuming it's identifiable by unique text
        driver.findElement(By.xpath("//*[@id=\"page-a7e560b13f\"]/div[1]/div/div/div[2]/div/div/div/p[2]/a")).click();

        // Directly click on the first product listed on the page
        // Note: The specific method to locate the product will need to be adjusted based on the actual page structure
        driver.findElement(By.xpath("//*[@id=\"page-26c0d7c7c3\"]/div[1]/div/div/div[4]/div/div[2]/div/ul/li[9]/div/a")).click();

        // Click the "Add to Cart" button, assuming a generic identifier can be used
        driver.findElement(By.xpath("//*[@id=\"page-78cef98e67\"]/div[1]/div/div/div[3]/div/div/div[2]/form/div[5]/div/div[2]/div/button")).click();

        // Pausing to observe actions - Not recommended for actual test automation
        try {
            Thread.sleep(5000); // Pause for 5 seconds to observe actions
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clean up by closing the browser
        driver.quit();
    }
}
