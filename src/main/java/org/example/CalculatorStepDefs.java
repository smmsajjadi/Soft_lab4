package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDefs {
    private double operand1;
    private double operand2;
    private String operation;
    private double result;

    @Given("the first operand is {double}")
    public void the_first_operand_is(double op1) {
        this.operand1 = op1;
    }

    @Given("the second operand is {double}")
    public void the_second_operand_is(double op2) {
        this.operand2 = op2;
    }

    @When("I perform {string}")
    public void i_perform(String operation) {
        this.operation = operation;
        switch (operation) {
            case "add":
                result = operand1 + operand2;
                break;
            case "subtract":
                result = operand1 - operand2;
                break;
            case "multiply":
                result = operand1 * operand2;
                break;
            case "divide":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                break;
            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
    }

    @Then("the result should be {double}")
    public void the_result_should_be(double expectedResult) {
        assertEquals(expectedResult, result, 0.001);
    }
}
