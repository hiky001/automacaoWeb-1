package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//input[@id = 'Email']")
	private WebElement txtEmail;
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	@FindBy(xpath = "//input[@id = 'Password']")
	private WebElement txtSenha;
	public WebElement getTxtSenha() {
		return txtSenha;
	}

	@FindBy(xpath = "//input[@class = 'button-1 login-button']")
	private WebElement botaoLogIn;
	public WebElement getBotaoLogIn(){
		return botaoLogIn;
	}

}
