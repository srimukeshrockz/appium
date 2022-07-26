package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApiDemosAndNetwork {
@Test
public void ApiDemos() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 7 pro");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	ScreenOrientation screen = driver.getOrientation();
	System.out.println(screen);
	//driver.rotate(ScreenOrientation.LANDSCAPE);
	//driver.setConnection(Connection.AIRPLANE);
	//driver.setConnection(Connection.DATA);
	//driver.setConnection(Connection.WIFI);
	//driver.setConnection(Connection.ALL);
	//driver.runAppInBackground(10);	// run app in background 
	//driver.startActivity("com.androidsample.generalstore", ".SplashActivity");
	//driver.startActivity("io.appium.android.apis", "ApiDemos");
	driver.rotate(ScreenOrientation.LANDSCAPE);
	
	
	
}
}
