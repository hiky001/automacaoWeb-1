package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.ComprasPage;
import br.com.bootcamp.pages.web.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest{
	
	private SeleniumRobot seleniumRobot;
	private HomePage homePage;
	private ComprasPage comprasPage;
	
	public HomeFuncionalidade() {
		this.homePage = new HomePage(webDriver);
		this.seleniumRobot = new SeleniumRobot();
		this.comprasPage = new ComprasPage(webDriver);
	}

	public String pegaEmailLogado(){
		return this.seleniumRobot.pegarValorTexto(this.homePage.getMensagemLogado());
	}


	public void clicaBotaoProduto(){
		this.seleniumRobot.scrollAteOElementoJS(this.homePage.getProduto());
		this.seleniumRobot.clicaBotaoJS(this.homePage.getProduto());
	}

	public String validoMensagemDeCompraExibida(){
		return this.seleniumRobot.pegarValorTexto(comprasPage.getMensagemConfirmacaoCompra());
	}

	public void escreveCampoPesquisa(String valor){
		this.seleniumRobot.insireTextoNoElementoJS(homePage.getCampoPesquisa(), valor);
	}

	public void clicaBotaoDeBusca(){
		seleniumRobot.clicaBotaoJS(homePage.getBotaoSearch());
	}

	public boolean verificaItemPassado(){
		return seleniumRobot.verificaElementoPresenteTela(homePage.getItemPesquisado());
	}
}
