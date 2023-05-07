package starter.AltaShop;

import net.thucydides.core.annotations.Step;

public class login{
    @Step("I am on the altaShop login")
    public void onTheloginPage(){
        System.out.println("I am on the altaShop login");
    }
    @Step("I enter my valid email and password")
    public void enterValidEmailandPassword(){
        System.out.println("I enter my valid email and password");
    }
    @Step("I click on the login button")
    public void clickOntheLoginButton(){
        System.out.println("I click on the login button");
    }
    @Step("I can on the homepage")
    public void CanOntheHomepage(){
        System.out.println("I can on the homepage");
    }
    @Step("I enter my valid email")
    public void enterMyvalidEmail(){
        System.out.println("I enter my valid email");
    }
    @Step("I enter my invalid password")
    public void enterMyinvalidPassword(){
        System.out.println("I enter my invalid password");
    }
    @Step("I should see an error message invalid password")
    public void seeAnerrorMessage(){
        System.out.println("I should see an error message invalid password");
    }
}
