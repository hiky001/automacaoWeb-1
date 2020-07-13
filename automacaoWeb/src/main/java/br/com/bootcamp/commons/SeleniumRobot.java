package br.com.bootcamp.commons;

import br.com.bootcamp.settings.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumRobot extends BaseTest {

	/**
	 * Clicar em um botão através de JavaScriptExecutor
	 * @param elemento Insira o elemento que você deseja clicar.
	 */
	public void clicaBotaoJS(WebElement elemento){
		waitProcessPage();
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public void clicaBotaoPorTexto(String texto){
		waitProcessPage();
		webDriver.findElement(By.xpath("//*[text()='"+texto+"']")).click();
	}

	/**
	 * Insere um texto no campo através de JavaScriptExecutor
	 * @param elemento Insira o elemento onde você deseja preencher no campo
	 * @param valor Insira o valor que você deseja preencher no campo
	 */
	public void insireTextoNoElementoJS(WebElement elemento, String valor){
		waitProcessPage();
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].value='"+valor+"';", elemento);
	}
	/**
	 * Marcar um checkbox através de JavaScriptExecutor
	 * @param id Insira o id do elemento que você quer marcar
	 */
	public void selecionaCheckBoxJS(String id){
		waitProcessPage();
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("document.getElementById('"+ id +"').checked=true;");
	}

	/**
	 * Retorna o valor de texto que existe no elemento
	 * @param elemento Insira o elemento que você deseja capturar o texto
	 * @return Retorna o valor de texto do elemento
	 */
	public String pegarValorTexto(WebElement elemento){
		waitProcessPage();
		esperaElementoSerVisivel(elemento);
		return elemento.getText();
	}

	/**
	 * Valida se o texto atual é igual ao texto esperado
	 * @param atual Insira o valor do texto atual
	 * @param esperado Insira o valor do texto esperado
	 * @return Retorna verdadeiro ou falso
	 */
	public boolean validaTexto(String atual, String esperado){
		waitProcessPage();
		return atual.equals(esperado);
	}

	/**
	 * Realiza o Scroll da página até encontrar o elemento.(Obs: Elemento precisa existir na página)
	 * @param elemento
	 */
	public void scrollAteOElementoJS(WebElement elemento){
		waitProcessPage();
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].scrollIntoView();", elemento);
	}

	/**
	 * Realiza Scroll ate o fim da página
	 */
	public void scrollAteFimDaPaginaJS(){
		waitProcessPage();
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Realiza Scroll ate o topo da página
	 */
	public void scrollAteTopoDaPaginaJS(){
		waitProcessPage();
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");
	}

	/**
	 * Espera o elemento estar clicavel na tela
	 * @param elemento
	 */
	public void esperaElementoSerClicavel(WebElement elemento){
		waitProcessPage();
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public void esperaElementoSerVisivel(WebElement element){
		waitProcessPage();
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Seleciona um item na lista através do Texto que está visivel na lista
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param textoVisivel Texto no qual o comando deve clicar
	 */
	public void selecionaItemLista(WebElement elemento, String textoVisivel){
		waitProcessPage();
		Select lista = new Select(elemento);
		lista.selectByVisibleText(textoVisivel);
	}

	/**
	 * Seleciona um item na lista através do Index
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param index Posição do elemento na lista
	 */
	public void selecionaItemLista(WebElement elemento, int index){
		waitProcessPage();
		Select lista = new Select(elemento);
		lista.selectByIndex(index);
	}

	/**
	 * Seleciona um item na lista através do Valor
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param value Atributo value da tag option
	 */
	public void selecionaItemListaPorValor(WebElement elemento, String value){
		waitProcessPage();
		Select lista = new Select(elemento);
		lista.selectByValue(value);
	}

	public boolean verificaElementoPresenteTela(WebElement webElement) {
		waitProcessPage();
		esperaElementoSerVisivel(webElement);
		return webElement.isDisplayed();
	}

	private ExpectedCondition<Boolean> waitProcess() {
		return driver -> {
			try {
				String js = "var reqAjax = typeof window.Ajax !== 'undefined' ?window.Ajax.activeRequestCount : 0;\n" +
						"var reqAngular = typeof angular !== 'undefined' ? angular.by(document.body).injector().get('$http').pendingRequests.length : 0;\n" +
						"var reqJquery = typeof jQuery !== 'undefined' ? jQuery.active : 0;\n" +
						"var reqDom = document.readyState;\n" +
						"\n" +
						"if (reqAjax === 0 && reqAngular === 0 & reqJquery === 0 && reqDom === 'complete') {\n" +
						" return 'complete';\n" +
						"}\n" +
						"else {\n" +
						" return 'process';\n" +
						"}";

				assert driver != null;
				return ((JavascriptExecutor) driver).executeScript(js).toString().equals("complete");
			} catch (Exception e) {
				return true;
			}
		};
	}

	/**
	 * Metodo que executo um comando do javascript para aguardar os elementos da pagina carregarem
	 */
	private void waitProcessPage(){
		WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 5);
		webDriverWait.until(waitProcess());
	}
}
