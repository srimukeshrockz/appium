package ObjectRepository;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralStorePage {
	AndroidDriver driver;
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private MobileElement countryDropDown;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private MobileElement name;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private MobileElement maleRadioButton;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement letsShopButton;
	
	public GeneralStorePage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
	}
	
	public MobileElement getCountryDropDown()
	{
		return countryDropDown;
	}
	
	public MobileElement getName()
	{
		return name;
	}
	
	public MobileElement getMaleRadioButton()
	{
		return maleRadioButton;
	}
	
	public MobileElement getLetsShopButton()
	{
		return letsShopButton;
	}
	public void Login()
	{
		name.sendKeys("mukesh");
		maleRadioButton.click();
		letsShopButton.click();
	}
}
