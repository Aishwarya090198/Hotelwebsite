package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.pom.LoginPage;

import BaseClass.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass
{
	public static WebDriver driver=com.Runner.Runner.driver;
	LoginPage lp=new LoginPage(driver);

@Given("^user launch the application$")
public void user_launch_the_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\installationprocess\\driver\\chromedriver.exe");
	Get("http://adactinhotelapp.com/");
	 String title = driver.getTitle();
	 System.out.println("User is on : "+title);

    throw new PendingException();
}

@When("^user enter the valid username$")
public void user_enter_the_valid_username() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the valid password$")
public void user_enter_the_valid_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user validate the username and password$")
public void user_validate_the_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^user is on the search hotel page$")
public void user_is_on_the_search_hotel_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select a location from the list$")
public void user_select_a_location_from_the_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select a hotel from the list$")
public void user_select_a_hotel_from_the_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select the room type$")
public void user_select_the_room_type() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select number of rooms$")
public void user_select_number_of_rooms() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the valid check in date$")
public void user_enter_the_valid_check_in_date() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the valid check out date$")
public void user_enter_the_valid_check_out_date() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select adults count$")
public void user_select_adults_count() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select children count$")
public void user_select_children_count() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user can able to search hotel$")
public void user_can_able_to_search_hotel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^user is on the select hotel page$")
public void user_is_on_the_select_hotel_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select one available hotel from the list$")
public void user_select_one_available_hotel_from_the_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user can able to continue the booking process$")
public void user_can_able_to_continue_the_booking_process() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^user is on the book hotel page$")
public void user_is_on_the_book_hotel_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the valid first name$")
public void user_enter_the_valid_first_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the valid last name$")
public void user_enter_the_valid_last_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the proper billing address$")
public void user_enter_the_proper_billing_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the valid credit card number$")
public void user_enter_the_valid_credit_card_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select the credit card type from the list$")
public void user_select_the_credit_card_type_from_the_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user select the card expiry month and year$")
public void user_select_the_card_expiry_month_and_year() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter the valid CVV number$")
public void user_enter_the_valid_CVV_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user can able to book the hotel$")
public void user_can_able_to_book_the_hotel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^user is on the confirmation page$")
public void user_is_on_the_confirmation_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user can able to logout the application$")
public void user_can_able_to_logout_the_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}
