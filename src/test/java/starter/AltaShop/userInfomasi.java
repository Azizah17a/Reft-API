package starter.AltaShop;

import net.thucydides.core.annotations.Step;

public class userInfomasi{
    @Step("I am on the altaShop account")
    public void onTheAltaShopAccount(){
        System.out.println("I am on the altaShop account");
    }
    @Step("I input email and password")
    public void inputEmailandPassword(){
        System.out.println("I input email and password");
    }
    @Step("I click on the account button")
    public void clickOntheAccountbutton(){
        System.out.println("I click on the account button");
    }
    @Step("I can see user information")
    public void seeUserInformation(){
        System.out.println("I can see user information");
    }
}
