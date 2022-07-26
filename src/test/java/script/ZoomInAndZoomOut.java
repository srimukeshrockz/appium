package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZoomInAndZoomOut {
@Test
public void Zoom() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
	dc.setCapability("appActivity", ".MainActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	MobileElement continuebutton = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	driver.tap(1, continuebutton, 500);
	MobileElement okaybutton = (MobileElement) driver.findElement(By.id("android:id/button1"));
	driver.tap(1, okaybutton, 500);
	MobileElement basicfeature = (MobileElement) driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures"));
	driver.tap(1, basicfeature, 500);
	MobileElement img = (MobileElement) driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	driver.zoom(img);
	driver.pinch(img);
	//driver.zoom(400, 500);
	//driver.pinch(500,300);
	
	
	
}
}
