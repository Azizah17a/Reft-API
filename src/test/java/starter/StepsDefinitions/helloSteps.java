package starter.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class helloSteps{
    @Steps
    starter.AltaShop.hello hello;
    @Given("I am on the altaShop page")
    public void onTheAltaShoppage(){
        hello.onTheAltaShoppage();
    }
    @When("I success login")
    public void successLogin(){
        hello.successLogin();
    }
    @And("I click on the index button")
    public void clickOntheIndexButton(){
        hello.clickOntheIndexButton();
    }
    @Then("I get hello from altaShop")
    public void getHellofromaltaShop(){
        hello.getHellofromaltaShop();
    }
}
