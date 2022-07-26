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

public class ScrollGeneralStore {
	
	@Test
	public void store() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		MobileElement dropdown = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
		driver.tap(1, dropdown, 500);
		//String attributeName="text";
	//	String AttributeValue="India";
		scroll(driver, "text", "India");
		MobileElement india = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='India']"));
		driver.tap(1, india, 500);
	}
	public static void scroll(AndroidDriver driver,String attributeName, String AttributeValue)
	{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+AttributeValue+"\"))");
	}

}
