package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class myProfile_page  extends Config{
    public myProfile_page (WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

}
