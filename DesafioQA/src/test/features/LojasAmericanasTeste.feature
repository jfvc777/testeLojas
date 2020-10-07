#language: pt

@Teste_Lojas_Americanas
Funcionalidade: Cadastro para Cliente Novo no site Lojas Americanas
  - Primeira parte somente validacao de erros
  - Segunda parte cadastro e procurar ofertas

  Contexto:
    Dado que ingresamos ao site das Lojas Americanas
    E selecionamos em Login

  @Parte_01_Validar_Email_Cadastrado
  Cenario: Validar a mensagem de e-mail ja cadastrado
    Quando selecionamos em cliente novo
    E preenchemos no campo email o valor "teste@hotmail.com"
    E preenchemos no campo senha o valor "12"
    E selecionamos em Registrar
    Entao validar o mensagem de validacao do email

  @Parte_01_Validar_Mensagem_de_Senha
  Cenario: Validar a mensagem de senha fraca
    Quando selecionamos em cliente novo
    E preenchemos no campo senha o valor "32"
    Entao validar o mensagem de validacao da senha

  @Parte_01_Validar_Mensagem_CPF
  Cenario: Validar a mensagem de e-mail ja cadastrado
    Quando selecionamos em cliente novo
    E preenchemos no campo email o valor "teste@hotmail.com"
    E preenchemos no campo senha o valor "12"
    E preenchemos no campo cpf o valor "2312"
    E selecionamos em Registrar
    Entao validar o mensagem de validacao do CPF

  @Parte_02_Realizar_cadastro_sucesso
  Cenario: Validar a mensagem de e-mail ja cadastrado
    Quando selecionamos em cliente novo
    E preenchemos no campo email o valor "teste@hotmail.com"
    E preenchemos no campo senha o valor "12"
    E preenchemos no campo cpf o valor "2312"
    E preenchemos no campo nome o valor "Carlos Augusto"
    E preenchemos no campo data de nascimento o valor "13/09/1998"
    E selecionamos no campo sexo o valor "masculino"
    E preenchemos no campo telefone o valor "11998928292"
    E selecionamos em Registrar
    Entao validar que sejamos redireccionados ao HOME

  @Parte_02_Procurar_Produto
  Cenario: Adicionar produto e realizar comprar
    Quando selecionamos em cliente novo
    E selecionamos em Entrar
    E preenchemos no campo email o valor "teste@hotmail.com"
    E preenchemos no campo senha o valor "12"
    E selecionamos em Continuar o login
    E procuramos pelo produto "Moto G6"




