package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import ObjectRepository.GeneralStorePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PomGeneralStoreLogin {
@Test
public void login() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	
	GeneralStorePage gst=new GeneralStorePage(driver);
	gst.Login();
}
}


//java.lang.RuntimeException: java.lang.NoSuchMethodException: jdk.proxy2.$Proxy7.proxyClassLookup()