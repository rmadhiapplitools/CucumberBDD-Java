package PageObjects;
		
		import Utilities.BaseClass;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.CacheLookup;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
		import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPage extends BaseClass {
	
	public TestPage(WebDriver driver, WebDriverWait wait) {
		
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	@CacheLookup
	private WebElement emailField;
	
	public void gotoUrl(String email) {

//
//		WaitUntilElementVisible(emailField);
//		emailField.isEnabled();
//		emailField.clear();
//		emailField.sendKeys(email);
	}
	
	
}