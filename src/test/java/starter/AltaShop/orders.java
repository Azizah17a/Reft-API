package starter.AltaShop;

import net.thucydides.core.annotations.Step;

public class orders{
    @Step("I am on the altaShop order product")
    public void onTheOrderProduct(){
        System.out.println("I am on the altaShop order product");
    }
    @Step("I select a product")
    public void selectProduct(){
        System.out.println("I select a product");
    }
    @Step("I click buy button")
    public void clickBuyButton(){
        System.out.println("I click buy button");
    }
    @Step("I can see a new product")
    public void seeNewProduct(){
        System.out.println("I can see a new product");
    }
    @Step("I search a product by ID")
    public void searchProductbyID(){
        System.out.println("I search a product by ID");
    }
    @Step("I click a product")
    public void clickaProduct(){
        System.out.println("I click a product");
    }
    @Step("I get order by ID")
    public void getOrderbyID(){
        System.out.println("I get order by ID");
    }
    @Step("I click basket button")
    public void clickBasketButton(){
        System.out.println("I click basket button");
    }
    @Step("I click ceklis list")
    public void clickCeklisList(){
        System.out.println("I click ceklis list");
    }
    @Step("I get all orders product")
    public void getAllOrdersProduct(){
        System.out.println("I get all orders product");
    }

}
