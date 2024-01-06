package com.tutorialsninja.qa.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
public WebDriver driver;
	
	@FindBy(linkText = "HP LP3065")
	private WebElement validProduct;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	private WebElement addtoCartButton;
	
	@FindBy(id = "button-cart")
	private WebElement buttonCard;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cardTotal;
	
	@FindBy(xpath = "//strong[normalize-space()='Checkout']")
	private WebElement checkoutButton;
	
	//Returning Customer
	
	@FindBy(id = "input-email")
	private WebElement emailFieldReturnedCustomer;
	
	@FindBy(id = "input-password")
	private WebElement passwordFieldReturnedCustomer;
	
	@FindBy(id = "button-login")
	private WebElement loginFieldReturnedCustomer;
	
	//useANewaddressButton
	
	@FindBy(xpath = "//label[normalize-space()='I want to use a new address']")
	private WebElement useANewaddressButton;
	
	@FindBy(id = "input-payment-firstname")
	private WebElement paymentFirstname;
	
	@FindBy(id = "input-payment-lastname")
	private WebElement paymentLastnamer;
	
	@FindBy(id = "input-payment-address-1")
	private WebElement paymentAddress;
	
	@FindBy(id = "input-payment-city")
	private WebElement paymentCity;
	
	@FindBy(id = "input-payment-postcode")
	private WebElement paymentPostcode;
	
	@FindBy(id = "input-payment-country")
	private WebElement paymentCountry;
	
	@FindBy(xpath = "//select[@id='input-payment-zone']")
	private WebElement paymentPayment;
	
	@FindBy(xpath = "//input[@id='button-payment-address']")
	private WebElement paymentPaymentAddress;
	
	//delivery details I want to use an existing address
	
	@FindBy(xpath = "//body/div[@id='checkout-checkout']/div[@class='row']/div[@id='content']/div[@id='accordion']/div[@class='panel panel-default']/div[@id='collapse-shipping-address']/div[@class='panel-body']/form[@class='form-horizontal']/div[1]/label[1]")
	private WebElement iWantToUseExistingAddress;
	
	@FindBy(id = "button-shipping-address")
	private WebElement shippingAddress;
	
	@FindBy(id = "button-shipping-method")
	private WebElement shippingMethod;
  	
  	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeButton;
	
  	@FindBy(id = "button-payment-method")
	private WebElement paymentMethod;
	
  	@FindBy(id = "button-confirm")
	private WebElement confirmButton;
  	
}
	
	
