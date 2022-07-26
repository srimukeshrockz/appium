package script;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartServer {
	public static void main(String [] args) throws MalformedURLException, Throwable {
		DesiredCapabilities dc=new DesiredCapabilities();
		//AppiumDriverLocalService server=new AppiumDriverLocalService.buildDefaultService();      // this code will start server with default number as 4723
		AppiumDriverLocalService server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
			.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
			.usingPort(4723)
			.withLogFile(new File(".‪./appium4/LogFile/new.txt")));
		server.start();
		Thread.sleep(9000);
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("noRest", true);
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		ScreenOrientation screen = driver.getOrientation();
		driver.rotate(screen);
		server.stop();
		
}


}
