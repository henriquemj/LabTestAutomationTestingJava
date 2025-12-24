package actions;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;

import Pages.IframeTestPage;
import utils.BasePage;

public class IframeTestActions extends BasePage{
	IframeTestPage page = new IframeTestPage();

	public void navegarParaPaginaIframe(String url) {
		driver.get(url);
	}

	public void digitarNoCampoIframe(String texto) {
		acessarIframe(page.getIframe());
		page.getIframeField().sendKeys(texto);
		sairIframe();
	}

	public void validarValorCampoIframe(String texto) {
		acessarIframe(page.getIframe());
		assertEquals(page.getIframeField().getDomProperty("value"), texto);
		sairIframe();
	}
	
	public void acessarIframe(WebElement iframe) {
		driver.switchTo().frame(iframe);
		
	}
	
	public void sairIframe() {
        driver.switchTo().defaultContent();
	}

	public void clicarBotaoIframes() {
		page.getIfamesButton().click();
	}

	public void digitarNoCampoIframeDentroDoNestedIframes(String texto) {
		acessarIframe(page.getIfameNested1());
		acessarIframe(page.getIfameNested2());
		page.getIframeField().sendKeys(texto);
		sairIframe();		
	}

	public void validarValorCampoIframeNested(String texto) {
		acessarIframe(page.getIfameNested1());
		acessarIframe(page.getIfameNested2());
		assertEquals(page.getIframeFieldNestedField().getDomProperty("value"), texto);
		sairIframe();			
	}

}
