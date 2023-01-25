# language: pt

@cadastro
Funcionalidade: Realizar cadastro usuario
  Eu como novo usuario
  Quero realizar um cadastro
  Para fazer compras

  @cadastro_sucesso
  Cenario: Registrar novo usuario com sucesso
    Dado que estou na pagina de login
    E acesso o cadastro de usuario
    Quando eu preencho o formulario de cadastro com informacoes validas
    E clico em registrar
    Entao vejo a mensagem de cadastro realizado com sucesso

  @cadastro_sucesso2
  Cenario: Registrar novo usuario com sucesso2
    Dado que estou na pagina de login
    E acesso o cadastro de usuario
    Quando eu preencho o formulario de cadastro com informacoes validas
    E clico em registrar
    Entao vejo a mensagem de cadastro realizado com sucesso