import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTest {

	public BrowserTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://innopasswordapp.azurewebsites.net/Account/Login?ReturnUrl=%2Fmypassword");
	}

}
