import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//locator - parent from child(//) , siblings to siblings traverse
		driver.findElement(By.xpath("//header//div//button[1]/following-sibling::button[1]")).click(); //to click on login button
		//driver.quit();
		
		
		//locator - child to parent - not possible in css selector
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).click();
		
		

	}

}
