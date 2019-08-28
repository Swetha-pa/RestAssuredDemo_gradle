package steps;

import cucumber.api.java.en.Given;

public class MyStepdefs {

    @Given("^Execute api$")
    public void executeApi() {
        System.out.println("Hi");
    }
}
