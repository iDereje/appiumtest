Sure, here's an updated version of your README file with a table:

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

## Resources

If you are interested in working on Appium projects, there are several resources available that can help you get started. The following table lists some popular resources:

| Resource | Description |
| --- | --- |
| [Appium documentation](http://appium.io/docs/en/about-appium/intro/) | Provides an introduction to Appium and covers the basics of setting up and running Appium tests. |
| [Appium Pro](https://appiumpro.com/) | Offers weekly Appium tips and tricks, tutorials, and other Appium-related content. |
| [Test Automation University](https://testautomationu.applitools.com/appium-java-tutorial/) | Offers a free online course on Appium using Java. |
| [Udemy](https://www.udemy.com/topic/appium/) | Offers several paid courses on Appium for beginners and advanced users. |

We hope that this demo has been helpful in getting you started with automating the Youtube app on Android using Appium. If you have any questions or comments, please feel free to reach out to me Derejeisack@gmail.com
Thank you for using our demo!
