import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	void testLoginAndDashboard()
	{
		
		LoginPage loginPage  = new LoginPage(driver);
		
		loginPage .clickLogin();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tilesHolder']/div[2]/div/div/div/div[2]")));
				
	    DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickSomeElement();
	}
	
	@AfterClass
	void tearDown() 
	{
		try {
            // Delay for 5 seconds (5000 milliseconds)
            Thread.sleep(10000);  // Adjust time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		driver.quit();
	}

}
