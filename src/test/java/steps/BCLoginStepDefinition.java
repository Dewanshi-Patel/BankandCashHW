package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BCLoginPage;
import pages.BCTestBase;


public class BCLoginStepDefinition extends BCTestBase {
	BCLoginPage bcloginPageObj;
	
	@Before
	public void beforeRun() {
		initDriver();
		bcloginPageObj = PageFactory.initElements(driver, BCLoginPage.class);
		
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		bcloginPageObj.insertUserName(username);
	
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		bcloginPageObj.insertPassword(password);
		
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button()  {
		bcloginPageObj.clickSigninButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page()  {
		Assert.assertEquals("Dashboard- iBilling", bcloginPageObj.getPageTitle());
	}

	@Then("^User clicks on bankCash button$")
	public void user_clicks_on_bankCash_button()  {
		bcloginPageObj.clickBankandCashButton();
		
	}

	@When("^User clicks newAccount$")
	public void user_clicks_newAccount()  {
		bcloginPageObj.clickNewAccount();
	}

	@Then("^User enters accountTitle as \"([^\"]*)\"$")
	public void user_enters_accountTitle_as(String accounttitle)  {
		bcloginPageObj.insertAccountTitle(accounttitle + randTitle());
	}

	@Then("^User enters description as \"([^\"]*)\"$")
	public void user_enters_description_as(String description)  {
		bcloginPageObj.insertDescription(description);
	}

	@Then("^User enters initialBalance as \"([^\"]*)\"$")
	public void user_enters_initialBalance_as(String initialbalance) {
		bcloginPageObj.insertInitialBalance(initialbalance);
	}

	@Then("^User enters accountNumber as \"([^\"]*)\"$")
	public void user_enters_accountNumber_as(String accountnumber)  {
		bcloginPageObj.insertAccountNumber(accountnumber + randNum());
	}

	@Then("^User enters contactPerson as \"([^\"]*)\"$")
	public void user_enters_contactPerson_as(String contactperson) {
		bcloginPageObj.insertContactPersone(contactperson);
	}

	@Then("^User enters phoneNumber as \"([^\"]*)\"$")
	public void user_enters_phoneNumber_as(String phonenumber)  {
		bcloginPageObj.insertPhone(phonenumber);
		
	}

	@Then("^User enters internetBankingUrl as \"([^\"]*)\"$")
	public void user_enters_internetBankingUrl_as(String url) {
		bcloginPageObj.insertBankingUrl(url);
	}

	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() {
		bcloginPageObj.clickSubmitButton();
	}

	@Then("^User should be able to see validate new account created$")
	public void user_should_be_able_to_see_validate_new_account_created() {
		Assert.assertEquals("Accounts- iBilling", bcloginPageObj.getPageTitle());
	}


	
	
	
	
	
}