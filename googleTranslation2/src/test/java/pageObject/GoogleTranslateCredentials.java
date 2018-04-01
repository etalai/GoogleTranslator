package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
public class GoogleTranslateCredentials {
	private WebDriver driver;
	
	public GoogleTranslateCredentials() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(Driver.getDriver(),  this);
	}
	
	@FindBy(css="https://www.google.com/")
	public WebElement translateUrl;	
	
	@FindBy(css="input#lst-ib")
	public WebElement searchBox;	
	
	public void searchFor(String value) {
		searchBox.clear();
		searchBox.sendKeys(value);
		searchBox.click();
	}
	
	@FindBy(css="input[name='btnK']")
	public WebElement submitBTN;	
	
	public void clickSubmitBTN(){
		submitBTN.click();
	}
	
	@FindBy(css="#tw-sl")
	public WebElement fromDropdown;
	
	@FindBy(css="textarea#tw-source-text-ta")
	public WebElement inputBox;
	
	@FindBy(css="pre#tw-target-text")
	public WebElement outputBox;
	
	@FindBy(css="#tw-tl")
	public WebElement toDropdown;
}
