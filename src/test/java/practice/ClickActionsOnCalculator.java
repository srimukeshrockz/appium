package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.internal.JsonToMobileElementConverter;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClickActionsOnCalculator {
	public AndroidDriver driver;
@Test
public void calculator() throws MalformedURLException, Throwable
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 7 pro");
	dc.setCapability("appPackage", "com.miui.calculator");
	dc.setCapability("appActivity", ".cal.CalculatorActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement seven = driver.findElement(By.id("com.miui.calculator:id/btn_7_s"));
	//Thread.sleep(5000);
	//driver.tap(1, seven, 500);
	tap(1,seven,500);
	WebElement plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
	//Thread.sleep(5000);
	driver.tap(1, 947, 1917, 500);
	WebElement five = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
	//Thread.sleep(5000);
	//driver.tap(1, five, 500);
	tap(1, five, 500);
	WebElement equals = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
	//driver.tap(1, equals, 500);
	tap(1, equals, 500);
	//Thread.sleep(5000);
	String result = driver.findElement(By.id("com.miui.calculator:id/result")).getText();
	System.out.println(result);
	
}
	public void tap(int fing, WebElement element, int duration)
	{
		driver.tap(fing, element, duration);
	}





}