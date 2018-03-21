package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
//always use cucumber.api.java...
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

public class Hook {
	
	@Before //--> it runs before every scenario
	public void setUp() {
		Driver.getDriver().manage().timeouts().
					implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After //--> it runs after every scenario
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot=((TakesScreenshot)
					Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
}
