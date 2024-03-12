import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class tagLocatorAndAssertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("xyz@gmail.com");

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());  //tag selector
		Assert.assertEquals(driver.findElement( By.cssSelector("div[class='login-container'] p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()); //css selector parent to child
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h1")).getText());
        //driver.findElement(By.xpath("//[text()='Log Out']")).click(); identifying selector based on text * stands for anything or you can use
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
	}

}
