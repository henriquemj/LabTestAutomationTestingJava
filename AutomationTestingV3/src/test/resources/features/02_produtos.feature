Feature: Alterar a ordem de exibição dos produtos para ordem crescente de preço 

   @rodar_testes @exibir_produtos
   Scenario: Alterar a ordem de exibição dos produtos para ordem crescente de preço
    Given que o usuário estaja logado na aplicação
		And o usuário é redirecionado para tela com os produtos disponíveis 
		And seleciona o icone de filtro a opção Price low to high
		Then a aplicação reordena os produtos do menor preço para o maior
		
	 @rodar_testes @exibir_produtos
	 Scenario: Acessar os dados detalhados de um dos produtos
	 	Given que o usuário estaja logado na aplicação
		And o usuário é redirecionado para tela com os produtos disponíveis
		And clicar no nome do produto Sauce Labs Fleece Jacket
		Then a aplicação redireciona o usuário para página de detalhes do produto "Sauce Labs Fleece Jacket"  

