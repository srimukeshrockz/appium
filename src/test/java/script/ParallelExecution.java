package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelExecution {
	@Parameters({"port","UDID","DeviceName","PlatformVersion"})
	@Test
	public void ApiDemos(String port,String UDID, String DeviceName, String PlatformVersion) throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, PlatformVersion);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceName);
		dc.setCapability(MobileCapabilityType.UDID, UDID);
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url=new URL("http://localhost:"+port+"/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);

}
}
