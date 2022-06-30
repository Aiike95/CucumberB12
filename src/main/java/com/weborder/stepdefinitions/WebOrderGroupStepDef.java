package com.weborder.stepdefinitions;

import Utils.DriverHelper;
import com.weborder.pages.WebOrderGroupPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class WebOrderGroupStepDef {
    WebDriver driver= DriverHelper.getDriver();
    WebOrderGroupPage webOrderGroupPage=new WebOrderGroupPage(driver);

    @When("User sends the word {string} for Notes to Invitees part")
    public void user_sends_the_word_for_notes_to_invitees_part(String note) {
        webOrderGroupPage.sendingNote(note);
    }

    @When("User sends e-mail addresses which are {string} and {string}")
    public void user_sends_e_mail_addresses_which_are_and(String email1, String email2) {
        webOrderGroupPage.sendingInvite(email1,email2);
    }

    @When("User clicks Create Group Order button.")
    public void user_clicks_create_group_order_button() {

        webOrderGroupPage.clickOrderButton(driver);
    }

    @Then("user validates the title of page is {string}")
    public void user_validates_the_title_of_page_is(String header) {
        Assert.assertTrue(webOrderGroupPage.validateHeader(driver,header));
    }

    @Then("User validates total participant is {int}")
    public void user_validates_total_participant_is(int expectedNumber) {
        Assert.assertEquals(expectedNumber,webOrderGroupPage.getNumberOfParticipant());

    }
    @When("User chooses the delivery address {string} and validates the address {string}")
    public void user_chooses_the_delivery_address_and_validates_the_address(String deliveryOption, String address) {
        webOrderGroupPage.chooseTheDeliveryOption(deliveryOption,address);
    }

}
