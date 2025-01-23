import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
		
		
		// Constructor 
		LoginPage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		//Locators
		
		By loginButton =By.xpath("//button[@title='Log in using your Microsoft account']");
		
		//Action methods 
		
		public void clickLogin() 
		{
			driver.findElement(loginButton ).click();
		}
		
	

}
