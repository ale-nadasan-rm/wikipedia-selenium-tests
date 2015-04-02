import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by AlexandraNadasan on 02.04.2015.
 */
public class PageObjectsSearchTest extends WikipediaTestBase {
    @Test
    public void searchingForAnExistingPage_redirectsToThatPage() throws Exception {
        WikipediaPage page = new WikipediaPage(driver);

        page.searchFor("Golden Retriever");
        WikipediaPage retrieverPage = page.clickSearch();

        assertThat(retrieverPage.getPageTitle(), is("Golden Retriever"));
    }
}
