import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver driver;

    // Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for the element after login
    private By someElement = By.xpath("//*[@id='tilesHolder']/div[2]/div/div/div/div[2]");

    // Method to click on the element after login
    public void clickSomeElement() {
        WebElement element = driver.findElement(someElement);
        element.click();
    }
}
