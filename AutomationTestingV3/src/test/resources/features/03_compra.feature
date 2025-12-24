Feature: Validação Tela de Compra

	@rodar_testes @compra_produtos
  Scenario: Efetuar a compra de um dos produtos
    Contexto: 
	    Given que o usuário estaja logado na aplicação
			And o usuário é redirecionado para tela com os produtos disponíveis
			And clicar no nome do produto Sauce Labs Bolt T-Shirt
			And visualizar detalhes do produto "Sauce Labs Bolt T-Shirt"
			And clicar no botão adicionar ao carrinho da página de detalhes
			And clicar no botão meu carrinho para visualizar o carrinho de compras 
			And verificar se o produto está incluido no carrinho de compras "Sauce Labs Bolt T-Shirt"
			And clicar no botão checkout para prosseguir com a compra
			And preencho com os dados dos pessoais
			And clicar no botão continue
			And na  tela de Checkout Overview clicar no botão Finish
			Then a aplicação exibirá a mensagem "Thank you for your order!"
    
  
   @rodar_testes @remover_produtos                      
  	Scenario: Selecionar um dos produtos para compra e removê-lo do carrinho
  		Given que o usuário estaja logado na aplicação
			And o usuário é redirecionado para tela com os produtos disponíveis
			And clicar no nome do produto Sauce Labs Bolt T-Shirt
			And visualizar detalhes do produto "Sauce Labs Bolt T-Shirt"
			And clicar no botão adicionar ao carrinho da página de detalhes
			And clicar no botão adicionar ao carrinho de compras
			And clicar no botão meu carrinho para visualizar o carrinho de compras 
			And verificar se o produto está incluido no carrinho de compras "Sauce Labs Bolt T-Shirt"
			And clicar no botão remover para tirar o produto do carrinho de compras
			Then a aplicação removerá o produto do carrinho com sucesso
  