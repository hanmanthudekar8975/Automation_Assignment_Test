package com.assignment.pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.assignment.testBase.BaseClass;

public class AddProductToCart extends BaseClass {
	
	@FindBy(xpath = "//button[@id = 'a-autoid-4-announce']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//span[contains(text(),'1 in cart')]")
	private WebElement verifyAddedToCart;
	
	
	public AddProductToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addProductToCart() {
	    if(addToCartButton.isDisplayed())	{
	    	addToCartButton.click();
	    }
	}
		
	public String verifyItemAddedToCart() {
		String itemAddedToCart = verifyAddedToCart.getText();
		return itemAddedToCart;
	}
}
