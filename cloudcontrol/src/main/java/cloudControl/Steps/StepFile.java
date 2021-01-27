package cloudControl.Steps;

import cloudControl.Pages.ExecutionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class StepFile {

    ExecutionPage executionPage=new ExecutionPage();

        @Given("the user is in the cloud control page")
        public void the_user_is_in_the_cloud_control_page() {
            // Write code here that turns the phrase above into concrete actions

        }

        @Given("the user chooses the Environment {string}")
        public void the_user_chooses_the_environment(String string) {
            // Write code here that turns the phrase above into concrete actions
            executionPage.selectServer(string);


        }

        @Given("the user searches for the App Names without versions")
        public void the_user_searches_for_the_app_names_without_versions() throws IOException {
            // Write code here that turns the phrase above into concrete actions
            executionPage.checkNullIp();

        }

        @Then("the App Names are filtered out")
        public void the_app_names_are_filtered_out() {
            // Write code here that turns the phrase above into concrete actions

        }



}
