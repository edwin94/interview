package models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MHome {

	@FindBy(xpath = "//*[@id='uhf-g-nav']/ul/li[2]")
	private WebElement mnuOffice;
	@FindBy(xpath = "//*[@id='uhf-g-nav']/ul/li[3]")
	private WebElement mnuWindows;
	@FindBy(xpath = "//*[@id='uhf-g-nav']/ul/li[4]")
	private WebElement mnuSurface;
	@FindBy(xpath = "//*[@id='uhf-g-nav']/ul/li[5]")
	private WebElement mnuXbox;
	@FindBy(xpath = "//*[@id='uhf-g-nav']/ul/li[6]")
	private WebElement mnuDeals;
	@FindBy(xpath = "//*[@id='uhf-g-nav']/ul/li[7]")
	private WebElement mnuSupport;

	public MHome(WebDriver driver) {
		// initialize page factory
		PageFactory.initElements(driver, this);
	}

	public WebElement getMnuOffice() {
		return mnuOffice;
	}

	public WebElement getMnuWindows() {
		return mnuWindows;
	}

	public WebElement getMnuSurface() {
		return mnuSurface;
	}

	public WebElement getMnuXbox() {
		return mnuXbox;
	}

	public WebElement getMnuDeals() {
		return mnuDeals;
	}

	public WebElement getMnuSupport() {
		return mnuSupport;
	}

	public void clickWindowsMenu() {
		mnuWindows.click();
	}

}
