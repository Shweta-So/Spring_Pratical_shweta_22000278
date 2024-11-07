//connect us on social media (home page)

package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lab3 {

    public static void main(String[] args) {
        // Set the path to your chromedriver executable
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the Candymapper website
        driver.get("https://candymapper.com/");

        // Close any popup if present
        WebElement closeButton = driver.findElement(By.id("popup-widget46014-close-icon"));
        if (closeButton.isDisplayed()) {
            closeButton.click();
        }

        // Find and click on each social media icon/link
        navigateToSocialMediaPage(driver, "facebook.com");
        //navigateToSocialMediaPage(driver, "instagram.com");
        //navigateToSocialMediaPage(driver, "linkedin.com");
        //navigateToSocialMediaPage(driver, "pinterest.com");
        //navigateToSocialMediaPage(driver, "twitter.com");
        //navigateToSocialMediaPage(driver, "youtube.com");

        delay(20);
        // Close the browser
        driver.quit();
    }
    public static void delay(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted Exception");
        }
    }
    private static void navigateToSocialMediaPage(WebDriver driver, String socialMediaUrl) {
        WebElement socialMediaLink = driver.findElement(By.xpath("//a[contains(@href, '" + socialMediaUrl + "')]"));
        socialMediaLink.click();
        verifySocialMediaPage(driver, socialMediaUrl);
    }

    private static void verifySocialMediaPage(WebDriver driver, String socialMediaUrl) {
        // Verify if the browser has been redirected to the respective social media page
        if (driver.getCurrentUrl().contains(socialMediaUrl.toLowerCase())) {
            System.out.println(socialMediaUrl + " page opened successfully.");
        } else {
            System.out.println("Failed to open " + socialMediaUrl + " page.");
        }

        // Go back to the Candymapper website
        driver.navigate().back();
    }
}