package StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.tools.ant.helper.DefaultExecutor;
import sun.tools.jar.CommandLine;

import java.io.File;

public class StepDefs {
	private static int count;
	public static String answer;
	public static String size;


	@Given("^I have launched the app$")
	public void i_have_launched_the_app() throws Throwable {
		Runtime.getRuntime().exec("java -jar Sandeliukas.jar",null, new File("C:\\Users\\IBM_ADMIN\\Sandeliukas\\out\\artifacts\\Sandeliukas_jar"));

	}


	@Given("^the count of eggs is positive$")
	public void the_count_of_eggs_is_positive() throws Throwable {
		count = 10;

	}

	@When("^I pick the option \"([^\"]*)\" to buy eggs$")
	public void i_pick_the_option_to_buy_eggs(String arg1) throws Throwable {
		answer = "Y";
	}

	@When("^I provide the number of eggs equal to '(\\d+)'$")
	public void i_provide_the_number_of_eggs_equal_to(int arg1) throws Throwable {

	}

	@When("^I provide the size of eggs equal to \"([^\"]*)\"$")
	public void i_provide_the_size_of_eggs_equal_to(String arg1) throws Throwable {

	}

	@When("^I pick the delivery date as \"([^\"]*)\"$")
	public void i_pick_the_delivery_date_as(String arg1) throws Throwable {

	}

	@Then("^I see the confirmation that my order has been executed successfully$")
	public void i_see_the_confirmation_that_my_order_has_been_executed_successfully() throws Throwable {

	}

}
