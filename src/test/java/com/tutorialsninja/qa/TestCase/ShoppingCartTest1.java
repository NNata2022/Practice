package com.tutorialsninja.qa.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest1 {
	public WebDriver driver;
	@BeforeMethod
	public void registerSetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
//		@BeforeMethod
//		public void loginSetup() {
//			driver = initializeBrowserAndOpenApplication("chrome");
//			/*options = new ChromeOptions();
//			//driver.manage().window().maximize();//using options method and incognito mode,
//			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//			options.addArguments("--start-maximized");
//			options.addArguments("--incognito");
//			
//			driver= new ChromeDriver(options);*/
//			//driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test
	public void testAddProductToCartAndVerify() throws InterruptedException {
		//need help with assertion
		
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();//search button
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart")).click();
		//Assert.assertTrue(driver.findElement(By.linkText("You have added HP LP3065 to your shopping cart!")).isDisplayed());
		//Assert Success: You have added HP LP3065 to your shopping cart!
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[normalize-space()='Checkout']")).click();
		
		//Returning Customer
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("button-login")).click();
		
		//Checkout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='I want to use a new address']")).click();
		
		//useANewaddressButton
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("Schoool street apt 2");
		driver.findElement(By.id("input-payment-city")).sendKeys("Pensakola");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("02336");
		Select select = new Select(driver.findElement(By.id("input-payment-country")));
    	select.selectByVisibleText("United States");
    	Thread.sleep(2000);
    	Select select1 = new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']")));
  	    select1.selectByVisibleText("Florida");
  	    driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();
  	    
  	    //delivery details I want to use an existing address  
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//body/div[@id='checkout-checkout']/div[@class='row']/div[@id='content']/div[@id='accordion']/div[@class='panel panel-default']/div[@id='collapse-shipping-address']/div[@class='panel-body']/form[@class='form-horizontal']/div[1]/label[1]")).click();
  	  driver.findElement(By.id("button-shipping-address")).click();
  	  
  	  //delivery method
  	Thread.sleep(2000);
  	driver.findElement(By.id("button-shipping-method")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//input[@name='agree']")).click();
  	driver.findElement(By.id("button-payment-method")).click();
	Thread.sleep(2000);
  	driver.findElement(By.id("button-confirm")).click();
  	
  	//WebElement yourOrderHarBeenPlaced = driver.findElement(By.linkText("Your order has been placed!"));
    //WebElement logoutLink = driver.findElement(By.linkText("Logout"));
    //Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && logoutLink.isDisplayed());
  	//Assert.assertTrue(driver.findElement(By.linkText("You have added HP LP3065 to your shopping cart!")).isDisplayed());
	
	}
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
