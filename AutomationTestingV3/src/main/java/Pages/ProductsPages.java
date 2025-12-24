package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class ProductsPages extends BasePage {

    // Element mappings
    private static final String FORMAL_SHOES_XPATH = "/html/body/div[2]/center/h2";
    private static final String SPORTS_SHOES_XPATH = "/html/body/div[3]/center/h2";
    private static final String SNEAKERS_XPATH = "/html/body/div[4]/center/h2";
    private static final String FORMAL_SHOES_DROPDOWN_XPATH = "/html/body/div[2]/center/div/i[1]";
    private static final String SPORTS_SHOES_DROPDOWN_XPATH = "/html/body/div[3]/center/div/i[1]";
    private static final String FORMAL_SHOES_FIRST_NAME_XPATH = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    private static final String SPORTS_SHOES_FIRST_NAME_XPATH = "/html/body/div[3]/table/tbody/tr[1]/td[1]";

    // Getter methods for the WebElements

    public WebElement getFormalShoesElement() {
        return driver.findElement(By.xpath(FORMAL_SHOES_XPATH));
    }

    public WebElement getSportsShoesElement() {
        return driver.findElement(By.xpath(SPORTS_SHOES_XPATH));
    }

    public WebElement getSneakersElement() {
        return driver.findElement(By.xpath(SNEAKERS_XPATH));
    }

    public WebElement getFormalShoesDropdownElement() {
        return driver.findElement(By.xpath(FORMAL_SHOES_DROPDOWN_XPATH));
    }

    public WebElement getSportsShoesDropdownElement() {
        return driver.findElement(By.xpath(SPORTS_SHOES_DROPDOWN_XPATH));
    }

    public WebElement getFormalShoesFirstNameElement() {
        return driver.findElement(By.xpath(FORMAL_SHOES_FIRST_NAME_XPATH));
    }

    public WebElement getSportsShoesFirstNameElement() {
        return driver.findElement(By.xpath(SPORTS_SHOES_FIRST_NAME_XPATH));
    }
}