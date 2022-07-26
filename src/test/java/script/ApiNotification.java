package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiNotification {
	@Test
	public void apiDemos() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		//dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 7 pro");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		//dc.setCapability("noReset", true);
		URL url =new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		MobileElement continuebutton = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, continuebutton, 500);
		MobileElement okbutton = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(1, okbutton, 500);
		MobileElement app = (MobileElement) driver.findElementByAccessibilityId("App");
		driver.tap(1, app, 500);
		MobileElement notification=(MobileElement) driver.findElementByAccessibilityId("Notification");
		driver.tap(1, notification, 500);
		MobileElement incomingMessage = (MobileElement) driver.findElementByAccessibilityId("IncomingMessage");
		driver.tap(1, incomingMessage , 500);
		MobileElement tapShowAppNotification = (MobileElement) driver.findElementByAccessibilityId("Show App Notification");
		driver.tap(1, tapShowAppNotification  , 500);
		driver.openNotifications();
		MobileElement joe = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']"));
		driver.tap(1, joe, 200);
		
}
}
