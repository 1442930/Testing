package com.example.FirstTest.Steps;

import com.example.FirstTest.FirstTestApplication;
import com.example.FirstTest.page.google.FlightsPage;
import com.example.FirstTest.page.google.SearchComponent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@CucumberContextConfiguration
@SpringBootTest(classes = FirstTestApplication.class)
public class GoogleSteps {

    @Autowired
    private FlightsPage flightsPage;

    @Autowired
    private SearchComponent searchComponent;

    @Given("I am on the google flight site")
    public void launchSite() throws InterruptedException {
        //System.out.println(flightsPage);
        this.flightsPage.goTo();
        Thread.sleep(1000);
    }

    @When("I enter my {string} as a keyword")
    public void enterKeyword(String keyword) throws InterruptedException {
        searchComponent.search(keyword);
        Thread.sleep(10000);
    }

    @Then("I should see search results page")
    public void verifyResults() {

    }

}
