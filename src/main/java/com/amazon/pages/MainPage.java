package com.amazon.pages;

import Utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(xpath = "//span[contains(text(),'of over')]")
    WebElement results;

    @FindBy(xpath = "//h2//a")
    List<WebElement>allHeader;

    public  void searchWord(String search){
        searchBox.sendKeys(search, Keys.ENTER);
    }
    public int resultOfSearch(){
        String [] result=results.getText().trim().split(" ");
        int lastResult=Integer.parseInt(result[3].replace(",",""));
        return lastResult;
    }
    public void validateHeaders(String word){

        for(WebElement header: allHeader){

            if(!BrowserUtils.gettext(header).equals("")) {

                Assert.assertTrue(BrowserUtils.gettext(header).contains(word));
            }
        }
    }

}


