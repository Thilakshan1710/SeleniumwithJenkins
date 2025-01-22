import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
	
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://innopasswordapp.azurewebsites.net/Account/Login?ReturnUrl=%2Fmypassword");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin()
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLogin();
		
	}
	
	@AfterClass
	void tearDown() 
	{
		
		driver.quit();
	}

}
