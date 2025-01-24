import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\JMeter\\bin\\geckodriver.exe");
		  // Setup WebDriverManager to automatically manage the Edge driver
       // WebDriverManager.edgedriver().setup(); // Automatically downloads the correct msedgedriver version

		  // Initialize EdgeOptions and enable headless mode
      //  EdgeOptions options = new EdgeOptions();
        
        //options.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

      //  options.addArguments("--headless", "--disable-gpu", "--no-sandbox", "--disable-dev-shm-usage");
		
       // driver = new EdgeDriver(options);
		//driver = new EdgeDriver();
		
		//driver = new ChromeDriver();
		
		driver = new FirefoxDriver();
		
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
		
		//driver.quit();
	}

}
