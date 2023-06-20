# Appium Testing Journey 

Welcome to my Appium testing repository! In this repository, I document my journey of learning Appium testing, starting with the first script. The provided code demonstrates how to interact with the YouTube mobile application using Appium.


## Prerequisites

Before getting started with Appium testing, make sure you have the following prerequisites in place:

1. Java Development Kit (JDK) installed on your machine.
2. Android SDK with necessary build tools and platform tools.
3. Node.js installed on your machine. You can download Node.js from the official website: [https://nodejs.org](https://nodejs.org)
4. Appium installed globally on your machine. Install Appium by running the following command in your terminal:

   ```shell
   npm install -g appium
   ```

5. An Android device or emulator connected to your machine.

## Setup Instructions

To set up your environment for Appium testing, follow these steps:

1. Clone this repository to your local machine using the following command:

   ```shell
   git clone https://github.com/iDereje/appiumtest.git
   ```

2. Open the project in your preferred Java IDE.

3. Configure the necessary dependencies in your project's build path:

   - Add the required Appium Java client library.
   - Add the necessary Selenium libraries.

4. Connect your Android device or start an emulator.

5. Open a new terminal window and start the Appium server by running the following command:

   ```shell
   appium
   ```

   This will start the Appium server and listen for connections on the default port (4723).

With these updates, you have the necessary prerequisites in place, including Node.js and running the Appium server through npm. Now you can proceed with running the test script.


## Test Script Explanation

The code in the `YoutubeMobile` class showcases my first Appium test script for automating actions within the YouTube mobile app. Let me explain the different sections of the script:

1. Setting Desired Capabilities:
   - I set the platform name to Android using `MobileCapabilityType.PLATFORM_NAME`.
   - The `appPackage` capability specifies the package name of the YouTube app.
   - The `appActivity` capability specifies the main activity of the YouTube app.

2. Creating an Android Driver:
   - I create an instance of the `AndroidDriver` class to establish a connection to the Appium server using the specified capabilities and server URL.

3. Searching for a Video:
   - To search for a video, I locate the search box element using its ID (`com.google.android.youtube:id/search_edit_text`).
   - I send the search query "Appium tutorial" to the search box.
   - The search button element is located by its ID (`com.google.android.youtube:id/search_button`).
   - I click the search button to perform the search.

4. Selecting a Search Result:
   - I locate the first search result using an XPath expression (`//android.widget.TextView[@text='Appium Java Tutorial - Complete Beginner's Guide']`).
   - I click on the first search result.

5. Playing the Video:
   - I locate the play button element by its ID (`com.google.android.youtube:id/player_control_play_pause_replay_button`).
   - I click the play button to start playing the video.

## Running the Test

To run the provided test script:

1. Make sure your Android device or emulator is connected and accessible.

2. Run the `main` method in the `YoutubeMobile` class.

3. Observe the execution of the script, which will perform the following actions:
   - Launch the YouTube app.
   - Search for the "Appium tutorial" video.
   - Select the first search result.
   - Play the video.

4. Check the execution output and verify that the actions were performed successfully.

## Next Steps

This script is just the beginning of my Appium testing journey. From here, I plan to explore and expand my test scenarios by interacting with different elements and performing various actions within the YouTube app. I will also delve into advanced Appium features and practices to enhance my testing capabilities.

I'm excited to continue exploring the world of Appium testing, experimenting with different scenarios, and integrating it into my test automation workflows. With Appium, I can automate tests across multiple platforms and devices, ensuring the quality and reliability of my mobile applications.

##

 Contributing

I welcome contributions to this repository! If you have any improvements, additional examples, or suggestions, please feel free to open a pull request.

## License

 Feel free to modify and use the code for your own purposes.

## Contact

For any questions or inquiries, please feel free to contact me at <br>
<a href="mailto:derejeisack@gmail.com"><img src="https://img.icons8.com/color/48/000000/gmail.png" alt="Email" width="40" height="40"/></a>

Thank you for joining me on my Appium testing journey!

Repository URL: [https://github.com/iDereje/appiumtest](https://github.com/iDereje/appiumtest)
