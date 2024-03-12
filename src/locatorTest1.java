import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;


public class locatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		//web driver method is the interface 
		//WebDriver driver = new ChromeDriver();  
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver3= new SafariDriver();
		//WebDriver driver2 = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //to open a page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait to take care of synchronization issue
		driver.findElement(By.id("inputUsername")).sendKeys("vidya.yadav@gmail.com"); //id selector
		driver.findElement(By.name("inputPassword")).sendKeys("randomPassword@230800"); //name selector
		driver.findElement(By.className("signInBtn")).click(); //class selector
		
		//using css selector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();   //linktext selector

		//using xpath selector
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("xyz"); //xpath selector
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("xyz@gmail.com"); //in case of multiple attribute with x path selector
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();//to clear the written text of the field
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("xyz@gmail.com");//in case of multiple attribute with css selector
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345678"); // xpath selector of child parent tags 
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click(); //css selector
		driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("xyz@gmail.com");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //css selector using regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	//xpath selector using regular expression	
		driver.findElement(By.className("logout-btn")).click();
		
		driver.close();   
		
		
}
}
