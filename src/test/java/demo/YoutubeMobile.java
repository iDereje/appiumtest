package demo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class YoutubeMobile {
  public static void main(String[] args) throws MalformedURLException, InterruptedException {


    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    cap.setCapability("appPackage","com.google.android.youtube" );
    cap.setCapability("appActivity","com.google.android.apps.youtube.app.WatchWhileActivity" );
    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    // Search for a video
MobileElement searchBox = driver.findElement(By.id("com.google.android.youtube:id/search_edit_text"));
searchBox.sendKeys("Appium tutorial");

MobileElement searchButton = driver.findElement(By.id("com.google.android.youtube:id/search_button"));
searchButton.click();

// Click on the first search result
MobileElement searchResult = driver.findElement(By.xpath("//android.widget.TextView[@text='Appium Java Tutorial - Complete Beginner's Guide']"));
searchResult.click();

// Play the video
MobileElement playButton = driver.findElement(By.id("com.google.android.youtube:id/player_control_play_pause_replay_button"));
playButton.click();






  }}

