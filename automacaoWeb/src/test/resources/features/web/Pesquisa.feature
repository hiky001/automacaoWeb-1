#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 12/07/2020
#version: 1.0.0

@web @pesquisa
Funcionalidade: Realizar pesquisa no site

  Cenario: Realizar uma pesquisa válida no site
    Dado que escrevo no campo de pesquisa
    Quando clico no botao de busca
    Entao visualizo o item pesquisado
