package stepDefinitions;

import actions.ShoePortalActions;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class ShoePortalSteps {

    ShoePortalActions actions = new ShoePortalActions();

    @Given("^I navigate to the Online Shoe Portal$")
    public void navigate_to_online_shoe_portal() {
        actions.navigateToOnlineShoePortal();
    }

    @When("^I click on the hamburger menu$")
    public void click_on_hamburger_menu() {
        actions.clickOnHamburgerMenu();
    }

    @When("^I click on the order products link$")
    public void click_on_order_products_link() {
        actions.clickOnOrderProductsLink();
    }

    @Then("^I should see the correct titles for formal shoes$")
    public void verify_titles_for_formal_shoes() {
        String expectedTitle = "Formal Shoes";
        assertEquals(expectedTitle, actions.getFormalShoeTitle());
    }

    @Then("^I should see the correct titles for sports shoes$")
    public void verify_titles_for_sports_shoes() {
        String expectedTitle = "Sports Shoes";
        assertEquals(expectedTitle, actions.getSportsShoeTitle());
    }

    @Then("^I should see the correct titles for sneakers$")
    public void verify_titles_for_sneakers() {
        String expectedTitle = "Sneakers";
        assertEquals(expectedTitle, actions.getSneakerTitle());
    }

    @Then("^I should see the first formal shoe name displayed correctly$")
    public void verify_first_formal_shoe_name() {
        String expectedName = "   Classic Cheltenham";
        assertEquals(expectedName, actions.getFirstFormalShoeName());
    }

    @Then("^I should see the first sports shoe name displayed correctly$")
    public void verify_first_sports_shoe_name() {
        String expectedName = "   Ultimate";
        assertEquals(expectedName, actions.getFirstSportsShoeName());
    }
    @When("I click on the Formal Shoe list")
    public void i_click_on_the_formal_shoe_list() {
    	actions.clickOnFormalShoeDropDownMenu();
    }

    @When("I click on the Sports Shoe list")
    public void i_click_on_the_sports_shoe_list() {
    	actions.clickOnSportsShoeDropDownMenu();
    }




}