package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchFunctionality() {
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        
        SearchResultsPage resultsPage = homePage.search("Selenium Tutorial");
        
        Assert.assertTrue(resultsPage.resultsLoaded(), "Search results should be loaded");
    }
}
