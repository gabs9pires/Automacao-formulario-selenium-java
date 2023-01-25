package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    private By name_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By email_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By signup_button = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    public void AcessarTelaLogin(){
        getDriver().get("https://automationexercise.com/login");
        Utils.waitElementBePresent(name_field, 100);
    }

    public void preencherNome(){
        getDriver().findElement(name_field).sendKeys("aluno2023");
    }

    public void preencherEmail(){
        getDriver().findElement(email_field).sendKeys(Utils.emailGenerator());
    }

    public void tocarBotaoSignup(){
        getDriver().findElement(signup_button).click();
    }
}
