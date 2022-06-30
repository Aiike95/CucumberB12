package com.products.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductMainPage {
    public ProductMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[.='Order']")
    WebElement orderButton;

    @FindBy(xpath = "//a[.='View all orders']")
    WebElement viewAllOrderButton;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td")
    List<WebElement> allInformation;

public void clickOrderButton(){
    orderButton.click();
}
public void clickViewAllOrderButton(){
    viewAllOrderButton.click();
}
public  void validateInformationFromTable(String name, String productName, String quantity,String street,String city,
                                          String state,String zipCode,String cardType,String cardName,String expiretionDate){
    Assert.assertEquals(name,allInformation.get(1).getText().trim());
    Assert.assertEquals(productName,allInformation.get(2).getText().trim());
    Assert.assertEquals(quantity,allInformation.get(3).getText().trim());
    Assert.assertEquals(street,allInformation.get(5).getText().trim());
    Assert.assertEquals(city,allInformation.get(6).getText().trim());
    Assert.assertEquals(state,allInformation.get(7).getText().trim());
    Assert.assertEquals(zipCode,allInformation.get(8).getText().trim());
    Assert.assertEquals(cardType,allInformation.get(9).getText().trim());
    Assert.assertEquals(cardName,allInformation.get(10).getText().trim());
    Assert.assertEquals(expiretionDate,allInformation.get(11).getText().trim());

}


}
