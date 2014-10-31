package br.cesjf;

import org.jbehave.scenario.Scenario;

public class OrderFilledTest extends Scenario {
	
	public OrderFilledTest() {
		addSteps(
			new AvailableStock(),
			new OrderFilledWithSuccess()
		);
	}

}
