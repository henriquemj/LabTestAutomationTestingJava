package stepDefinitions;

import actions.IframeTestActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IframeTestSteps {
	IframeTestActions actions = new IframeTestActions();

	@Given("que o usuario acesse o site {string}")
	public void que_o_usuario_acesse_o_site(String url) {
		actions.navegarParaPaginaIframe(url);
	}

	@When("digito {string} dentro do campo iframeDemo")
	public void digito_dentro_do_campo_iframe_demo(String texto) {
		actions.digitarNoCampoIframe(texto);
	}

	@Then("o campo deve ter o valor {string}")
	public void o_campo_deve_ter_o_valor(String texto) {
		actions.validarValorCampoIframe(texto);
	}

	@Given("clico no botao Iframe with in an Iframe")
	public void clico_no_botao_iframe_with_in_an_iframe() {
		actions.clicarBotaoIframes();
	}

	@When("digito {string} dentro do campo iframeDemo dentro do Nested iFrames")
	public void digito_dentro_do_campo_iframe_demo_dentro_do_nested_i_frames(String texto) {
		actions.digitarNoCampoIframeDentroDoNestedIframes(texto);
	}
	
	@Then("o campo nested deve ter o valor {string}")
	public void o_campo_nested_deve_ter_o_valor(String texto) {
	    actions.validarValorCampoIframeNested(texto);
	}



}
