import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.sportmaster.by/");
        Thread.sleep(2000);
        WebElement nameInput= driver.findElement(By.xpath("//*[@id=\"autocomplete-ajax\"]"));
        nameInput.sendKeys("$@#@#@%#@");
        nameInput.submit();
        Thread.sleep(2000);
        driver.quit();
    }
}
