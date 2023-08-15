package com.localhost.cucumber.steps;

import com.localhost.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStep {
    @Given("^user is on homepage of given url$")
    public void userIsOnHomepageOfGivenUrl() {
    }

    @When("^user enter name in username textbox$")
    public void userEnterNameInUsernameTextbox() {
        new HomePage().enterYourName("Localhost001");
    }

    @And("^user enter invalid birthdate in birthday textbox$")
    public void userEnterInvalidBirthdateInBirthdayTextbox() {
        new HomePage().enterYourBirthday("22/01/1600");
    }

    @And("^user click on submit button$")
    public void userClickOnSubmitButton() {
        new HomePage().clickOnSubmitButton();
    }

    @Then("^user verify \"([^\"]*)\" error message$")
    public void userVerifyErrorMessage(String expectedText) {
        Assert.assertEquals("you are too old to use it",new HomePage().getText(),expectedText);
    }

}
