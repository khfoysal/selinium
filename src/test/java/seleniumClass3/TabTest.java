package seleniumClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/alerts");
        System.out.println("OutSide Iframe1 "+driver.findElement(By.cssSelector(".text-center")).getText());
        driver.switchTo().frame("frame1");
        System.out.println("Inside Iframe" +driver.findElement(By.id("Sample Heading")).getText());
        driver.switchTo().defaultContent();
        System.out.println("Outside Iframe2"+driver.findElement(By.cssSelector(".text-center")).getText());
        driver.quit();



    }


}
