package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    // Selectors identified during reverse engineering
    private final By searchInput = By.cssSelector("input[name='search_query']");
    private final By searchButton = By.cssSelector("button.ytSearchboxComponentSearchButton, button[aria-label='Search']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get("https://www.youtube.com");
    }

    public SearchResultsPage search(String query) {
        type(searchInput, query);
        click(searchButton);
        return new SearchResultsPage(driver);
    }
}
