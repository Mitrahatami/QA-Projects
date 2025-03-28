import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set up the WebDriver (you may need to download ChromeDriver and set the path)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testWebsiteTitle() {
        driver.get("https://www.example.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Example"));
    }

    @Test
    public void testSearchFunctionality() {
        driver.get("https://www.example.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("QA Testing");
        searchBox.submit();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("search"));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>

