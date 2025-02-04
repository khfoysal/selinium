import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class PlaceOrder {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#first-name")).sendKeys(" F  Test1");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("L  Test2");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("L  Test2");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#continue")).click();
        driver.findElement(By.cssSelector("#finish")).click();



    }
}
