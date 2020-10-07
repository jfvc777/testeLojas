package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import stepdefinition.LojasAmericanas;

/**
 * @author Juan Castillo
 * @since 06/10/2020
 */
public class StepsLojasAmericanas {

    LojasAmericanas lojasAmericanas = new LojasAmericanas();


    @Dado("^que ingresamos ao site das Lojas Americanas$")
    public void queIngresamosAoSiteDasLojasAmericanas() {
        lojasAmericanas.acessarWeb();
    }


    @E("^selecionamos em Login$")
    public void selecionamosEmLogin() {
        lojasAmericanas.clicarLogin();
    }


    @Quando("^selecionamos em cliente novo$")
    public void selecionamosEmClienteNovo() {
        lojasAmericanas.clicarNovoCliente();
    }


    @E("^preenchemos no campo email o valor \"([^\"]*)\"$")
    public void preenchemosNoCampoEmailOValor(String email) throws Throwable {
        lojasAmericanas.preencherEmail(email);
    }

    @E("^preenchemos no campo senha o valor \"([^\"]*)\"$")
    public void preenchemosNoCampoSenhaOValor(String senha) throws Throwable {
        lojasAmericanas.preencherPass(senha);
    }


    @E("^selecionamos em Registrar$")
    public void selecionamosEmRegistrar() {
        lojasAmericanas.clicarRegistrar();
    }


    @Entao("^validar o mensagem de validacao do email$")
    public void validarOMensagemDeValidacaoDoEmail() {
        lojasAmericanas.validarMsgEmail();
    }

    @Entao("^validar o mensagem de validacao da senha$")
    public void validarOMensagemDeValidacaoDaSenha() {
        lojasAmericanas.validarSenhaFraca();
    }

    @E("^preenchemos no campo cpf o valor \"([^\"]*)\"$")
    public void preenchemosNoCampoCpfOValor(String cpf) throws Throwable {
        lojasAmericanas.preencherCPF(cpf);
    }

    @Entao("^validar o mensagem de validacao do CPF$")
    public void validarOMensagemDeValidacaoDoCPF() {
        lojasAmericanas.validarCPFInvalido();
    }

    @E("^preenchemos no campo nome o valor \"([^\"]*)\"$")
    public void preenchemosNoCampoNomeOValor(String nomeCompleto) throws Throwable {
        lojasAmericanas.preencherNome(nomeCompleto);
    }

    @E("^preenchemos no campo data de nascimento o valor \"([^\"]*)\"$")
    public void preenchemosNoCampoDataDeNascimentoOValor(String data) throws Throwable {
        lojasAmericanas.preencherData(data);
    }

    @E("^selecionamos no campo sexo o valor \"([^\"]*)\"$")
    public void selecionamosNoCampoSexoOValor(String sexo) throws Throwable {
        lojasAmericanas.selecionarSexo(sexo);
    }


    @E("^preenchemos no campo telefone o valor \"([^\"]*)\"$")
    public void preenchemosNoCampoTelefoneOValor(String telefone) throws Throwable {
        lojasAmericanas.preencherTelefone(telefone);
    }

    @Entao("^validar que sejamos redireccionados ao HOME$")
    public void validarQueSejamosRedireccionadosAoHOME() {
        lojasAmericanas.validarHome();
    }

    @E("^selecionamos em Entrar$")
    public void selecionamosEmEntrar() {
        lojasAmericanas.selecionarEntrar();
    }

    @E("^selecionamos em Continuar o login$")
    public void selecionamosEmContinuarOLogin() {
        lojasAmericanas.selecionarContinuarLogin();
    }

    @E("^procuramos pelo produto \"([^\"]*)\"$")
    public void procuramosPeloProduto(String produto) throws Throwable {
        lojasAmericanas.procurarProduto(produto);
    }
}
