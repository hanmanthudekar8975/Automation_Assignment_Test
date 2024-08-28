package com.assignment.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.testBase.BaseClass;

public class UpdateCartItems extends BaseClass {
	
	@FindBy(xpath = "//button[@id = 'a-autoid-4-announce']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//span[contains(text(),'1 in cart')]")
	private WebElement cartitemsUpdated;
	
	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[6]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/span[3]/div[1]/a[1]")
	private WebElement removeCartItem;
	
	public UpdateCartItems(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void updateQuantityTo2() {
    	addToCartButton.click();	
	}
	public String verifyCartItemsUpdated() {
		String cartItemsUpdated = cartitemsUpdated.getText();
		return cartItemsUpdated;
	}
	
	public void removeCartItem() {
		removeCartItem.click();
	}
	
}
