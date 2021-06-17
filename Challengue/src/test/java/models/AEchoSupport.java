package models;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AEchoSupport {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='links-contain']/div[1]/div")
	private WebElement hdGettingStarted;

	@FindBy(xpath = "//*[@id='links-contain']/div[2]/div")
	private WebElement hdWifiBluetooth;

	@FindBy(xpath = "//*[@id='links-contain']/div[3]/div")
	private WebElement hdDeviceSoftware;

	@FindBy(xpath = "//*[@id='links-contain']/div[4]/div")
	private WebElement hdThrobleshooting;

	@FindBy(xpath = "//*[@id='links-contain']/div[5]/div")
	private WebElement hdLearnMore;

	public AEchoSupport(WebDriver driver) {
		this.driver = driver;
		// initialize page factory
		PageFactory.initElements(driver, this);
	}

	public void scrollDown(int init, int end) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + init + "," + end + ")");
	}

	public WebElement getHDGettingStarted() {
		return hdGettingStarted;
	}

	public WebElement getHDWifiBluetooth() {
		return hdWifiBluetooth;
	}

	public WebElement getHDDeviceSoftware() {
		return hdDeviceSoftware;
	}

	public WebElement getHDThrobleshooting() {
		return hdThrobleshooting;
	}

	public WebElement getHDLearnMore() {
		return hdLearnMore;
	}

}
