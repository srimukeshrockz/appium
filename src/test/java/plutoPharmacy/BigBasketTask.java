package plutoPharmacy;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.remoting.support.UrlBasedRemoteAccessor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasketTask {
	@Test
	public void basket() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.UDID, "a3bacc8f");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity",".activity.SplashActivity");
		dc.setCapability("noReset", true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		MobileElement menu = (MobileElement) driver.findElement(By.id("com.bigbasket.mobileapp:id/iv_drawer"));
		driver.tap(1, menu, 500);
		WebElement offers = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Offers']"));
		driver.tap(1, offers, 500);
		MobileElement veg = (MobileElement) driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]"));
		driver.tap(1, veg, 500);
		List<WebElement> prices = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']"));
		List<WebElement> items = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
		for( WebElement price:prices)
		{
			String prs = price.getText().substring(1);
			System.out.println(prs);
			int pricesWithoutSymbol = Integer.parseInt(prs);
			for(WebElement item:items)
			{
				if(pricesWithoutSymbol>50)
				{
					System.out.println(item.getText());
				}
			}
			}
		}
	}

