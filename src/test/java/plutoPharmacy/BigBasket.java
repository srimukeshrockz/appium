package plutoPharmacy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasket {
@Test
public void big() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability("appPackage", "com.bigbasket.mobileapp");
	dc.setCapability("appActivity", ".activity.SplashActivity");
	dc.setCapability("noReset", true);
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	driver.openNotifications();
	driver.pressKeyCode(AndroidKeyCode.BACK);
	MobileElement options = (MobileElement) driver.findElement(By.id("com.bigbasket.mobileapp:id/iv_drawer"));
	driver.tap(1, options, 500);
	driver.swipe(800, 1800, 200, 1800, 4000);
	MobileElement categories = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Categories']"));
	driver.tap(1, categories, 500);
	scroll(driver,"text","Baby Care");
	MobileElement babyCare = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Baby Care']"));
	driver.tap(1, babyCare, 500);
	scroll(driver,"text","Baby Food & Formula");
	MobileElement babyFood = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='Baby Food & Formula']"));
	driver.tap(1, babyFood, 500);
	
	
	
}
public void scroll(AndroidDriver driver, String attributeName, String AttributeValue )
{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+AttributeValue+"\"))");
}
}
