package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class RegisterSteps {
    @Given("I open website")
    public void openWebsite() {
        System.out.println("I open website step ");
    }
    @When("I open Register page")
    public void i_open_register_page() {
        System.out.println("i open register page step");
    }
    @When("I fill in first name text box with value {string}")
    public void i_fill_in_first_name_text_box_with_value(String firstName) {
        System.out.println(" step i_fill_in_first_name_text_box_with_value_step "+ firstName);
    }
    @When("I fill in last name text box with value {string}")
    public void i_fill_in_last_name_text_box_with_value(String lastName) {
        System.out.println("step i_fill_in_last_name_text_box_with_value "+lastName);
    }
    @When("I fill in Password text box with value {string}")
    public void i_fill_in_password_text_box_with_value(String passWord) {
        System.out.println("i_fill_in_last_name_text_box_with_value "+passWord);
    }
    @When("I fill in Confirm Password text box with value {string}")
    public void i_fill_in_confirm_password_text_box_with_value(String confirmPassWord) {
        System.out.println(" step i_fill_in_last_name_text_box_with_value "+confirmPassWord);
    }
    @When("I fill in email text box")
    public void i_fill_in_email_text_box() {
        System.out.println("I fill in email text box step");
    }
    @When("I fill in company name text box")
    public void i_fill_in_company_name_text_box(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> dataMap = dataTable.asMaps();
        System.out.println(dataMap.get(0).get("companyName"));
    }

}
