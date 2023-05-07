package starter.AltaShop;

import net.thucydides.core.annotations.Step;

public class register{
    @Step("I am on the altaShop register")
    public void onTheAltaShopRegister(){
        System.out.println("I am on the altaShop register");
    }
    @Step("I enter my valid fullname, email and password")
    public void enterValidFullnameEmailandPassword(){
        System.out.println("I enter my valid fullname, email and password");
    }
    @Step("I click on the register button")
    public void clockOntheRegisterbutton(){
        System.out.println("I click on the register button");
    }
    @Step("I can on the login page")
    public void canOntheLoginpage(){
        System.out.println("I can on the login page");
    }
    @Step("I enter my valid fullname and password")
    public void enterValidfullnameandPassword(){
        System.out.println("I enter my valid fullname and password");
    }
    @Step("I enter my invalid email")
    public void enterInvalidEmail(){
        System.out.println("I enter my invalid email");
    }
    @Step("I should see an error message invalid email")
    public void seeAnerrorMessageinvalidEmail(){
        System.out.println("I should see an error message invalid email");
    }
}
