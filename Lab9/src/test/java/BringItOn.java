import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BringItOn {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://pastebin.com");
        WebElement nameInput= driver.findElement(By.xpath("//*[@id=\"postform-name\"]"));
        nameInput.sendKeys("how to gain dominance among developers");
        WebElement codeInput= driver.findElement(By.xpath("//*[@id=\"postform-text\"]"));
        codeInput.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        driver.findElement(By.xpath("//*[@id=\"select2-postform-expiration-container\"]")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-postform-format-container\"]")).click();
        driver.findElement(By.xpath("//li[text()='Bash']")).click();

        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
