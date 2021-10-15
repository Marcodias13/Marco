#language: pt
Funcionalidade: Tela de cadastro shopping

Como um usuário 
Gostaria de me cadastrar no site de compras
Para que eu possa ter acesso ao itens disponíveis

@ignore
Cenário: Deve acessar tela de login
Dado acesso o link de compras online
Quando clico no ícone de user
Então tela de login é exibida com sucesso


@ignore
Cenário: Deve preencher tela de login sem usuário cadastrado
Dado acesso o link de compras online
Quando clico no ícone de user
E informo o usuário "a@a"
E a senha "a"
E clico em sign in
Então sou notificado de que o nome e senha estão incorretos


Cenário: Deve criar nova conta
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
Então tela de login é exibida com sucesso

@ignore
Cenário: Não deve inserir uma conta sem nome
Dado que estou acessando a aplicação
Quando informo o usuário "a@a"
E a senha "a"
E seleciono entrar
Então visualizo a página inicial
Quando seleciono Contas
E seleciono Adicionar
E seleciono Salvar
Então sou notificar que o nome da conta é obrigatório

@ignore
Cenário: Não deve inserir uma conta com nome já existente
Dado que estou acessando a aplicação
Quando informo o usuário "a@a"
E a senha "a"
E seleciono entrar
Então visualizo a página inicial
Quando seleciono Contas
E seleciono Adicionar
E informo a conta "Conta de Teste"
E seleciono Salvar
Então sou notificado que já existe uma conta com esse nome