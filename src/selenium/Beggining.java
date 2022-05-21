package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Beggining {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\Yazhini\\eclipse-workspace\\JavaProgram\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("KRISHNARAJ");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("Started");
		System.out.println("Completed");
		driver.close();
	}



}
