import org.junit.Test;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by AlexandraNadasan on 01.04.2015.
 */
public class DuplicateCodeSearchTest extends WikipediaTestBase {
    @Test
    public void searchingForAnExistingPage_redirectsToThatPage() throws Exception {
        driver.get("http://www.en.wikipedia.org");
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys("Golden Retriever");
        driver.findElement(By.id("searchButton")).click();

        assertThat(driver.findElement(By.id("firstHeading")).getText(), is("Golden Retriever"));
    }
}
