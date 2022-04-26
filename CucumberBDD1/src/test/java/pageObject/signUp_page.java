package pageObject;


import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class signUp_page {

    public signUp_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }
    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstNameLoc;
    @FindBy(how = How.XPATH, using = "//*[@name='lastName']")
    public WebElement lastNameLoc;
    @FindBy(how = How.CSS, using = "#signup-form > input:nth-child(6)")
    public WebElement emailLoc;


    public void enterFirstName(String firstName){
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(firstNameLoc));
        firstNameLoc.clear();
        firstNameLoc.sendKeys(firstName);
    }

    public void enterLastName(String lastName){

        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(lastNameLoc));
        lastNameLoc.clear();
        lastNameLoc.sendKeys(lastName);
    }

    public void enterEmailAddress(String email){
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(emailLoc));
        emailLoc.clear();
        emailLoc.sendKeys(email);
    }
}
