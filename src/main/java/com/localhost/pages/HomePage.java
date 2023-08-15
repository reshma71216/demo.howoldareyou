package com.localhost.pages;

import com.localhost.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='inputName']")
    WebElement inputName;
    @CacheLookup
    @FindBy(id = "inputBirthday")
    WebElement inputBirthday;

    @CacheLookup
    @FindBy(id = "submitButton")
    WebElement submitButton;

    @CacheLookup
    @FindBy(id = "help_birthday")
    WebElement verifyText;

    public void enterYourName(String text) {
        sendTextToElement(inputName, text);
        log.info("Send text to enter your name text box" + inputName.toString());
    }

    public void enterYourBirthday(String birthDay) {
        sendTextToElement(inputBirthday, birthDay);
        log.info("Send text to enter your birthday text box" +inputBirthday.toString());
    }

    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
        log.info("Click on submit button" +submitButton.toString());
    }

    public String getText(){
        Reporter.log("you are too old to use it" +verifyText.toString());
        return getTextFromElement(verifyText);
    }
}
