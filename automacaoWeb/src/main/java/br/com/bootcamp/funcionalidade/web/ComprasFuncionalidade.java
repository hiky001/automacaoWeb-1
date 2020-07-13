package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.ComprasPage;
import br.com.bootcamp.settings.BaseTest;

public class ComprasFuncionalidade extends BaseTest {

    private ComprasPage comprasPage;
    private SeleniumRobot seleniumRobot;

    public ComprasFuncionalidade(){
        this.comprasPage = new ComprasPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void preenchoConfigProdutoEVaiParaCarrinho(){
        this.seleniumRobot.clicaBotaoJS(comprasPage.getSelectProcessor());
        this.seleniumRobot.selecionaItemLista(this.comprasPage.getSelectProcessor(),
                seleniumRobot.pegarValorTexto(this.comprasPage.getOpcaoSelectProcessor2_2()));
        this.seleniumRobot.clicaBotaoJS(comprasPage.getSelectRam());
        this.seleniumRobot.selecionaItemLista(comprasPage.getSelectRam(),
                seleniumRobot.pegarValorTexto(comprasPage.getOpcaoSelectRam()));
        this.seleniumRobot.clicaBotaoJS(comprasPage.getRadioHDD());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getRadioOS());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoAddAoCarrinho());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoShoppingCart());
    }

    public void preencheDadosNoCarrinho(){
        this.seleniumRobot.scrollAteOElementoJS(comprasPage.getCheckBoxConcordoComTermos());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getCheckBoxConcordoComTermos());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoCheckout());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoContinue());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoContinueDois());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoContinuePassoTres());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getCheckBoxCartaoCredito());
        this.seleniumRobot.scrollAteOElementoJS(comprasPage.getBotaoContinueTres());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoContinueTres());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getSelectCreditCard());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getSelectCreditCardMasterCard());
        this.seleniumRobot.insireTextoNoElementoJS(comprasPage.getCardHolderName(), "Bunito");
        this.seleniumRobot.insireTextoNoElementoJS(comprasPage.getCardNumber(), "5480 8480 6193 5144");
        this.seleniumRobot.clicaBotaoJS(comprasPage.getExpirationDateMesUm());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getExpirationDateMes());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getExpirationDateAnoUm());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getExpirationDateAno());
        this.seleniumRobot.insireTextoNoElementoJS(comprasPage.getCardCode(), "209");
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoContinueQuatro());
        this.seleniumRobot.scrollAteOElementoJS(comprasPage.getBotaoContinueCinco());
        this.seleniumRobot.clicaBotaoJS(comprasPage.getBotaoContinueCinco());

    }
}
