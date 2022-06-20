import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {

    @Test
    //in TestNg methods are not static. And void. And use special annotation @Test. And class Assert for comparing
        public void testAbbr4(){
        String result = Main.abbr("Anna", 4);
        Assert.assertEquals(result, "A...");

        }

    @Test
    //in TestNg methods are not static. And void. And use special annotation @Test. And class Assert for comparing
    public void testAbbr5(){
        String result = Main.abbr("Hello world", 8);
        Assert.assertEquals(result, "Hello...");

      }

    @Test
    public void testFirstSelenium() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.getTitle(); //=> "GOOGLE"

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // => "Selenium"

        driver.quit();

    }
}

