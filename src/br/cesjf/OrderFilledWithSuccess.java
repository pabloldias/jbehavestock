package br.cesjf;

import static org.jbehave.Ensure.ensureThat;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

public class OrderFilledWithSuccess extends Steps {
	Stock stock = new Stock();
	Order order = new Order();
	Boolean available = false;
	
	@Given("Stock has $count products")
	public void fillStock(Integer count) {
	   stock.setCount(count);
	}

	@When("I fill out an order with $count products")
	public void addProducts(Integer count) {
		if (stock.hasAvailability(count)) {
			for (int i = 1; i <= count; i++) {
				order.addProduct();
			}
			stock.setCount(stock.getCount() - count);
		}
	}

	@Then("Order filling status must be returned as \"true\"")
	public void isAvailable() {
	  ensureThat(order.isFilled());
	}
}
