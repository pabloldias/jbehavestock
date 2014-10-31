package br.cesjf;

public class Stock {
	
	private Integer count = 10;
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;		
	}

	public Boolean hasAvailability(Integer availableCount) {
		return availableCount < this.count;
	}

}
