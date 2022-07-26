package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeOnTouchScreenApp {
	@Parameters({"port","UDID","DeviceName","PlatformVersion"})
	@Test
	public void touchScreen(String port,String UDID, String DeviceName, String PlatformVersion) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, PlatformVersion);
		dc.setCapability(MobileCapabilityType.UDID, UDID);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,DeviceName);
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		URL url= new URL("http://localhost:"+port+"/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(5000);
		
		
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(height);
		System.out.println(width);
		
		
		driver.swipe(360, 20, 360, 2218, 10000);
		driver.swipe(720, 20, 720, 2218, 10000);
		driver.swipe(20,739, 1080, 739, 10000);
		driver.swipe(40,1478, 1080, 1478, 10000);
		
		
	}

}
