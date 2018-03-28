package step_definitions;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.GoogleTranslateCredentials;
import utilities.Config;
import utilities.Driver;
public class GoogleTranslateSteps {
	private static WebDriver driver=Driver.getDriver();
	GoogleTranslateCredentials gtc=new GoogleTranslateCredentials();
	
	@Given("^On Google translate page$")
	public void on_Google_translate_page() throws InterruptedException {
		driver.get(Config.getProperty("url"));	
		gtc.searchBox.sendKeys(Config.getProperty("googleTranslate") + Keys.ENTER);
		Thread.sleep(300);
		assert(driver.getTitle().equals(Config.getProperty("title")));
	}
	
	@When("^I choose source language$")
	public void i_choose_source_language() throws Throwable {
		Select list = new Select(gtc.fromDropdown);
		list.selectByVisibleText(Config.getProperty("fromLanguage"));
	}
	
	@When("^I choose target language$")
	public void i_choose_target_language() throws Throwable {
		Select list2 = new Select(gtc.toDropdown);
		list2.selectByVisibleText(Config.getProperty("toLanguage"));
	}
	
	@When("^I type a word into source field$")
	public void i_type_a_word_into_source_field() throws Throwable {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter a text to be translated.");
	    System.out.println("Make sure it's in "
				+Config.getProperty("fromLanguage")+" language:");
	    System.out.println("Enter a word:");
//	    String a=scan.nextLine();
	    String a="hello";
	    gtc.inputBox.sendKeys(a);
	}
	
	@When("^I click on translate$")
	public void i_click_on_translate() throws Throwable {
	    System.out.println("clicked on translate btn");

	}
	
	@Then("^Translation is displayed$")
	public void translation_is_displayed() throws Throwable {
		Thread.sleep(500);
		System.out.println("\ntranslation to "+
				Config.getProperty("toLanguage")+" language:");
	    System.out.println(gtc.outputBox.getText());
	    String outputText=gtc.outputBox.getText();
	    assert!(outputText.isEmpty());
	    Driver.closeDriver();
	}

}
