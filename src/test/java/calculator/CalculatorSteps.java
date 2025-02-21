package calculator;

import io.cucumber.java.en.*;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.enterNumbers(arg0, arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        this.checkRes(arg0);
    }

    @When("I multiply {int} and {int}")
    public void iMultiplyAnd(int arg0, int arg1) {
        this.enterNumbers(arg0, arg1);
    }

    @Then("the multiplication should be {int}")
    public void theMultiplicationShouldBe(int arg0) {
        this.calculator.mul();
        this.checkRes(arg0);
    }

    @When("I divide {int} and {int}")
    public void iDivideArgAndArg(int arg0, int arg1) {
        this.enterNumbers(arg0, arg1);
    }

    @Then("the division should be {int}")
    public void theDivisionShouldBeRes(int arg0) {
        this.calculator.div();
        this.checkRes(arg0);
    }

    private void enterNumbers(int n1, int n2) {
        this.calculator.enter(n1);
        this.calculator.enter(n2);
    }

    private void checkRes(int res) {
        if (res != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }

    @Then("the division should not be permitted")
    public void theDivisionShouldNotBePermitted() {
        try {
            this.calculator.div();
            throw new IllegalStateException("An ArithmeticException should have been thrown");
        } catch (final ArithmeticException e) {
        }
    }
}
