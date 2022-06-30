package com.products.stepdefinition;

import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.DriverHelper;
import com.products.pages.ProductLoginPage;
import com.products.pages.ProductMainPage;
import com.products.pages.ProductsOrderPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class ProductsOrderStefDef {

            WebDriver driver= DriverHelper.getDriver();
            ProductLoginPage productLoginPage=new ProductLoginPage(driver);
            ProductMainPage productMainPage=new ProductMainPage(driver);
            ProductsOrderPage productsOrderPage=new ProductsOrderPage(driver);

    @Given("User navigates to product home page and click order page")
    public void user_navigates_to_product_home_page_and_click_order_page() {
        driver.get(ConfigReader.readProperty("productsUrl"));
        productLoginPage.login(ConfigReader.readProperty("productsUserName"),ConfigReader.readProperty("productPassword"));
        productMainPage.clickOrderButton();

    }

    @When("User enters the product information {string} and {string}")
    public void user_enters_the_product_information_and(String product, String quantity) {
        productsOrderPage.sendProductInformation(product,quantity);
    }

    @When("User enters the address information {string}, {string},{string},{string}, {string}")
    public void user_enters_the_address_information(String name, String street, String city, String state, String zip) {
        productsOrderPage.sendAddressInformation(name, street, city, state, zip);
    }

    @When("User enters payment info {string},{string}, {string}")
    public void user_enters_payment_info(String cardNumber, String expirationDate, String cardType) {
        productsOrderPage.sendPaymentInformation(cardNumber,expirationDate,cardType);
    }

    @Then("User validates the message {string}")
    public void user_validates_the_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage,productsOrderPage.getMessage());
    }

    @Then("User clicks View All Orders and validates {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_clicks_view_all_orders_and_validates(String name, String product, String customerName, String street, String city, String state,
                                                          String zipCode, String cardNumber, String cardType, String ExpirationDate) {
        productMainPage.clickViewAllOrderButton();
       productMainPage.validateInformationFromTable(name, product, customerName, street, city, state, zipCode, cardNumber, cardType, ExpirationDate);
    }

    @Given("User navigates to product home page and click order Order Button with DataTable")
    public void user_navigates_to_product_home_page_and_click_order_order_button_with_data_table(DataTable dataTable) {
     driver.get(ConfigReader.readProperty("productsUrl"));
        Map<String, String> loginCredentials=dataTable.asMap();
        productLoginPage.login(loginCredentials.get("userName"),loginCredentials.get("password"));
        productMainPage.clickOrderButton();
    }

    @When("User enters the product information")
    public void user_enters_the_product_information(DataTable dataTable) {
        Map<String,String>productInformation=dataTable.asMap();
        productsOrderPage.sendProductInformation(productInformation.get("product"),productInformation.get("quantity"));

    }

    @When("User enters the address information")
    public void user_enters_the_address_information(DataTable dataTable) {
        Map<String,String>addressInformation=dataTable.asMap();
        productsOrderPage.sendAddressInformation(addressInformation.get("name"),
                addressInformation.get("street"),
                addressInformation.get("city"),
                addressInformation.get("state"),
                addressInformation.get("zipCode"));
    }

    @When("User enters payment info and process the order")
    public void user_enters_payment_info_and_process_the_order(DataTable dataTable) {
        Map<String,String>paymentInformation=dataTable.asMap();
        productsOrderPage.sendPaymentInformation(paymentInformation.get("cardType"),
                                                  paymentInformation.get("cardNumber"),
                                                    paymentInformation.get("expireDate"));

    }

    @Then("User validates the message")
    public void user_validates_the_message(DataTable dataTable) {
        List<String>message=dataTable.asList();
        Assert.assertEquals(message.get(0),productsOrderPage.getMessage());
    }

    @Then("User clicks View All Orders and validates")
    public void user_clicks_view_all_orders_and_validates(DataTable dataTable) {
      //  Map<String,String> =dataTable.asMap();
        /* HOMEWORK
        Use List or Map for this task


         */
    }

}
