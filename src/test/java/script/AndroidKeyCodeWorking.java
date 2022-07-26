package script;

import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidKeyCodeWorking {

	@Test
	public void apiDemos() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		
		
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 7 pro");
		//dc.setCapability("appPackage", "io.appium.android.apis");
		//dc.setCapability("appActivity", ".ApiDemos");
		URL url =new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		
		  System.out.println(AndroidKeyCode.BACK+"this is back");
		  System.out.println(AndroidKeyCode.ENTER+"this is enter");
		  System.out.println(AndroidKeyCode.HOME+"this is Home");
		  System.out.println(AndroidKeyCode.KEYCODE_0+"this is 0");
		  System.out.println(AndroidKeyCode.KEYCODE_1);
		  System.out.println(AndroidKeyCode.KEYCODE_2);
		  System.out.println(AndroidKeyCode.KEYCODE_3);
		  
		  System.out.println(AndroidKeyCode.KEYCODE_AT);
		  System.out.println(AndroidKeyCode.KEYCODE_APP_SWITCH+"switch app");
		  System.out.println(AndroidKeyCode.KEYCODE_CALCULATOR+"calculator");
		  System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN+"bright down");
		  System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP+"bright up");
		 
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		Thread.sleep(2000);
		driver.pressKeyCode(221);
		Thread.sleep(2000);
		driver.pressKeyCode(210);
		Thread.sleep(2000);
		driver.pressKeyCode(3);
}
}