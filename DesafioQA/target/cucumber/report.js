$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/LojasAmericanasTeste.feature");
formatter.feature({
  "name": "Cadastro para Cliente Novo no site Lojas Americanas",
  "description": "  - Primeira parte somente validacao de erros\n  - Segunda parte cadastro e procurar ofertas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Teste_Lojas_Americanas"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que ingresamos ao site das Lojas Americanas",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepsLojasAmericanas.queIngresamosAoSiteDasLojasAmericanas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionamos em Login",
  "keyword": "E "
});
formatter.match({
  "location": "StepsLojasAmericanas.selecionamosEmLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar a mensagem de e-mail ja cadastrado",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Teste_Lojas_Americanas"
    },
    {
      "name": "@Parte_01_Validar_Email_Cadastrado"
    }
  ]
});
formatter.step({
  "name": "selecionamos em cliente novo",
  "keyword": "Quando "
});
formatter.match({
  "location": "StepsLojasAmericanas.selecionamosEmClienteNovo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenchemos no campo email o valor \"teste@hotmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "StepsLojasAmericanas.preenchemosNoCampoEmailOValor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preenchemos no campo senha o valor \"12\"",
  "keyword": "E "
});
formatter.match({
  "location": "StepsLojasAmericanas.preenchemosNoCampoSenhaOValor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionamos em Registrar",
  "keyword": "E "
});
formatter.match({
  "location": "StepsLojasAmericanas.selecionamosEmRegistrar()"
});
formatter.result({
  "status": "passed"
});
});