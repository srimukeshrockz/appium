package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreenScript {
	@Parameters({"port","UDID","DeviceName","PlatformVersion"})
@Test
public void touchScreen(String port,String UDID, String DeviceName, String PlatformVersion) throws MalformedURLException, InterruptedException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, PlatformVersion);
	dc.setCapability(MobileCapabilityType.UDID, UDID);
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceName);
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
	driver.swipe(540, 50, 540, 2148, 10000);
	Thread.sleep(5000);
	driver.swipe(100, 1108, 1060, 1108, 10000);	
	
	
}
}
