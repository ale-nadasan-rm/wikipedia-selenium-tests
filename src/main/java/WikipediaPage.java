import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AlexandraNadasan on 02.04.2015.
 */
public class WikipediaPage {
    @FindBy(id = "firstHeading")
    private WebElement pageTitle;
    @FindBy(id = "searchInput")
    private WebElement searchInput;
    @FindBy(id = "searchButton")
    private WebElement searchButton;
    
    private WebDriver driver;

    public WikipediaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }
    
    public void searchFor(String searchTerm) {
        searchInput.clear();
        searchInput.sendKeys(searchTerm);
    }
    
    public WikipediaPage clickSearch() {
        searchButton.click();
        return new WikipediaPage(driver);
    }
}
