@tag
Feature: Testes utilizando iframe

  @exemploTest01
  Scenario: Teste acesso iframe
    Given que o usuario acesse o site "https://demo.automationtesting.in/Frames.html"
    When digito "teste iframe" dentro do campo iframeDemo
    Then o campo deve ter o valor "teste iframe"
    
  @iframeTest
  Scenario: Teste acesso iframe
    Given que o usuario acesse o site "https://demo.automationtesting.in/Frames.html"
    And clico no botao Iframe with in an Iframe
    When digito "teste iframe" dentro do campo iframeDemo dentro do Nested iFrames
    Then o campo nested deve ter o valor "teste iframe"