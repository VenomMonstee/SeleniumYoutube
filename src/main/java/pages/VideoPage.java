package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideoPage extends BasePage {
    private final By playPauseButton = By.className("ytp-play-button");
    private final By muteButton = By.className("ytp-mute-button");

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    public void togglePlay() {
        click(playPauseButton);
    }

    public void toggleMute() {
        click(muteButton);
    }

    /**
     * Reverse Engineered Method: Check playback state via YouTube's internal player API.
     * @return 1 for playing, 2 for paused, etc.
     */
    public Long getPlayerState() {
        return (Long) executeJSWithReturn("return document.getElementById('movie_player').getPlayerState()");
    }

    /**
     * Reverse Engineered Method: Play video programmatically via JS API.
     */
    public void playVideoJS() {
        executeJS("document.getElementById('movie_player').playVideo()");
    }

    /**
     * Reverse Engineered Method: Pause video programmatically via JS API.
     */
    public void pauseVideoJS() {
        executeJS("document.getElementById('movie_player').pauseVideo()");
    }
}
