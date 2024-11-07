package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://candymapper.com/.");
		delay(10);
		driver.close();
		

	}
	public static void delay(int sec) {
		try {
			TimeUnit.SECONDS.sleep(sec);
		}
		catch(InterruptedException ie) {
			System.out.print("false");
		}

	}

}