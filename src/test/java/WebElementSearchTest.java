import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by AlexandraNadasan on 01.04.2015.
 */
public class WebElementSearchTest extends WikipediaTestBase {
    @Test
    public void searchingForAnExistingPage_redirectsToThatPage() throws Exception {
        WebElement searchInput = driver.findElement(By.id("searchInput"));

        searchInput.clear();
        searchInput.sendKeys("Golden Retriever");
        driver.findElement(By.id("searchButton")).click();

        assertThat(driver.findElement(By.id("firstHeading")).getText(), is("Golden Retriever"));
    }
}
