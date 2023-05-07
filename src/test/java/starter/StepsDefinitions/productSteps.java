package starter.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class productSteps{
    @Steps
    starter.AltaShop.product product;
    @Given("I am on the altaShop homepage")
    public void onTheAltaShophomepage(){
        product.onTheAltaShophomepage();
    }
    @When("I search a product")
    public void searchaProduct(){
        product.searchaProduct();
    }
    @And("I get one list a product")
    public void getOneListProduct(){
        product.getOneListProduct();
    }
    @Then("I get all product")
    public void getAllProduct(){
        product.getAllProduct();
    }
    @When("I click the new button")
    public void clickThenewButton(){
        product.clickThenewButton();
    }
    @And("I input the product")
    public void inputProduct(){
        product.inputProduct();
    }
    @Then("I get a new list product")
    public void getaNewListProduct(){
        product.getaNewListProduct();
    }
    @When("I search the product with ID")
    public void searchProductwithID(){
        product.searchProductwithID();
    }
    @And("I can to choose the product")
    public void cantochooseTheProduct(){
        product.cantochooseTheProduct();
    }
    @Then("I get product by ID")
    public void getProductbyID(){
        product.getProductbyID();
    }
    @And("I get list a product")
    public void getListAProduct(){
        product.getListAProduct();
    }
    @Then("I can delete a product")
    public void deleteProduct(){
        product.deleteProduct();
    }
    @When("I buy a product")
    public void buyProduct(){
        product.buyProduct();
    }
    @And("I get a product")
    public void getProduct(){
        product.getProduct();
    }
    @Then("I will assign a product rating")
    public void assignaProductRating(){
        product.assignaProductRating();
    }
    @Then("I can to see product ratings")
    public void seeProductRatings(){
        product.seeProductRatings();
    }
    @When("I choose a product")
    public void chooseProduct(){
        product.chooseProduct();
    }
    @And("I create a comment product")
    public void createCommentProduct(){
        product.createCommentProduct();
    }
    @Then("I should see another comment a product")
    public void seeAnotherComment(){
        product.seeAnotherComment();
    }
    @Then("I get product comments")
    public void getProductComments(){
        product.getProductComments();
    }
}
