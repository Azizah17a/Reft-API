package starter.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginSteps{
    @Steps
    starter.AltaShop.login login;
    @Given("I am on the altaShop login")
    public void onTheloginPage(){
        login.onTheloginPage();
    }
    @When("I enter my valid email and password")
    public void enterValidEmailandPassword(){
        login.enterValidEmailandPassword();
    }
    @And("I click on the login button")
    public void clickOntheLoginButton(){
        login.clickOntheLoginButton();
    }
    @Then("I can on the homepage")
    public void CanOntheHomepage(){
        login.CanOntheHomepage();
    }
    @When("I enter my valid email")
    public void enterMyvalidEmail(){
        login.enterMyvalidEmail();
    }
    @And("I enter my invalid password")
    public void enterMyinvalidPassword(){
        login.enterMyinvalidPassword();
    }
    @Then("I should see an error message invalid password")
    public void seeAnerrorMessage(){
        login.seeAnerrorMessage();
    }
}
