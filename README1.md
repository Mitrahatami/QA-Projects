import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testSample() {
        driver.get("https://www.example.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Example"));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}

