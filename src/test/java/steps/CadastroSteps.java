package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();
    @Quando("^eu preencho o formulario de cadastro com informacoes validas$")
    public void eu_preencho_o_formulario_de_cadastro_com_informacoes_validas() {
        cadastroPage.selectTitle(2);
        cadastroPage.fillPassword("12345");
        cadastroPage.selectBirthday(28, 07, "1999");
        cadastroPage.fillFirstName("aluno");
        cadastroPage.fillLastName("2023");
        cadastroPage.fillLocation("st. martins 3455", "Canada", "Columbia", "Vitoria", "12579087");
        cadastroPage.fillPhoneNumber("56798203");
    }

    @E("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.createAccount();
    }

    @Entao("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroPage.msgCreateAccount_succeed();
    }
}
