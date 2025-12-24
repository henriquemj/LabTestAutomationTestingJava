package actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import Pages.SauceDemoPage;
import utils.BasePage;

public class SauceDemoActions extends BasePage{
	SauceDemoPage sauceDemoPage = new SauceDemoPage();
	
	// Tela de Login

	public void navegarHomePage() {
		driver.get("https://www.saucedemo.com/");
	}

	public void validarTituloSauceLabsHome(String titulo) {
		assertEquals(sauceDemoPage.getTituloHomePage().getText(), titulo);
		
	}

	public void validarUrl(String url) {
		assertEquals(driver.getCurrentUrl(), url);
		
	}

	public void preencherCampoUsuario(String usuario) {
		sauceDemoPage.getUserNameField().sendKeys(usuario);
		
	}
	
	public void preencherCampoSenha(String senha) {
		sauceDemoPage.getPasswordField().sendKeys(senha);
		
	}

	public void clicarBotaoLogin() {
		sauceDemoPage.getLoginButton().click();
	}
	
	public void exibirMensagemLoginError(String msgErro) {
		assertEquals(sauceDemoPage.getMessageLogin().getText(), msgErro);
	}
	
	public void clicarFiltroPrecoMenorMaior() {
		sauceDemoPage.getFiltroPrecoMenorMaior().click();
	}
	
	public void exibirProdutoPrecoMenorMaior() {
		sauceDemoPage.getProdutoOrdenado().getText();
	}
	
	public void clicarProdutoFleece() {
		sauceDemoPage.getTituloProdutoFleece().click();
	}
	
	public void clicarProdutoBoltTshirt() {
		sauceDemoPage.getTituloProdutoBoltTshirt().click();
	}
	
	public void detalhesProduto(String produto) {
		assertEquals(sauceDemoPage.getDetalheProduto().getText(), produto);
	}
	
	public void detalhesProdutoBolt(String produto) {
		assertEquals(sauceDemoPage.getDetalheProdutoBolt().getText(), produto);
	}
	
	public void clicarNoCarrinho() {
		sauceDemoPage.getCarrinho().click();
	}
	
	public void ValidarProdutosNoCarrinho(String produto) {
		assertEquals(sauceDemoPage.getProdutosNoCarrinho().getText(), produto);
	}
	
	public void clicarBotaoCheckout() {
		sauceDemoPage.getBotaoCheckout().click();
	}
	
	public void verificarDetalhesProduto(String produto) {
		assertEquals(sauceDemoPage.getDetalheProduto().getText(), produto);
	}
	
	public void validarProdutoTShirt(String produto) {
		assertEquals(sauceDemoPage.getValidarProdutoTshirt().getText(), produto);
	}
	
	// Ordenação de Preços Produtos
	
	public void filtroPrecoMaiorMenorValidacao() {
		sauceDemoPage.getFiltroPrecoMenorMaior().click();
		String exibirPrimeiroElementoProduto = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]")).getText();
		String exibirUltimoElementoProduto = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]")).getText();
		sauceDemoPage.getFiltroPrecoMaiorMenor().click();
		
		String primeiroElementoProduto = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]")).getText();
		String ultimoElementoProduto = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]"))
				.getText();

		if (exibirPrimeiroElementoProduto.equals(ultimoElementoProduto)
				&& exibirUltimoElementoProduto.equals(primeiroElementoProduto)) {
		} else {
			throw new RuntimeException("Erro: Os elementos dos produtos selecionados não estão na mesma posição.");
		}

	}
	
	//VALIDAR_PRODUTOS
	
	public void clicarBotãoAdicionarCarrinhoDetalhes() {
		sauceDemoPage.getCarrinhoBoltTshirt().click();
	}
	
	public void clicarBotãoCarrinhoCompraDetalhes() {
		sauceDemoPage.getCarrinhoTshirt().click();
	}
	
	public void clicarExibirCarrinhoCompraDetalhes() {
		sauceDemoPage.getExibirCompraCarrinho().click();
	}
	
	public void clicarBotãoRemover() {
		sauceDemoPage.getBotaoRemover().click();
	}
	
	public void preencherFirstName(String lastname) {
		sauceDemoPage.getFirtsName().sendKeys(lastname);
	}
	
	public void preencherLastName(String lastname) {
		sauceDemoPage.getLastName().sendKeys(lastname);
	}
	
	public void preencherZipCode(String zipcode) {
		sauceDemoPage.getZipCode().sendKeys(zipcode);
	}
	
	public void clicarBotaoContinue() {
		sauceDemoPage.getBotaoContinue().click();
	}
	
	public void clicarBotaoFinalizar() {
		sauceDemoPage.getBotaoFinalizar().click();
	}
	
	public void clicarBotaoRemover() {
		sauceDemoPage.getBotaoRemover().click();
	}
	
	public void produtoRemovido() {
		sauceDemoPage.getProdutoRemovido().isDisplayed();
	}
	
	public void exibirMensagemFinalizarCompra(String msg) {
		assertEquals(sauceDemoPage.getMensagemFinalizarCompra(), msg);
	}
	
}
