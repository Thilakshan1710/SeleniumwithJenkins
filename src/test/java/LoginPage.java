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
		    By txt_username = By.xpath("//*[@id=\"username\"]");
		    By txt_password = By.xpath("//*[@id=\"password\"]");
		    By btn_login = By.xpath("/html/body/div/div/div/div/div/form[1]/div[3]/button");

		//By loginButton =By.xpath("//button[@title='Log in using your Microsoft account']");
		
		//Action methods 
		
		public void setUserName(String user)
		{
		    driver.findElement(txt_username).sendKeys(user);
		}   
		
		public void setPassWord(String password)
		{
			driver.findElement(txt_password).sendKeys(password);
		}
		
		public void clickLogin() 
		{
			driver.findElement(btn_login ).click();
		}
		
	

}
