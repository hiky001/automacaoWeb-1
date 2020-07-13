package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComprasPage {

    public ComprasPage(WebDriver webDriver) {

        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//select[@id = 'product_attribute_16_5_4']")
    private WebElement selectProcessor;
    public WebElement getSelectProcessor() {
        return selectProcessor;
    }

    @FindBy(xpath = "//select[@id = 'product_attribute_16_5_4'] /child:: option [contains(text(), '2.2 GHz Intel Pentium Dual-Core E2200')]")
    private WebElement opcaoSelectProcessor2_2;
    public WebElement getOpcaoSelectProcessor2_2() {
        return opcaoSelectProcessor2_2;
    }

    @FindBy(xpath = "//select[@id = 'product_attribute_16_6_5']")
    private WebElement selectRam;
    public WebElement getSelectRam() {
        return selectRam;
    }

    @FindBy(xpath = "//select[@id = 'product_attribute_16_6_5']/ child:: option[contains(text(), '4GB')]")
    private WebElement opcaoSelectRam;
    public WebElement getOpcaoSelectRam() {
        return opcaoSelectRam;
    }

    @FindBy(xpath = "//*[text() = '320 GB ']")
    private WebElement radioHDD;
    public WebElement getRadioHDD() {
        return radioHDD;
    }

    @FindBy(xpath = "//*[text() = 'Ubuntu ']")
    private WebElement radioOS;
    public WebElement getRadioOS() {
        return radioOS;
    }

    @FindBy(xpath = "//input [@id = 'add-to-cart-button-16']")
    private WebElement botaoAddAoCarrinho;
    public WebElement getBotaoAddAoCarrinho() {
        return botaoAddAoCarrinho;
    }

    @FindBy(xpath = "//span[text()='Shopping cart']")
    private WebElement botaoShoppingCart;
    public WebElement getBotaoShoppingCart() {
        return botaoShoppingCart;
    }

    @FindBy(xpath = "//input [@id = 'termsofservice']")
    private WebElement checkBoxConcordoComTermos;
    public WebElement getCheckBoxConcordoComTermos() {
        return checkBoxConcordoComTermos;
    }

    @FindBy(xpath = "//button [@id = 'checkout']")
    private WebElement botaoCheckout;
    public WebElement getBotaoCheckout() {
        return botaoCheckout;
    }

    @FindBy(xpath = "//input [@id = 'BillingNewAddress_Company']")
    private WebElement campoCompany;
    public WebElement getCampoCompany() {
        return campoCompany;
    }

    @FindBy(xpath = "//select[@id = 'BillingNewAddress_StateProvinceId']")
    private WebElement selectListCountry;
    public WebElement getSelectListCountry() {
        return selectListCountry;
    }

    @FindBy(xpath = "//*[text() = 'Brazil']")
    private WebElement selecionaCountryBrazil;
    public WebElement getSelecionaCountryBrazil() {
        return selecionaCountryBrazil;
    }

    @FindBy(xpath = "//input[@id = 'BillingNewAddress_City']")
    private WebElement campoCity;
    public WebElement getCampoCity() {
        return campoCity;
    }

    @FindBy(xpath = "//input[@id = 'BillingNewAddress_Address1']")
    private WebElement campoAddressUm;
    public WebElement getCampoAddressUm() {
        return campoAddressUm;
    }

    @FindBy(xpath = "//input[@id = 'BillingNewAddress_Address2']")
    private WebElement campoAddressDois;
    public WebElement getCampoAddressDois() {
        return campoAddressDois;
    }

    @FindBy(xpath = "//input[@id = 'BillingNewAddress_ZipPostalCode']")
    private WebElement campoZipPostalCode;
    public WebElement getCampoZipPostalCode() {
        return campoZipPostalCode;
    }

    @FindBy(xpath = "//input[@id = 'BillingNewAddress_PhoneNumber']")
    private WebElement campoPhoneNumber;
    public WebElement getCampoPhoneNumber() {
        return campoPhoneNumber;
    }

    @FindBy(xpath = "//input[@id = 'BillingNewAddress_FaxNumber']")
    private WebElement campoFaxNumber;
    public WebElement getCampoFaxNumber() {
        return campoFaxNumber;
    }

    @FindBy(xpath = "//input[@title= 'Continue' and parent:: div[@id = 'billing-buttons-container']]")
    private WebElement botaoContinue;
    public WebElement getBotaoContinue() {
        return botaoContinue;
    }

    @FindBy(xpath = "//input[@type= 'button' and ancestor:: div[@id = 'shipping-method-buttons-container']]")
    private WebElement botaoContinuePassoTres;
    public WebElement getBotaoContinuePassoTres(){
        return botaoContinuePassoTres;
    }

    @FindBy(xpath = "//input[@id = 'PickUpInStore']")
    private WebElement checkBoxInStorePickup;
    public WebElement getCheckBoxInStorePickup() {
        return checkBoxInStorePickup;
    }

    @FindBy(xpath = "//input[@title= 'Continue' and ancestor:: div[@id = 'shipping-buttons-container']]")
    private WebElement botaoContinueDois;
    public WebElement getBotaoContinueDois() {
        return botaoContinueDois;
    }

    @FindBy(xpath = "//input[@id='paymentmethod_2']")
    private WebElement checkBoxCartaoCredito;
    public WebElement getCheckBoxCartaoCredito(){
        return checkBoxCartaoCredito;
    }

    @FindBy(xpath = "//input[@class = 'button-1 payment-method-next-step-button']")
    private WebElement botaoContinueTres;
    public WebElement getBotaoContinueTres(){
        return botaoContinueTres;
    }

    @FindBy(xpath = "//select[@id = 'CreditCardType']")
    private WebElement selectCreditCard;
    public WebElement getSelectCreditCard(){
        return selectCreditCard;
    }

    @FindBy(xpath = "//select[@id = 'CreditCardType']/ child:: option[contains(text(), 'Master card')]")
    private WebElement selectCreditCardMasterCard;
    public WebElement getSelectCreditCardMasterCard(){
        return selectCreditCardMasterCard;
    }

    @FindBy(xpath = "//input[@id = 'CardholderName']")
    private WebElement cardHolderName;
    public WebElement getCardHolderName(){
        return cardHolderName;
    }

    @FindBy(xpath = "//input[@id = 'CardNumber']")
    private WebElement cardNumber;
    public WebElement getCardNumber(){
        return cardNumber;
    }

    @FindBy(xpath = "//select[@id = 'ExpireMonth']")
    private WebElement expirationDateMesUm;
    public WebElement getExpirationDateMesUm(){
        return expirationDateMesUm;
    }

    @FindBy(xpath = "//select[@id = 'ExpireMonth']/ child:: option[contains(text(), '03')]")
    private WebElement expirationDateMes;
    public WebElement getExpirationDateMes(){
        return expirationDateMes;
    }

    @FindBy(xpath = "//select[@id = 'ExpireYear']")
    private WebElement expirationDateAnoUm;
    public WebElement getExpirationDateAnoUm(){
        return expirationDateAnoUm;
    }

    @FindBy(xpath = "//select[@id = 'ExpireYear']/ child:: option[contains(text(), '2022')]")
    private WebElement expirationDateAno;
    public WebElement getExpirationDateAno(){
        return expirationDateAno;
    }

    @FindBy(xpath = "//input[@id = 'CardCode']")
    private WebElement cardCode;
    public WebElement getCardCode(){
        return cardCode;
    }

    @FindBy(xpath = "//input[@type= 'button' and ancestor:: div[@id = 'payment-info-buttons-container']] ")
    private WebElement botaoContinueQuatro;
    public WebElement getBotaoContinueQuatro(){
        return botaoContinueQuatro;
    }

    //pode precisar rolar ate esse elemento para poder clicar nele
    @FindBy(xpath = "//input[@type= 'button' and ancestor:: div[@id = 'confirm-order-buttons-container']] ")
    private WebElement botaoContinueCinco;
    public WebElement getBotaoContinueCinco(){
        return botaoContinueCinco;
    }

    @FindBy(xpath = "//*[text() = 'Your order has been successfully processed!']")
    private WebElement mensagemConfirmacaoCompra;
    public WebElement getMensagemConfirmacaoCompra(){
        return mensagemConfirmacaoCompra;
    }
}
