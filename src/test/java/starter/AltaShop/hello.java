package starter.AltaShop;

import net.thucydides.core.annotations.Step;

public class hello{
    @Step("I am on the altaShop page")
    public void onTheAltaShoppage(){
        System.out.println("I am on the altaShop page");
    }
    @Step("I success login")
    public void successLogin(){
        System.out.println("I success login");
    }
    @Step("I click on the index button")
    public void clickOntheIndexButton(){
        System.out.println("I click on the index button");
    }
    @Step("I get hello from altaShop")
    public void getHellofromaltaShop(){
        System.out.println("I get hello from altaShop");
    }
}
