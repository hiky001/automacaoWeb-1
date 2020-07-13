#language: pt
#encoding: UTF-8
#author: henrique.silva
#date: 12/07/2020
#version: 1.0.0

@web @cadastro
Funcionalidade: Realizar cadastro no site

  Cenario: Realizar o cadastro com sucesso de um cliente válido
    Dado que clico no botao "Register"
    Quando realizo o cadastro do cliente
    Entao visualizo a mensagem "Your registration completed" na tela