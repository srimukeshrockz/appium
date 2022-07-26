package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToastMessage {
	@Test
	public void message() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	MobileElement letShopButton = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
	//driver.tap(1, letShopButton, 400); 
	letShopButton.click();
	String toastmsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getText();
	System.out.println(toastmsg);

}
}