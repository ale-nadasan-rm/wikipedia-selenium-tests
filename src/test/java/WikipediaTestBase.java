import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by AlexandraNadasan on 02.04.2015.
 */
public class WikipediaTestBase {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://www.en.wikipedia.org");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
