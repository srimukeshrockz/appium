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

public class GeneralStore {
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
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("mukesh");
		MobileElement male = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/radioMale"));
		driver.tap(1, male, 300);
		driver.hideKeyboard();
		MobileElement letShopButton = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		driver.tap(1, letShopButton, 400);
		String price = driver.findElement(By.xpath("//android.widget.TextView[@text='$160.97']")).getText();
		MobileElement addCart = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']"));
		driver.tap(1, addCart, 500);
		MobileElement cart = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		driver.tap(1, cart, 500);
		MobileElement totalPrice = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl"));
		String Checkprice = totalPrice.getText();
		if(Checkprice.contains("160"))
		{
			System.out.println("same price");
		}
		else
		{
			System.out.println("not same price");
		}
	}
		

		
	}


