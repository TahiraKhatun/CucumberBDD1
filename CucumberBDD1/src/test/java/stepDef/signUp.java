package stepDef;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pageObject.signUp_page;

public class signUp extends Config {


    signUp_page signUp = new signUp_page(driver);
    Faker faker = new Faker();

    @And("I enter student information with valid email address")
    public void iEnterStudentInformationWithValidEmailAddress() {
        String firstName= faker.name().firstName();
        signUp.enterFirstName(firstName);
        String lastName = faker.name().lastName();
        signUp.enterLastName(lastName);
        String email = faker.internet().safeEmailAddress();
        signUp.enterEmailAddress(email);
        System.out.println(email);
    }

    @And("I enter student information with invalid email address")
    public void iEnterStudentInformationWithInvalidEmailAddress() {


        String firstName = faker.name().firstName();
        signUp.enterFirstName(firstName);
        String lastName = faker.name().lastName();
        signUp.enterLastName(lastName);
        String email = "fakeemail@gmail";
        signUp.enterEmailAddress(email);




    }




}
