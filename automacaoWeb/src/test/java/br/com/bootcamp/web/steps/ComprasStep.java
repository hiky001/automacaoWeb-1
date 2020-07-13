package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.ComprasFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class ComprasStep {

    private ComprasFuncionalidade comprasFuncionalidade;
    private SeleniumRobot seleniumRobot;

    public ComprasStep(){
        this.comprasFuncionalidade = new ComprasFuncionalidade();
        this.seleniumRobot = new SeleniumRobot();
    }
    @Quando("^preencho as configurações do produto$")
    public void preenchoAsConfiguraçõesDoProduto() {
        comprasFuncionalidade.preenchoConfigProdutoEVaiParaCarrinho();
    }


    @E("^completo os dados de confirmação de compras$")
    public void completoOsDadosDeConfirmaçãoDeCompras() {
        comprasFuncionalidade.preencheDadosNoCarrinho();
    }
}
