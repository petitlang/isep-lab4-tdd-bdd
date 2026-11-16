package com.isep.lab4.steps;

import com.isep.lab4.RomanNumerals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Cucumber creates a new instance for each scenario, keeping state isolated. */
public class RomanNumeralSteps {
    private RomanNumerals converter;
    private String result;

    @Given("a Roman numeral converter")
    public void aRomanNumeralConverter() {
        converter = new RomanNumerals();
    }

    @When("I convert {int}")
    public void iConvert(int number) {
        result = converter.convert(number);
    }

    @Then("the Roman numeral should be {string}")
    public void theRomanNumeralShouldBe(String expected) {
        assertEquals(expected, result);
    }
}
