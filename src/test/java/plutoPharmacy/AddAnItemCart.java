package plutoPharmacy;

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

public class AddAnItemCart {
	@Test
	public void addToCart() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
		dc.setCapability("appPackage", "com.mhbl.sastasundar");
		dc.setCapability("appActivity", ".modules.fkh.app_on_boarding.presentation.FkhSplashActivity");
		dc.setCapability("noReset", true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(2000);
		scroll(driver, "text", "Dettol Antiseptic Liquid 1 L");
		MobileElement product = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Dettol Antiseptic Liquid 1 L']"));
		driver.tap(1, product, 500);
		MobileElement addToCart = (MobileElement) driver.findElement(By.id("com.mhbl.sastasundar:id/btnAddToCart"));
		driver.tap(1, addToCart, 500);
		MobileElement goToCart = (MobileElement) driver.findElement(By.id("com.mhbl.sastasundar:id/btnGoToCart"));
		driver.tap(1, goToCart, 500);
		MobileElement continueButn = (MobileElement) driver.findElement(By.id("com.mhbl.sastasundar:id/btnContinue"));
		driver.tap(1, continueButn, 500);
		
		
	}
	
	public static void scroll(AndroidDriver driver,String attributeName, String AttributeValue)
	{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+AttributeValue+"\"))");
	}

}
