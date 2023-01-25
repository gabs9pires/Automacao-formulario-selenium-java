package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {
    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By senha = By.id("password");
    private By select_day_filled = By.id("days");
    private By select_months_filled = By.id("months");
    private By select_year_filled = By.id("years");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By address = By.id("address1");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobile_number = By.id("mobile_number");
    private By btn_create_account = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");
    private By msg_create_account_succeed = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");

    public void selectTitle(Integer type){
        if (type ==1){
            getDriver().findElement(titleM).click();
        } else if (type ==2) {
            getDriver().findElement(titleF).click();
        }
    }

    public void fillPassword(String password){
        getDriver().findElement(senha).sendKeys(password);
    }

    public void selectBirthday(Integer day, Integer month, String year){
        Select select_day = new Select(getDriver().findElement(select_day_filled));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_months_filled));
        select_month.selectByIndex(month);

        Select select_year = new Select(getDriver().findElement(select_year_filled));
        select_year.selectByValue(year);
    }

    public void fillFirstName(String name){
        getDriver().findElement(firstName).sendKeys(name);
    }
    public void fillLastName(String last_name){
        getDriver().findElement(lastName).sendKeys(last_name);
    }
    public void fillLocation(String fill_address, String fill_country, String fill_state, String fill_city, String fill_zipcode){
        getDriver().findElement(address).sendKeys(fill_address);

        Select filled_country = new Select(getDriver().findElement(country));
        filled_country.selectByValue(fill_country);

        getDriver().findElement(state).sendKeys(fill_state);
        getDriver().findElement(city).sendKeys(fill_city);
        getDriver().findElement(zipcode).sendKeys(fill_zipcode);
    }

    public void fillPhoneNumber(String fill_number){
        getDriver().findElement(mobile_number).sendKeys(fill_number);
    }

    public void createAccount(){
        getDriver().findElement(btn_create_account).click();
    }
    public void msgCreateAccount_succeed(){
        Utils.waitElementBePresent(msg_create_account_succeed, 10);
    }
}
