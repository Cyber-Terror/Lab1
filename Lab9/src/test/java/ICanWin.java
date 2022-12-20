import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ICanWin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://pastebin.com");
        WebElement codeInput= driver.findElement(By.xpath("//*[@id=\"postform-text\"]"));
        codeInput.sendKeys("Hello from WebDriver");
        WebElement nameInput= driver.findElement(By.xpath("//*[@id=\"postform-name\"]"));
        nameInput.sendKeys("helloweb");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"select2-postform-expiration-container\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        Thread.sleep(5000);
        driver.quit();

    }

}
