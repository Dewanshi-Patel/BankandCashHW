package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BCLoginPage {
	WebDriver driver;

	public BCLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element list
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success block full-width']")
	WebElement SIGNIN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[text() = 'Bank & Cash']")
	WebElement BANK_AND_CASH_BUTTON;
	@FindBy(how = How.XPATH, using = "//a[text() = 'New Account']")
	WebElement NEW_ACCOUNT_BUTTON;
	@FindBy(how = How.XPATH, using = "//h2[text () = 'Accounts']")
	WebElement ADD_NEW_ACCOUNT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_TITLE;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PHONE;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement INTERNET_BANKING_URL;
	@FindBy(how = How.XPATH, using = "//button[@class  ='btn btn-primary' ]")
	WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	WebElement AccountValidate;

	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void clickSigninButton() {
		SIGNIN_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickBankandCashButton() {
		BANK_AND_CASH_BUTTON.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickNewAccount() {
		NEW_ACCOUNT_BUTTON.click();
	}

	public void insertAccountTitle(String accounttitle) {
		ACCOUNT_TITLE.sendKeys(accounttitle);

	}

	public void insertDescription(String description) {
		DESCRIPTION.sendKeys(description);

	}

	public void insertInitialBalance(String balance) {
		INITIAL_BALANCE.sendKeys(balance);

	}

	public void insertAccountNumber(String number) {
 	ACCOUNT_NUMBER.sendKeys(number);
		
		
	}


	public void insertContactPersone(String person) {
		CONTACT_PERSON.sendKeys(person);

	}

	public void insertPhone(String phone) {
		PHONE.sendKeys(phone);

	}

	public void insertBankingUrl(String url) {
		INTERNET_BANKING_URL.sendKeys(url);

	}

	public void clickSubmitButton() {

		SubmitButton.click();
	}

	public void validateNewAccount() {
		AccountValidate.isDisplayed();

	}

}