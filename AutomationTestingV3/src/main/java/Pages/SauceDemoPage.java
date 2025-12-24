package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BasePage;

public class SauceDemoPage extends BasePage{
	
	// Mapeamento dos Elementos
	
    private static final String TITULO_HOME_PAGE = "//*[@id=\"root\"]/div/div[1]";
    private static final String USER_NAME_FIELD = "//*[@id=\"user-name\"]";
    private static final String PASSWORD_FIELD = "//*[@id=\"password\"]";
    private static final String LOGIN_BUTTON = "//*[@id=\"login-button\"]";
    private static final String ERROR_MENSSAGE = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
    private static final String FILTRO_MENOR_MAIOR = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]";
	private static final String FILTRO_MAIOR_MENOR = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]";
    private static final String PRODUTO_MENOR_VALOR = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div/text()[2]";
    private static final String PRODUTO_FLEECE_JACKET = "//*[@id=\"item_5_title_link\"]/div";
    private static final String PRODUTO_BOLT_TSHIRT = "//*[@id=\"item_1_title_link\"]/div";
    private static final String DETALHES_PRODUTO = "//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]";
    private static final String DETALHES_PRODUTO_BOLT = "//*[@id=\"item_1_title_link\"]/div";
    private static final String BOTAO_CARRINHO_COMPRA = "//*[@id=\"shopping_cart_container\"]/a";
    private static final String ADD_CARRINHO_BOLT_TSHIRT = "//*[@id=\"add-to-cart\"]";
    private static final String CARRINHO_COMPRA_TSHIRT = "//*[@id=\"add-to-cart\"]";
    private static final String VISUALIZAR_COMPRA_CARRINHO = "//*[@id=\"shopping_cart_container\"]";
    private static final String VALIDAR_PRODUTO_TSHIRT = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[1]";
    private static final String CARRINHO_LISTA = "//*[@id=\"cart_contents_container\"]/div/div[1]";
    private static final String BOTAO_CHECKOUT = "//*[@id=\"checkout\"]";
    private static final String FIRST_NAME = "//*[@id=\"first-name\"]";
    private static final String LAST_NAME = "//*[@id=\"last-name\"]";
    private static final String ZIP_CODE = "//*[@id=\"postal-code\"]";
    private static final String BOTAO_CONTINUE = "//*[@id=\"continue\"]";
    private static final String BOTAO_FINALIZAR = "//*[@id=\"finish\"]";
    private static final String MENSAGEM_FINALIZAR_COMPRA = "//*[@id=\"checkout_complete_container\"]/h2";
    private static final String BOTAO_REMOVER = "//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]";
    private static final String PRODUTO_REMOVIDO = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]";
    
    public WebElement getLoginButton() {
		return driver.findElement(By.xpath(LOGIN_BUTTON));
	}    
    
    public WebElement getPasswordField() {
		return driver.findElement(By.xpath(PASSWORD_FIELD));
	}

	public WebElement getTituloHomePage() {
        return driver.findElement(By.xpath(TITULO_HOME_PAGE));
    }
	
    public WebElement getUserNameField() {
        return driver.findElement(By.xpath(USER_NAME_FIELD));
    }
	
	public WebElement getMessageLogin() {
        return driver.findElement(By.xpath(ERROR_MENSSAGE));
    }
	
	public WebElement getFiltroPrecoMenorMaior() {
        return driver.findElement(By.xpath(FILTRO_MENOR_MAIOR));
    }
	
	public WebElement getFiltroPrecoMaiorMenor() {
        return driver.findElement(By.xpath(FILTRO_MAIOR_MENOR));
    }
	
	public WebElement getProdutoOrdenado() {
        return driver.findElement(By.xpath(PRODUTO_MENOR_VALOR));
    }
	
	public WebElement getTituloProdutoFleece() {
        return driver.findElement(By.xpath(PRODUTO_FLEECE_JACKET));
    }
	
	public WebElement getTituloProdutoBoltTshirt() {
        return driver.findElement(By.xpath(PRODUTO_BOLT_TSHIRT));
    }
	
	public WebElement getDetalheProduto() {
        return driver.findElement(By.xpath(DETALHES_PRODUTO));
    }
	
	public WebElement getDetalheProdutoBolt() {
        return driver.findElement(By.xpath(DETALHES_PRODUTO_BOLT));
    }
	
	public WebElement getCarrinho() {
        return driver.findElement(By.xpath(BOTAO_CARRINHO_COMPRA));
    }
	
	public WebElement getExibirCompraCarrinho() {
        return driver.findElement(By.xpath(VISUALIZAR_COMPRA_CARRINHO));
    }
	
	public WebElement getProdutosNoCarrinho() {
        return driver.findElement(By.xpath(CARRINHO_LISTA));
    }
	
	public WebElement getCarrinhoBoltTshirt() {
        return driver.findElement(By.xpath(ADD_CARRINHO_BOLT_TSHIRT));
    }
	
	public WebElement getCarrinhoTshirt() {
        return driver.findElement(By.xpath(CARRINHO_COMPRA_TSHIRT));
    }
	
	public WebElement getValidarProdutoTshirt() {
        return driver.findElement(By.xpath(VALIDAR_PRODUTO_TSHIRT));
    }
	
	public WebElement getBotaoCheckout() {
        return driver.findElement(By.xpath(BOTAO_CHECKOUT));
    }
	
	public WebElement getBotaoRemover() {
        return driver.findElement(By.xpath(BOTAO_REMOVER));
    }
	
	public WebElement getProdutoRemovido() {
        return driver.findElement(By.xpath(PRODUTO_REMOVIDO));
    }
	
	public WebElement getFirtsName() {
        return driver.findElement(By.xpath(FIRST_NAME));
    }
	
	public WebElement getLastName() {
        return driver.findElement(By.xpath(LAST_NAME));
    }
	
	public WebElement getZipCode() {
        return driver.findElement(By.xpath(ZIP_CODE));
    }
	
	public WebElement getBotaoContinue() {
        return driver.findElement(By.xpath(BOTAO_CONTINUE));
    }
	
	public WebElement getBotaoFinalizar() {
        return driver.findElement(By.xpath(BOTAO_FINALIZAR));
    }
	
	public WebElement getMensagemFinalizarCompra() {
        return driver.findElement(By.xpath(MENSAGEM_FINALIZAR_COMPRA));
    }
	
}
