package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApiDemos {
@Test
public void installApiDemos() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi API 30");
	dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\DELL\\Downloads\\ApiDemos-debug.apk");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);	
	}
}
