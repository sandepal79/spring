package com.alex.springmvcboot;

import org.springframework.stereotype.Component;


@Component
public class Smartphone {
	
	private String company; // apple
	private String variant; // iphone
	private String model; // 12 pro
	private String camerapix; // 12MB
	private String storage; // 256GB
	private int priceValue; // 1000
	private String priceCurrency; // USD
	
	public Smartphone() {
				
	}



	
	public Smartphone(String company, String variant, String model, String camerapix, String storage, int priceValue,
			String priceCurrency) {
		
		this.company = company;
		this.variant = variant;
		this.model = model;
		this.camerapix = camerapix;
		this.storage = storage;
		this.priceValue = priceValue;
		this.priceCurrency = priceCurrency;
	}




	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCamerapix() {
		return camerapix;
	}
	public void setCamerapix(String camerapix) {
		this.camerapix = camerapix;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
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
