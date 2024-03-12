import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class firstseltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		//web driver method is the interface 
		//WebDriver driver = new ChromeDriver();  
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver3= new SafariDriver();
		WebDriver driver2 = new EdgeDriver();
		
		driver2.get("https://sso.teachable.com/secure/9521/identity/login/password"); //to open a page
		System.out.println(driver2.getTitle()); // gets title of the current page
		System.out.println(driver2.getCurrentUrl()); //gets the url of the page in case to check you are not redirected
		//driver.close();                            // closes the browser. close only that tab
        //driver2.quit();                            // closes the tabs with all associated windows 
        }

}
