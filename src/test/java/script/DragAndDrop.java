package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop {
@Test
public void drag() throws MalformedURLException
{
	DesiredCapabilities dc =new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
	dc.setCapability(MobileCapabilityType.UDID, "4bd2ca10");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	//MobileElement continuebutton = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	//driver.tap(1, continuebutton, 500);
	//MobileElement okaybutton = (MobileElement) driver.findElement(By.id("android:id/button1"));
	//driver.tap(1, okaybutton, 500);
	MobileElement views = (MobileElement) driver.findElementByAccessibilityId("Views");
	driver.tap(1, views, 500);
	MobileElement dragNDrop = (MobileElement) driver.findElementByAccessibilityId("Drag and Drop");
	driver.tap(1, dragNDrop, 500);
	MobileElement src = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	driver.tap(1, src, 500);
	MobileElement dst = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
	TouchAction ta=new TouchAction(driver);
	ta.longPress(src).moveTo(dst).release().perform();
	
	
	
	
	
}
}
