package com.assignment.testLayer;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.assignment.pageClasses.AddProductToCart;
import com.assignment.pageClasses.NoResultsPage;
import com.assignment.pageClasses.SearchProduct;
import com.assignment.pageClasses.UpdateCartItems;
import com.assignment.testBase.BaseClass;


public class EndToEndTestScenario extends BaseClass{

	/*This Test Method specified to search non existing product and verify No results message
	*/
	
	@Test
	public void searchNonExistingProduct() {   
		NoResultsPage noResults =  new NoResultsPage(driver);
		SearchProduct  searchPage  = new SearchProduct(driver);
		searchPage.searchProduct("9784375454Fsdfss");
		searchPage.clickOnSearchButton();
		Assert.assertEquals(noResults.verifyNoResultsMessage(), "No results for");
	}
	
	/*This Test Method specified to search existing product and add item to cart
	*/
	
	@Test
	public void searchExistingProductAndAddtoCart() {
		SearchProduct  searchPage  = new SearchProduct(driver);
		AddProductToCart addToCart = new AddProductToCart(driver);
		searchPage.searchProduct("Laptop");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		searchPage.clickOnSearchButton();
		addToCart.addProductToCart();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(addToCart.verifyItemAddedToCart(), "1 in cart");


	}
	/*This Test Method specified to update and remove cart item counts.
	*/
	
	@Test
	public void updateQuantity(){
		SearchProduct  searchPage  = new SearchProduct(driver);
		AddProductToCart addToCart = new AddProductToCart(driver);
		UpdateCartItems updateItems = new UpdateCartItems(driver);
		searchPage.searchProduct("Laptop");
		searchPage.clickOnSearchButton();
		addToCart.addProductToCart();
		updateItems.updateQuantityTo2();
		Assert.assertEquals(updateItems.verifyCartItemsUpdated(), "1 in cart");	
		updateItems.removeCartItem();
	}

}
