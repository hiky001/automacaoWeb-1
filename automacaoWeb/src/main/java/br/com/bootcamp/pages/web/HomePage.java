package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver webDriver) {
		
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//")
	private WebElement btnTeste;
	public WebElement getBtnTeste() {
		return btnTeste;
	}

	@FindBy(xpath = "//* [text() = 'henriqueauto@gg.com']")
	private WebElement mensagemLogado;
	public WebElement getMensagemLogado(){
		return mensagemLogado;
	}

	@FindBy(xpath = "//*[text()= 'Build your own computer']")
	private WebElement produto;
	public WebElement getProduto(){
		return produto;
	}

	@FindBy(xpath = "//input[@id = 'small-searchterms']")
	private WebElement campoPesquisa;
	public WebElement getCampoPesquisa(){
		return campoPesquisa;
	}

	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement botaoSearch;
	public WebElement getBotaoSearch(){
		return botaoSearch;
	}

	@FindBy(xpath = "//a[text() = 'Fiction EX']")
	private WebElement itemPesquisado;
	public WebElement getItemPesquisado(){
		return itemPesquisado;
	}

}
