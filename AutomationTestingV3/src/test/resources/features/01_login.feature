Feature: Validação Tela de Login

	@rodar_testes @login
  Scenario: Realizar login com usuário válido e senha válida
    Given que  o usuario acessa a aplicacao Sauce Demo
    When visualizar a tela de login
    And preencher o campo usuario com o dado "standard_user"
    And preencher o campo senha com o dado "secret_sauce"
    And clicar no botao Login
    Then o usuario e redirecionado para tela com os produtos disponiveis
  
  @rodar_testes @login                     
  Scenario: Realizar login com usuário válido e senha inválida
	  Given que  o usuario acessa a aplicacao Sauce Demo
	  When visualizar a tela de login
	  And preencher o campo usuario com o dado "standard_user"
	  And preencher o campo senha com o dado "123456"
	  And clicar no botao Login
	  Then o sistema exibe a mensagem: "Epic sadface: Username and password do not match any user in this service"