import org.openqa.selenium.chrome.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //using index
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='ATQ']")).click();
		

		//Auto suggestive drop downs
			driver.findElement(By.id("autosuggest")).sendKeys("Ind");
			Thread.sleep(3000);
			List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
			for (WebElement option: options) {
				if(option.getText().equalsIgnoreCase("India")) {
					option.click();
					break;
					
				}			
				}
			//driver.
			//driver.close();
	}

}
