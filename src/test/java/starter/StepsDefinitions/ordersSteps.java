package starter.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ordersSteps{
    @Steps
    starter.AltaShop.orders orders;
    @Given("I am on the altaShop order product")
    public void onTheOrderProduct(){
        orders.onTheOrderProduct();
    }
    @When("I select a product")
    public void selectProduct(){
        orders.selectProduct();
    }
    @And("I click buy button")
    public void clickBuyButton(){
        orders.clickBuyButton();
    }
    @Then("I can see a new product")
    public void seeNewProduct(){
        orders.seeNewProduct();
    }
    @When("I search a product by ID")
    public void searchProductbyID(){
        orders.searchProductbyID();
    }
    @And("I click a product")
    public void clickaProduct(){
        orders.clickaProduct();
    }
    @Then("I get order by ID")
    public void getOrderbyID(){
        orders.getOrderbyID();
    }
    @When("I click basket button")
    public void clickBasketButton(){
        orders.clickBasketButton();
    }
    @And("I click ceklis list")
    public void clickCeklisList(){
        orders.clickCeklisList();
    }
    @Then("I get all orders product")
    public void getAllOrdersProduct(){
        orders.getAllOrdersProduct();
    }
}
