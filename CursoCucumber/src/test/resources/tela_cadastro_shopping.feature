#language: pt
Funcionalidade: Tela de cadastro shopping

Como um usuário 
Gostaria de me cadastrar no site de compras
Para que eu possa ter acesso ao itens disponíveis

@ignore
Cenário: Deve acessar tela de login --OK
Dado acesso o link de compras online
Quando clico no ícone de user
Então tela de login é exibida com sucesso

@ignore
Cenário: Deve preencher tela de login sem usuário cadastrado --OK
Dado acesso o link de compras online
Quando clico no ícone de user
E informo o usuário "a@a"
E a senha "a"
E clico em sign in
Então sou notificado de que o nome e senha estão incorretos

@ignore
Cenário: Deve preencher os dados na tela de cadastro  --OK
Dado acesso o link de compras online
Quando clico no ícone de user
E clico em criar nova conta
E preencho Username "marco"
E preencho email "marcodias13@hotmail.com"
E preencho password "Marco14"
E preencho confirm password "Marco14"
E preencho first name "Marco"
E preencho last name "Dias"
E preencho phone number "5555-5555"
E preencho country "Brazil"
E preencho city "São Paulo"
E preencho adress "Rua teste, 555"
E preencho state "SP"
E preencho postal code "00000-000"
E aceito os termos de condições de uso e privacidade
Então botão para registrar conta é exibido com sucesso

@ignore
Cenário: Deve preencher os dados na tela de cadastro e criar nova conta --OK
Dado acesso o link de compras online
Quando clico no ícone de user
E clico em criar nova conta
E preencho Username "testemarco1"
E preencho email "testemarco1@teste.com"
E preencho password "Testemarco1"
E preencho confirm password "Testemarco1"
E preencho first name "TesteM"
E preencho last name "Teste"
E preencho phone number "5555-5555"
E preencho country "Brazil"
E preencho city "São Paulo"
E preencho adress "Rua teste, 555"
E preencho state "SP"
E preencho postal code "00000-000"
E aceito os termos de condições de uso e privacidade
E clico no botão para registrar conta
Então conta logada com sucesso

@ignore
Cenário: Deve logar com sucesso --OK
Dado acesso o link de compras online
Quando clico no ícone de user
E informo o usuário "testemarco1"
E a senha "Testemarco1"
E clico em sign in
Então conta logada com sucesso

@ignore
Cenário: Deve logar e consultar produto --OK
Dado acesso o link de compras online
Quando clico no ícone de user
E informo o usuário "testemarco1"
E a senha "Testemarco1"
E clico em sign in
E clico em algum produto
Então opção de compra é exibida com sucesso
