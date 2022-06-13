package com.alex.springmvcboot;

public class Price {
	
	private int priceValue; // 1000
	private String priceCurrency; // USD
	
	
	public Price(int priceValue, String priceCurrency) {
		
		this.priceValue = priceValue;
		this.priceCurrency = priceCurrency;
	}
	
	public int getPriceValue() {
		return priceValue;
	}
	public void setPriceValue(int priceValue) {
		this.priceValue = priceValue;
	}
	public String getPriceCurrency() {
		return priceCurrency;
	}
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}
	
	
}
