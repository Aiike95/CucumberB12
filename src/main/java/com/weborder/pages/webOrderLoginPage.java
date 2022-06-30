package com.weborder.pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webOrderLoginPage {
    public webOrderLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "Email")
    WebElement username;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "//button[.='Sign In']")
    WebElement signIn;
    @FindBy(xpath = "//div[contains(text(),'Sign in Failed')]")
    WebElement errorMessage;

    public void webOrderLogin(String username, String password){
        this.username.clear();
        this.username.sendKeys(username);
        this.password.clear();
        this.password.sendKeys(password);
        this.signIn.click();
    }

    public String getErrorMessage() {
        return BrowserUtils.gettext(errorMessage);
    }
}
