import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HurtMePlenty {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://cloud.google.com/");
        WebElement inputSearch= driver.findElement(By.name("q"));
        inputSearch.click();
        inputSearch.sendKeys("Google Cloud Platform Pricing Calculator");
        inputSearch.submit();
        Thread.sleep(4000);

        WebElement gotoGoogleCloudPlatformCalculator=driver.findElement(By.partialLinkText("Google Cloud Platform Pricing Calculator"));
        gotoGoogleCloudPlatformCalculator.click();
        Thread.sleep(3000);

        driver.switchTo().frame(0);
        WebElement frame = driver.findElement(By.id("myFrame"));
        driver.switchTo().frame(frame);
        WebElement numberOfInstances= driver.findElement(By.name("quantity"));
        numberOfInstances.click();
        numberOfInstances.sendKeys("4");
        Thread.sleep(1500);

        WebElement series = driver.findElement(By.xpath("//*[@id=\"select_value_label_85\"]")); //series
        series.click();
        Thread.sleep(1500);
        WebElement seriesValue = driver.findElement(By.xpath("//md-option[@id='select_option_201']"));
        seriesValue.click();
        Thread.sleep(1500);

        WebElement machine = driver.findElement(By.xpath("//*[@id=\"select_value_label_86\"]")); //machine type
        machine.click();
        Thread.sleep(1500);
        WebElement machineValue = driver.findElement(By.xpath("//md-option[@id='select_option_428']"));
        machineValue.click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-checkbox[@aria-label='Add GPUs']")).click(); // add gpu checkbox
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='GPU type']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_474']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Number of GPUs']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_477']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Local SSD']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_450']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Datacenter location']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_229']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Committed usage']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_128']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@aria-label='Add to Estimate']")).click();
    }

}
