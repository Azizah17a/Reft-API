package starter.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserInformasiSteps{
    @Steps
    starter.AltaShop.userInfomasi userInfomasi;
    @Given("I am on the altaShop account")
    public void onTheAltaShopAccount(){
        userInfomasi.onTheAltaShopAccount();
    }
    @When("I input email and password")
    public void inputEmailandPassword(){
        userInfomasi.inputEmailandPassword();
    }
    @And("I click on the account button")
    public void clickOntheAccountbutton(){
        userInfomasi.clickOntheAccountbutton();
    }
    @Then("I can see user information")
    public void seeUserInformation(){
        userInfomasi.seeUserInformation();
    }
}
