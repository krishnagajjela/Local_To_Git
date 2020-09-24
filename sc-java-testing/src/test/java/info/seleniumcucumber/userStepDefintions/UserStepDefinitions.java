package info.seleniumcucumber.userStepDefintions;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;


public class UserStepDefinitions implements BaseTest {
	
	protected WebDriver driver = DriverUtil.getDefaultDriver();
	
	@Given("^I should get logged-in$")
	public void should_logged_in() throws Throwable {
		
		By selection = By.id("flash");
        (new WebDriverWait(driver, 30)).until(
                ExpectedConditions.visibilityOfElementLocated(selection));
		String msg = driver.findElement(By.id("flash")).getText();
		if(!msg.isEmpty())
			msg = msg.split("\n")[0].trim();
		Assert.assertEquals("You logged into a secure area!", msg);
	}
	
	
	@Given("^user is on Application landing page$")
	public void user_is_on_Application_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on Application landing page");
	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user clicks on Sign in button");
	}

	@Then("^user is displayed login screen$")
	public void user_is_displayed_login_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is displayed login screen");
	}

	@When("^user enters \"([^\"]*)\" in username field$")
	public void user_enters_in_username_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user enters in username field "+arg1);
	}

	@When("^user enters \"([^\"]*)\" in password field$")
	public void user_enters_in_password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User enters in password field "+arg1);
	}

	@When("^user clicks Sign in button$")
	public void user_clicks_Sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user clicks Sign in button");
	}

	@Then("^user gets login failed error message$")
	public void user_gets_login_failed_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user gets login failed error message");
	}
	
	@Then("^we verify following user exists$")
	public void we_verify_following_user_exists(DataTable userDetails){
	  //Write the code to handle Data Table
	  List<List<String>> data = userDetails.raw();
	  for(String x : data.get(2))
	  {
		  System.out.println(x);
	  }
	  
	}
}
