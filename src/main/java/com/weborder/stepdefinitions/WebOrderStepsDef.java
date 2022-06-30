package com.weborder.stepdefinitions;

import Utils.DriverHelper;
import com.weborder.pages.WebOrderPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class WebOrderStepsDef {

    WebDriver driver= DriverHelper.getDriver();
    WebOrderPage orderPage=new WebOrderPage(driver);

    @When("user clicks Group Order Box and Next Button")
    public void user_clicks_group_order_box_and_next_button() {
       orderPage=new WebOrderPage(driver);
       orderPage.clickTheButtons();
    }

}
