import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class retrievingpassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		String password = retrievePassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //to open a page
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("xyz@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	//xpath selector using regular expression	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait to take care of synchronization issue
		driver.findElement(By.className("logout-btn")).click();
		driver.quit();
		
	}
	
	public static String retrievePassword(WebDriver driver) throws InterruptedException{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //to open a page

		driver.findElement(By.linkText("Forgot your password?")).click();   //linktext selector

		//using xpath selector
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("xyz"); //xpath selector
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("xyz@gmail.com");//in case of multiple attribute with css selector
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345678"); // xpath selector of child parent tags 
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click(); //css selector
		
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		String password = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] password1 = password.split("password '");
		String[] password2 = password1[1].split("' to");
		return password2[0];
	}

}
