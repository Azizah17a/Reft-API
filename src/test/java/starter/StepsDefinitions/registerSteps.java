package starter.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class registerSteps{
    @Steps
    starter.AltaShop.register register;
    @Given("I am on the altaShop register")
    public void onTheAltaShopRegister(){
        register.onTheAltaShopRegister();
    }
    @When("I enter my valid fullname, email and password")
    public void enterValidFullnameEmailandPassword(){
        register.enterValidFullnameEmailandPassword();
    }
    @And("I click on the register button")
    public void clockOntheRegisterbutton(){
        register.clockOntheRegisterbutton();
    }
    @Then("I can on the login page")
    public void canOntheLoginpage(){
        register.canOntheLoginpage();
    }
    @When("I enter my valid fullname and password")
    public void enterValidfullnameandPassword(){
        register.enterValidfullnameandPassword();
    }
    @And("I enter my invalid email")
    public void enterInvalidEmail(){
        register.enterInvalidEmail();
    }
    @Then("I should see an error message invalid email")
    public void seeAnerrorMessageinvalidEmail(){
        register.seeAnerrorMessageinvalidEmail();
    }
}
