package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.enums.Credentials;
import br.com.bootcamp.funcionalidade.web.HomeFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import javax.swing.*;

public class HomeSteps {

    private SeleniumRobot seleniumRobot;
    private HomeFuncionalidade homeFuncionalidade;
    private LoginSteps loginSteps;

    public HomeSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.homeFuncionalidade = new HomeFuncionalidade();
        this.loginSteps = new LoginSteps();
    }

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String textoBotao){
        this.homeFuncionalidade.clicaBotao(textoBotao);
    }

    @Entao("^visualizo a tela inicial com meu usuario logado$")
    public void visualizoATelaInicialComMeuUsuarioLogado() {
        Assert.assertEquals(Credentials.CADASTRADO.usuarioCliente(), homeFuncionalidade.pegaEmailLogado());
    }

    @Dado("^que acesso a tela de login com o usuário logado$")
    public void queAcessoATelaDeLoginComOUsuárioLogado() {
        this.homeFuncionalidade.clicaBotao("Log in");
        this.loginSteps.preenchoOsDadosDeLoginComUsuário("cadastrado");
        this.loginSteps.clicoEmLogIn();
    }

    @E("^clico no produto$")
    public void clicoNoProduto() {
        this.homeFuncionalidade.clicaBotaoProduto();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoAMensagem(String arg0) throws Throwable {
        Assert.assertEquals("Your order has been successfully processed!", homeFuncionalidade.validoMensagemDeCompraExibida());
    }


    @Entao("^visualizo o item pesquisado$")
    public void visualizoOItemPesquisado() {
        Assert.assertTrue(homeFuncionalidade.verificaItemPassado());
    }

    @Dado("^que escrevo no campo de pesquisa$")
    public void queEscrevoNoCampoDePesquisa() {
        this.homeFuncionalidade.escreveCampoPesquisa("Fiction EX");
    }

    @Quando("^clico no botao de busca$")
    public void clicoNoBotaoDeBusca() {
        this.homeFuncionalidade.clicaBotaoDeBusca();
    }
}
