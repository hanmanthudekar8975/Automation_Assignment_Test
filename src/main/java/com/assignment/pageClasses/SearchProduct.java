package com.assignment.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.testBase.BaseClass;

public class SearchProduct extends BaseClass {
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	
	public SearchProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct(String productName) {
		searchBox.click();
		searchBox.sendKeys(productName);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}


}
