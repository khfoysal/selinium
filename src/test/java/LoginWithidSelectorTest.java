import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginWithidSelectorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("#user-name")).sendKeys("");
        driver.findElement(By.cssSelector("#password")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
