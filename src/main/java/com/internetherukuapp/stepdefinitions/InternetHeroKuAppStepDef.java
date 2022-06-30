package com.internetherukuapp.stepdefinitions;

import Utils.DriverHelper;
import com.internetherukuapp.pages.InternetHeroKuMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class InternetHeroKuAppStepDef {

    WebDriver driver= DriverHelper.getDriver();
InternetHeroKuMainPage heroKuMainPage=new InternetHeroKuMainPage(driver);


//    @When("User clicks {String} different examples")
//    public void user_clicks_different_examples(String urls) {
//        heroKuMainPage.clickThem();
//    }
//
//    @Then("User validates {string} from home page")
//    public void user_validates_from_home_page(String url) {
//        Assert.assertEquals(driver.getCurrentUrl(),url);
//    }

    @When("User clicks examples different headers and gets the {string} of entered page")
    public void user_clicks_examples_different_headers_and_gets_the_of_entered_page() {
        heroKuMainPage.clickThem();

    }

    @Then("User validates {string} from home page")
    public void user_validates_from_home_page(String expectedUrl) {

        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }




}
