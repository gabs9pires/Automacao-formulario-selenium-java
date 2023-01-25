package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();
    @Dado("^que estou na pagina de login$")
    public void que_estou_na_pagina_de_login() {
        //getDriver(Browser.CHROME);
        getDriver(Browser.FIREFOX);
        loginPage.AcessarTelaLogin();
    }

    @E("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario()  {
        loginPage.preencherNome();
        loginPage.preencherEmail();
        loginPage.tocarBotaoSignup();
    }
}
