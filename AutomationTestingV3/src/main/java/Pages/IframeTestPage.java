package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BasePage;

public class IframeTestPage extends BasePage{
	private static final String I_FRAME_FIELD = "body > section > div > div > div > input[type=text]";
	private static final String I_FRAME = "singleframe";
	private static final String I_FRAMES_BUTTON = "/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a";
	private static final String I_FRAME_NESTED1 = "//*[@id=\"Multiple\"]/iframe";
	private static final String I_FRAME_NESTED2 = "/html/body/section/div/div/iframe";
	private static final String I_FRAME_NESTED_FIELD = "/html/body/section/div/div/div/input";
    public WebElement getIframeField() {
        return driver.findElement(By.cssSelector(I_FRAME_FIELD));
    }
    
    public WebElement getIframeFieldNestedField() {
        return driver.findElement(By.xpath(I_FRAME_NESTED_FIELD));
    }
    
    public WebElement getIframe() {
        return driver.findElement(By.id(I_FRAME));
    }
    
    public WebElement getIfameNested1() {
        return driver.findElement(By.xpath(I_FRAME_NESTED1));
    }
    
    public WebElement getIfameNested2() {
        return driver.findElement(By.xpath(I_FRAME_NESTED2));
    }
    
    public WebElement getIfamesButton() {
        return driver.findElement(By.xpath(I_FRAMES_BUTTON));
    }
}
