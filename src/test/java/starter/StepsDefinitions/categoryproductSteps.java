package starter.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class categoryproductSteps{
    @Steps
    starter.AltaShop.categoryProduct categoryProduct;
    @Given("I am on the altaShop categories product")
    public void onThealtaShopCategoriesProduct(){
        categoryProduct.onThealtaShopCategoriesProduct();
    }
    @When("I see list a product")
    public void seeListProduct(){
        categoryProduct.seeListProduct();
    }
    @And("I click create button")
    public void clickCreateProduct(){
        categoryProduct.clickCreateProduct();
    }
    @Then("I input a category product")
    public void inputCategoryProduct(){
        categoryProduct.inputCategoryProduct();
    }
    @When("I search category product")
    public void searchCategoryProduct(){
        categoryProduct.searchCategoryProduct();
    }
    @And("I choose category by ID")
    public void chooseCategorybyID(){
        categoryProduct.chooseCategorybyID();
    }
    @Then("I get category product")
    public void getCategoryProduct(){
        categoryProduct.getCategoryProduct();
    }
    @And("I see list category product")
    public void seeListCategoryProduct(){
        categoryProduct.seeListCategoryProduct();
    }
    @Then("I get all categories product")
    public void getAllCategoriesProduct(){
        categoryProduct.getAllCategoriesProduct();
    }
    @When("I select category a product")
    public void selectcategoryProduct(){
        categoryProduct.selectcategoryProduct();
    }
    @And("I click category a product")
    public void clickCategoryProduct(){
        categoryProduct.clickCategoryProduct();
    }
    @Then("I can delete category a product")
    public void deleteCategoryProduct(){
        categoryProduct.deleteCategoryProduct();
    }
}
