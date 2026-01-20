package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.VideoPage;

public class VideoPlayerTest extends BaseTest {

    @Test
    public void testVideoPlaybackAndJSControl() {
        HomePage homePage = new HomePage(driver);
        homePage.goTo();

        SearchResultsPage resultsPage = homePage.search("Selenium Tutorial");
        VideoPage videoPage = resultsPage.clickFirstVideo();

        // Wait for video to load/autostart
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        // Reverse Engineering Verification: Check state via YouTube API
        Long stateBefore = videoPage.getPlayerState();
        System.out.println("Initial Player State: " + stateBefore);

        // Pause via JS
        videoPage.pauseVideoJS();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        Long stateAfterPause = videoPage.getPlayerState();
        Assert.assertEquals(stateAfterPause, Long.valueOf(2), "Player state should be 2 (Paused)");

        // Play via JS
        videoPage.playVideoJS();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        Long stateAfterPlay = videoPage.getPlayerState();
        Assert.assertEquals(stateAfterPlay, Long.valueOf(1), "Player state should be 1 (Playing)");
    }
}
