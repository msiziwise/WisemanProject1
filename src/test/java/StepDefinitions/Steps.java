package StepDefinitions;

import Utils.SnapShot;
import io.cucumber.java.en.*;
import org.testng.annotations.Test;

public class Steps extends Base{

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

    }
    @And("^user enter username (.*)$")
    public void user_enter_usename(String username) {
      login.username(username);
    }
    @And("^user enters password (.*)$")
    public void user_enters_password(String password) {
       login.password(password);
    }
    @Then("user click on login button")
    public void user_click_on_login_button() {
        login.btnlogin();
    }
}
