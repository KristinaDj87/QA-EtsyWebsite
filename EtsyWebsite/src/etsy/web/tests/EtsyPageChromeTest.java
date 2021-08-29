package etsy.web.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EtsyPageChromeTest {

@Test
//Test1) Verify that user can log in on Etsy website with Google

			public void logIn() throws InterruptedException {
				
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\djurdjic\\eclipse-workspace\\EtsyWebsite\\src\\drivers\\chromedriver.exe" );
				WebDriver driver = new ChromeDriver();	
				driver.navigate().to("https://www.etsy.com/");
				driver.manage().window().fullscreen();	

				driver.findElement(By.cssSelector("button.wt-btn.wt-btn--small.wt-btn--transparent.wt-mr-xs-1.inline-overlay-trigger.signin-header-action.select-signin")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div/div/div/div/div[2]/form/div[3]/div[1]/div/button")).click();
				//driver.navigate().refresh();
					Thread.sleep(1000);
			}

@Test
//Test 2) Check that some subcategory(ex.Woman's clothing) from any Category(ex.Clothing&Shoes) can be selected

		public void hoverCategory() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\djurdjic\\eclipse-workspace\\EtsyWebsite\\src\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();	
			driver.navigate().to("https://www.etsy.com/");
			driver.manage().window().fullscreen();
			Thread.sleep(1000);
				Actions actions = new Actions(driver);
				WebElement hover = driver.findElement(By.xpath("//*[@id=\"desktop-category-nav\"]/div[1]/div/ul/li[2]"));
				actions.moveToElement(hover).perform();
				Thread.sleep(1000);
				driver.findElement(By.id("side-nav-category-link-10924")).click();
				Thread.sleep(1000);
				driver.navigate().refresh();
	}

@Test
//test3) Choose some item from any category, than add some filters to item with checkbox(free, elastic, child, green), than apply

public void checkBox() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\djurdjic\\eclipse-workspace\\EtsyWebsite\\src\\drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();	
	driver.navigate().to("https://www.etsy.com/");
	driver.manage().window().fullscreen();
	
		driver.findElement(By.cssSelector("#global-enhancements-search-query")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("global-enhancements-search-query")).sendKeys("face mask");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gnav-search > div > div.wt-input-btn-group.global-enhancements-search-input-btn-group.wt-menu__trigger.emphasized_search_bar.emphasized_search_bar_grey_bg > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("search-filter-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='special-offers-free-shipping']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='attr_380-2580']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='attr_630-4161']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='attr_1-4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div/div[2]/button[2]")).click();		
		Thread.sleep(1000);

	}

@Test
// Test4) Choose some item from any category, than verify functionality for some radio buttons from filters (CUstom 5-7 low-high)
	
public void radioButton() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\djurdjic\\eclipse-workspace\\EtsyWebsite\\src\\drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();	
	driver.navigate().to("https://www.etsy.com/");
	driver.manage().window().fullscreen();

		driver.findElement(By.cssSelector("#global-enhancements-search-query")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("global-enhancements-search-query")).sendKeys("face mask");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gnav-search > div > div.wt-input-btn-group.global-enhancements-search-input-btn-group.wt-menu__trigger.emphasized_search_bar.emphasized_search_bar_grey_bg > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("search-filter-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='price-input-custom']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("min")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.name("max")).sendKeys("7");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div/div[2]/button[2]")).click();
		Thread.sleep(1000);

}

@Test
//Test 5) Verify that cart button is clickable

public void cart() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\djurdjic\\eclipse-workspace\\EtsyWebsite\\src\\drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();	
	driver.navigate().to("https://www.etsy.com/");
	driver.manage().window().fullscreen();

	driver.findElement(By.linkText("Cart")).click();
	
		driver.navigate().refresh();
		}
		
}


