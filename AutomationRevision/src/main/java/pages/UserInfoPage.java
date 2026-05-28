package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class UserInfoPage {

	WebDriver driver;
	
	// ---------- Constructor ----------
    public UserInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   
    // ---------- User Info Section ----------
    @FindBy(id = "name")
    private WebElement userName;

    @FindBy(id = "age")
    private WebElement userAge;

    @FindBy(id = "address")
    private WebElement userAddress;

    // ---------- Relationships Section ----------
    // Flexible dynamic IDs: capture all relationship containers
    @FindBy(xpath = "//element[contains(@id,'relationship') and contains(@id,'_name')]")
    private List<WebElement> relationshipNames;

    @FindBy(xpath = "//element[contains(@id,'relationship') and contains(@id,'_age')]")
    private List<WebElement> relationshipAges;

    

    // ---------- User Info Methods ----------
    public String getUserName() {
        return userName.getText();
    }

    public String getUserAge() {
        return userAge.getText();
    }

    public String getUserAddress() {
        return userAddress.getText();
    }

    // ---------- Relationship Methods ----------
    public int getRelationshipCount() {
        return relationshipNames.size();
    }

    public String getRelationshipName(int index) {
        return relationshipNames.get(index).getText();
    }

    public String getRelationshipAge(int index) {
        return relationshipAges.get(index).getText();
    }
}
