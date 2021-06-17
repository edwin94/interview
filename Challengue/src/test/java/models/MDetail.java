package models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MDetail {

	@FindBy(id = "productPrice")
	private WebElement price;

	@FindBy(id = "buttonPanel_AddToCartButton")
	private WebElement addCart;
	
	@FindBy(xpath = "//*[@id='R1MarketRedirect-1']/button")
	private WebElement closeModal;
	
	public MDetail(WebDriver driver) {
		// initialize page factory
		PageFactory.initElements(driver, this);
	}
	
	public String getPrice() {
		return price.getText();
	}
	
	public void clickAddCart() {
		addCart.click();
	}
	
	public void clickCloseModal() {
		closeModal.click();
	}
}
