#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 12/07/2020
#version: 1.0.0

@web @compra
Funcionalidade: Realizar uma compra no site

  Cenario: Realizar uma comprar com cartao de credito no site
    Dado que acesso a tela de login com o usuário logado
    E clico no produto
    Quando preencho as configurações do produto
    E completo os dados de confirmação de compras
    Entao visualizo a mensagem "Your order has been successfully processed!"
