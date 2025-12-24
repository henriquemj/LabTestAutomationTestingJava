package actions;

import Pages.HomePage;
import Pages.ProductsPages;
import utils.BasePage;

public class ShoePortalActions extends BasePage {
    
    private HomePage homePage;
    private ProductsPages productsPages;

    // Constructor to initialize the HomePage and ProductsPages instances
    public ShoePortalActions() {
        homePage = new HomePage();
        productsPages = new ProductsPages();
    }

    /**
     * Navigates to the online shoe portal.
     * This method opens the specified URL in the web driver.
     */
    public void navigateToOnlineShoePortal() {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    /**
     * Clicks on the hamburger menu to reveal additional options.
     * This method finds the hamburger menu element from HomePage and clicks it.
     */
    public void clickOnHamburgerMenu() {
        homePage.getHamburgerMenuElement().click();
    }
    /**
     * Clicks on the dropdown menu for formal shoes in the products page.
     */
    public void clickOnFormalShoeDropDownMenu() {
        productsPages.getFormalShoesDropdownElement().click();
    }
    /**
     * This method simulates a click action on the sports shoes dropdown menu.
     */
    public void clickOnSportsShoeDropDownMenu() {
        productsPages.getSportsShoesDropdownElement().click();
    }

    /**
     * Clicks on the 'Order Products' link in the menu.
     * This method locates the order products link from HomePage and clicks it.
     */
    public void clickOnOrderProductsLink() {
        homePage.getOnlineProductsLinkElement().click();
    }

    /**
     * Retrieves the title of the formal shoe from the ProductsPage.
     * @return the text content of the formal shoe title.
     */
    public String getFormalShoeTitle() {
        return productsPages.getFormalShoesElement().getText();
    }

    /**
     * Retrieves the title of the sports shoe from the ProductsPage.
     * @return the text content of the sports shoe title.
     */
    public String getSportsShoeTitle() {
        return productsPages.getSportsShoesElement().getText();
    }

    /**
     * Retrieves the title of the sneaker from the ProductsPage.
     * @return the text content of the sneaker title.
     */
    public String getSneakerTitle() {
        return productsPages.getSneakersElement().getText();
    }

    /**
     * Retrieves the name of the first formal shoe listed on the ProductsPage.
     * @return the text content of the first formal shoe name.
     */
    public String getFirstFormalShoeName() {
        return productsPages.getFormalShoesFirstNameElement().getText();
    }

    /**
     * Retrieves the name of the first sports shoe listed on the ProductsPage.
     * @return the text content of the first sports shoe name.
     */
    public String getFirstSportsShoeName() {
        return productsPages.getSportsShoesFirstNameElement().getText();
    }
}