package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.CadastroFuncionalidade;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {

    private SeleniumRobot seleniumRobot;
    private CadastroFuncionalidade cadastroFuncionalidade;

    public CadastroSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.cadastroFuncionalidade = new CadastroFuncionalidade();
    }

    @Quando("^realizo o cadastro do cliente$")
    public void realizoCadastroDoCliente() {
        this.cadastroFuncionalidade.preencheDadosERegistra();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\" na tela$")
    public void visualizoAMensagemNaTela(String mensagem){
        this.cadastroFuncionalidade.validaCadastro(mensagem);
    }
}
