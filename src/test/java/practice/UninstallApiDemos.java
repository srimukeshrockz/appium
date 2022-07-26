package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UninstallApiDemos {
@Test
public void install() throws MalformedURLException
{
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
dc.setCapability(MobileCapabilityType.APPIUM_VERSION, "7.0.0");
dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 7 pro");
URL url=new URL("http://localhost:4723/wd/hub");
AndroidDriver driver=new AndroidDriver(url,dc);
//driver.installApp("‪C:\\Users\\DELL\\Desktop\\N\\ApiDemos-debug.apk");
driver.removeApp("io.appium.android.apis");

}

}
