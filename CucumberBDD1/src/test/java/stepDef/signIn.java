package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pageObject.signIn_page;

public class signIn extends Config {

    signIn_page signIn = new signIn_page(driver);
    @Given("I am at TalentTEK home page")
    public void iAmAtTalentTEKHomePage() {
        String exp = "Sign In";
        Assert.assertEquals(driver.getTitle(),exp);
    }

    @And("I click on Create My Account button")
    public void iClickOnCreateMyAccountButton() {
        signIn.clickCreateNewAccountButton();
    }
}
