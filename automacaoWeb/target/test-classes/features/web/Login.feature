#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 12/07/2020
#version: 1.0.0

@web @login
Funcionalidade: Validar Login da aplicação

  Cenario: Realizar login na aplicação com usuário cadastrado
    Dado que clico no botao "Log in"
    E preencho os dados de login com usuário "cadastrado"
    Quando clico em Log in
    Entao visualizo a tela inicial com meu usuario logado
