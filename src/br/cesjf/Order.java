package br.cesjf;

public class Order {
	private Integer productCount = 0;

	public void addProduct() {
		productCount++;		
	}

	public boolean isFilled() {
		return productCount > 0;
	}

}
