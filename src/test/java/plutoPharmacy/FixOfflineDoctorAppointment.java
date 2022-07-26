package plutoPharmacy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FixOfflineDoctorAppointment {
	@Test
	public void offlineAppointment() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
		dc.setCapability("appPackage", "com.apollo.patientapp");
		dc.setCapability("appActivity", "com.apollopatient.MainActivity");
		dc.setCapability("noReset", true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(8000);
		MobileElement doctor = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='APPOINTMENTS']"));
		driver.tap(1, doctor, 500);
		MobileElement bookAppointment = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='BOOK AN APPOINTMENT']"));
		driver.tap(1, bookAppointment, 500);
		MobileElement bookTopAppointment = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Top Rated Apollo Doctors']"));
		driver.tap(1, bookTopAppointment, 500);
		MobileElement doctorName = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Dr. Ramesh Srinivasan']"));
		driver.tap(1, doctorName, 500);
		scroll(driver, "text", "BOOK HOSPITAL VISIT");
		MobileElement bookOffline = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='BOOK HOSPITAL VISIT']"));
		driver.tap(1, bookOffline, 500);
		
		
		
	}
	public static void scroll(AndroidDriver driver,String attributeName, String AttributeValue)
	{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+AttributeValue+"\"))");
	}

}
