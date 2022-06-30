package com.internetherukuapp.pages;

import Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetHeroKuMainPage {

    WebDriver driver;
     public InternetHeroKuMainPage(WebDriver driver){
         PageFactory.initElements(driver,this);
     }
     @FindBy(xpath = "//a[contains(text(),'A/B Testing')]")
    WebElement adTesting;

    @FindBy(xpath = "//a[contains(text(),'Add/Remove Elements')]")
    WebElement addRemoveElements;

    @FindBy(xpath = "//a[contains(text(),'Basic Auth')]")
    WebElement basicAuth;

    @FindBy(xpath = "//a[contains(text(),'Broken Images')]")
    WebElement brokenImages;

    @FindBy(xpath = "//a[contains(text(),'Challenging DOM')]")
    WebElement challengingDOM;

    @FindBy(xpath = "//a[contains(text(),'Checkboxes)]")
    WebElement checkBoxes;

    @FindBy(xpath = "//a[contains(text(),'Context Menu')]")
    WebElement contextMenu;

    @FindBy(xpath = "Digest Authentication")
    WebElement digestAuthentication;

    @FindBy(xpath = "//a[contains(text(),'Disappearing Elements')]")
    WebElement disappearingElements;

    @FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
    WebElement dragAndDrop;



    public void clickThem(){

adTesting.click();

addRemoveElements.click();

basicAuth.click();
brokenImages.click();
challengingDOM.click();
checkBoxes.click();
contextMenu.click();
digestAuthentication.click();
disappearingElements.click();
dragAndDrop.click();
     }
}
