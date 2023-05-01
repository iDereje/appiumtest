# Youtube Mobile Demo

Welcome to the Youtube Mobile Demo! This is a simple Java project that demonstrates how to automate the Youtube app on an Android device using Appium.

## Usage

Before running this demo, you will need to have Appium set up on your machine and an Android emulator or device connected to your computer.

To run the demo:

1. Clone or download this repository to your local machine.
2. Open the `YoutubeMobile.java` file in your preferred Java IDE.
3. Update the `DesiredCapabilities` object with the appropriate capabilities for your device.
4. Run the `main` method in the `YoutubeMobile` class.

```java
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

    // Set desired capabilities
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    cap.setCapability("appPackage","com.google.android.youtube" );
    cap.setCapability("appActivity","com.google.android.apps.youtube.app.WatchWhileActivity" );

    // Create Android driver
    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    // TODO: Add your code for automating the Youtube app here

  }
}
```

## Working on Appium Projects

If you are interested in working on Appium projects, there are several resources available that can help you get started. The [Appium documentation](http://appium.io/docs/en/about-appium/intro/) is a great place to start, as it provides an introduction to Appium and covers the basics of setting up and running Appium tests.

Additionally, there are several online courses and tutorials that can help you develop your Appium skills. Some popular resources include:

- [Appium Pro](https://appiumpro.com/)
- [Test Automation University](https://testautomationu.applitools.com/appium-java-tutorial/)
- [Udemy](https://www.udemy.com/topic/appium/)

We hope that this demo has been helpful in getting you started with automating the Youtube app on Android using Appium. If you have any questions or comments, please feel free to reach out to us at [your email address]. Thank you for using our demo!
