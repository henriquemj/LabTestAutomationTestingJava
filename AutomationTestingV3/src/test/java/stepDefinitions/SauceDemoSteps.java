// StepDefinition.java
package stepDefinitions;

import actions.SauceDemoActions;
import io.cucumber.java.pt.*;

public class SauceDemoSteps {
	SauceDemoActions sauceDemoActions = new SauceDemoActions();
	
	//Tela de Login
	
    @Dado("que  o usuario acessa a aplicacao Sauce Demo")
    public void queOUsuarioAcessaAAplicacaoSauceDemo() {
    	sauceDemoActions.navegarHomePage();
    }

    @Quando("visualizar a tela de login")
    public void visualizarATelaDeLogin() {
    	sauceDemoActions.validarTituloSauceLabsHome("Swag Labs");
    	sauceDemoActions.validarUrl("https://www.saucedemo.com/");
    }

    @E("preencher o campo usuario com o dado {string}")
    public void preencherOCampoUsuarioComODado(String usuario) {
        sauceDemoActions.preencherCampoUsuario(usuario);
    }

    @E("preencher o campo senha com o dado {string}")
    public void preencherOCampoSenhaComODado(String senha) {
        sauceDemoActions.preencherCampoSenha(senha);
    }
    @E("clicar no botao Login")
    public void clicarNoBotaoLogin() {
        sauceDemoActions.clicarBotaoLogin();
    }

    @Entao("o usuario e redirecionado para tela com os produtos disponiveis")
    public void oUsuarioERedirecionadoParaTelaComOsProdutosDisponiveis() {
    	sauceDemoActions.validarUrl("https://www.saucedemo.com/inventory.html");
    }
    
    @Então("o sistema exibe a mensagem: {string}")
    public void oSistemaExibeMensagem(String msgErro) {
    	sauceDemoActions.exibirMensagemLoginError(msgErro);
    }
    
    // Tela de Exibição dos Produtos
    
    @E("o usuário é redirecionado para tela com os produtos disponíveis")
    public void oUsuarioERedirecionadoParaTelaComosProdutosDisponiveis() {
    	sauceDemoActions.validarUrl("https://www.saucedemo.com/inventory.html");
    }

    @E("seleciona o icone de filtro a opção Price low to high")
    public void selecionarOpcaoPriceLowHigh() {
    	sauceDemoActions.clicarFiltroPrecoMenorMaior();
    }

    @Então("a aplicação reordena os produtos do menor preço para o maior")
    public void aplicaçãoReordenaProdutosDoMenorPrecoParaOMaior() {
        sauceDemoActions.filtroPrecoMaiorMenorValidacao();
    }
    
    @E("clicar no nome do produto Sauce Labs Fleece Jacket")
    public void clicarNoNomeProdutoFleece() {
    	sauceDemoActions.clicarProdutoFleece(); 
    }
    
    @E("clicar no nome do produto Sauce Labs Bolt T-Shirt")
    public void clicarNoNomeProdutoBolt() {
    	sauceDemoActions.clicarProdutoBoltTshirt();
    }
    
    @Então("a aplicação redireciona o usuário para página de detalhes do produto {string}")
    public void aplicaçãoRedirecionaUsuárioPaginaDetalhesProduto(String produto) {
    	sauceDemoActions.verificarDetalhesProduto(produto);
    }
    
    @E("verificar se o produto está incluido no carrinho de compras {string}")
    public void verificarProdutoEstaIncluidoCarrinhoCompras(String produto) {
    	sauceDemoActions.detalhesProdutoBolt(produto);
    }

    @E("visualizar detalhes do produto {string}")
    public void visualizarDetalhesProduto(String produto) {
    	sauceDemoActions.detalhesProduto(produto);
    }

    @E("clicar no botão adicionar ao carrinho da página de detalhes")
    public void clicarBotãoAdicionarCarrinhoPaginaDetalhes() {
    	sauceDemoActions.clicarBotãoAdicionarCarrinhoDetalhes();
    }

    @E("clicar no botão meu carrinho para visualizar o carrinho de compras")
    public void clicarBotãoMeuCarrinhoParaVisualizarCarrinhoCompras() {
    	sauceDemoActions.clicarNoCarrinho();
    }

    @E("clicar no botão checkout para prosseguir com a compra")
    public void clicarBotãoCheckoutParaProsseguirComCompra() {
    	sauceDemoActions.clicarBotaoCheckout();
    }

    @E("digitar o primeiro nome no campo First Name {string}")
    public void digitarPrimeiroNomeCampoFirstName(String string) {
    	sauceDemoActions.preencherFirstName(string);
    }

    @E("digitar o sobrenome no campo Last Name {string}")
    public void digitarSobrenomeCampoLastName(String string) {
    	sauceDemoActions.preencherLastName(string);
    }

    @E("digitar o cep no campo Zip Postal {string}")
    public void digitarCepNoCampoZipPostal(String string) {
    	sauceDemoActions.preencherZipCode(string);
    }

    @E("clicar no botão continue")
    public void clicarNoBotãoContinue() {

    }

    @E("na  tela de Checkout Overview clicar no botão Finish")
    public void naTelaCheckoutOverviewClicarNoBotãoFinish() {

    }

    @Então("a aplicação exibirá a mensagem {string}")
    public void aplicaçãoExibiraMensagemSucesso(String string) {

    }
    
    @E("clicar no botão adicionar ao carrinho de compras")
    public void clicarBotãoAdicionarCarrinhoCompras() {

    }

    @E("clicar no botão remover para tirar o produto do carrinho de compras")
    public void clicarBotãoRemoverParaTirarProdutoCarrinhoCompras() {
    	sauceDemoActions.clicarBotaoRemover();
    }

    @E("a aplicação removerá o produto do carrinho com sucesso")
    public void aplicaçãoRemoveraProdutoCarrinhoComSucesso() {
    	sauceDemoActions.produtoRemovido();
    }
    
    @Dado("que o usuário estaja logado na aplicação")
    public void queUsuárioEstajaLogadoNaAplicacao() {
    	sauceDemoActions.navegarHomePage();
    	sauceDemoActions.preencherCampoUsuario("standard_user");
    	sauceDemoActions.preencherCampoSenha("secret_sauce");
    	sauceDemoActions.clicarBotaoLogin();
    }
    
    @E("preencho com os dados dos pessoais")
    public void preenchoComOsDadosDosPessoais() {
    	sauceDemoActions.preencherFirstName("Henrique");
    	sauceDemoActions.preencherLastName("Madureira");
    	sauceDemoActions.preencherZipCode("32554080");
    }
}



