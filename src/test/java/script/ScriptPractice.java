package script;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScriptPractice {
@Test
public void apiDemos() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 7 pro");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url =new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	MobileElement continuebutton = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	driver.tap(1, continuebutton, 500);
	MobileElement okbutton = (MobileElement) driver.findElement(By.id("android:id/button1"));
	driver.tap(1, okbutton, 500);
	MobileElement views = (MobileElement) driver.findElementByAccessibilityId("Views");
	driver.tap(1, views, 500);
	MobileElement controls=(MobileElement) driver.findElementByAccessibilityId("Controls");
	driver.tap(1, controls, 500);
	MobileElement theme = (MobileElement) driver.findElementByAccessibilityId("1. Light Theme");
	driver.tap(1, theme, 500);
	driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("mukesh");
	MobileElement ch1 = (MobileElement) driver.findElementByAccessibilityId("Checkbox 1");
	driver.tap(1, ch1, 500);
	MobileElement ch2 = (MobileElement) driver.findElementByAccessibilityId("Checkbox 2");
	driver.tap(1, ch2, 500);
	MobileElement Rd1 = (MobileElement) driver.findElementByAccessibilityId("RadioButton 1");
	driver.tap(1, Rd1, 500);
	MobileElement Rd2=(MobileElement) driver.findElementByAccessibilityId("RadioButton 2");
	driver.tap(1, Rd2, 500);
	MobileElement star = (MobileElement) driver.findElementByAccessibilityId("Star");
	driver.tap(1, star, 500);
	MobileElement toggle1 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
	driver.tap(1, toggle1, 500);
	MobileElement toggle2 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
	driver.tap(1, toggle2, 500);
	driver.hideKeyboard();
	MobileElement drop = (MobileElement) driver.findElement(By.id("android:id/text1"));
	driver.tap(1, drop, 500);
	MobileElement earth = (MobileElement) driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Earth']"));
	driver.tap(1, earth, 500);
	MobileElement drop1 = (MobileElement) driver.findElement(By.id("android:id/text1"));
	driver.tap(1, drop1, 500);
	List<WebElement> values = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
	for(WebElement val:values)
	{
		System.out.println(val.getText());
	}
}

}
