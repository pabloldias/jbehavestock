package br.cesjf;

import static org.jbehave.Ensure.ensureThat;
import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

public class AvailableStock extends Steps {
	Stock stock = new Stock();
	Boolean available = false;
	
	@Given("Stock has $count products")
	public void fillStock(Integer count) {
	   stock.setCount(count);
	}

	@When("There's availability to sell $count products")
	public void verifyAvailability(Integer count) {
		available = stock.hasAvailability(count);
	}

	@Then("Must return \"true\"")
	public void isAvailable() {
	  ensureThat(available);
	}
}