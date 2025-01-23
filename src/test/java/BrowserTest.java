import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://innopasswordapp.azurewebsites.net/Account/Login?ReturnUrl=%2Fmypassword");
				
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form[2]/button")); 
		 
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tilesHolder']/div[2]/div/div/div/div[2]")));
				 
		element.click();
	}

}
