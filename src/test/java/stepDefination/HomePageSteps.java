package stepDefination;

import org.testng.Assert;

import com.qa.pages.actions.HomePage;
import com.qa.pages.actions.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage=new LoginPage();		
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Cogmento CRM");
	}

	@Then("^user enters username and password and click on login button$")
	public void user_enters_username_and_passwordand_click_on_login_button() throws Throwable {
		homePage=loginPage.doLogin(config.getProperty("username"),config.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals(title,"Cogmento CRM");
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		boolean flag=homePage.verifyCorrectUserName();
		Assert.assertTrue(flag);
	}

}
