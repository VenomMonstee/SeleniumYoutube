package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {
    private final By firstVideo = By.cssSelector("a#video-title");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public VideoPage clickFirstVideo() {
        click(firstVideo);
        return new VideoPage(driver);
    }

    public boolean resultsLoaded() {
        return isDisplayed(firstVideo);
    }
}
