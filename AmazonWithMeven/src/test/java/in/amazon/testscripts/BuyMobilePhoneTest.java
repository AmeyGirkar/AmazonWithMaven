package in.amazon.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.*;

public class BuyMobilePhoneTest extends BaseTest {

	

	@Test
		public void buyMobile() {
		// 4) Click on 'Mobiles
		LandingPage landingPage = new LandingPage (driver);
		landingPage.clickMobiles();
		
		
		// 5) Hover over 'Mobiles & Accessories
		Mobiles mobiles = new Mobiles (driver);
		mobiles. hoverOverMobilesAndAccessories();
		// 6) Click on Apple' in the sub-menu
		mobiles.clickApple();
		
		
		// 7) Select first available phone
		ApplePhones applePhones = new ApplePhones (driver);
		applePhones.clickFirstApplePhone();
		// 8) Click on 'Buy Now' button
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		BuyPhone buyPhone = new BuyPhone(driver);
		buyPhone.clickBuyNowButton();
		// 9) Verify the user is on 'Sign-In' page
		String expectedTitle = "Amazon Sign In";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		}

}


