package com.assignment.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.testBase.BaseClass;

public class NoResultsPage extends BaseClass{

	@FindBy(xpath = "//div/span[text() = 'No results for ']")
	private WebElement noResultFoundMessage;
	
	public NoResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyNoResultsMessage() {
		String message = noResultFoundMessage.getText();
		return message;
	}
	
	
}
