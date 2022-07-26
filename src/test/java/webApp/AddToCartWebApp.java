package webApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddToCartWebApp {
@Test
public void login() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability("noReset", true);
	dc.setBrowserName("Chrome");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,dc);
	driver.get("https://healthplus.flipkart.com");
	Thread.sleep(8000);
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
