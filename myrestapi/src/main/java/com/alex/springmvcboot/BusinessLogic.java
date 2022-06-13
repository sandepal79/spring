package com.alex.springmvcboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogic {

	@Autowired
	Smartphone smph;
	List<Smartphone> phoneList = new ArrayList<>();
		
	public BusinessLogic() {
		phoneList.add(new Smartphone("apple","iphone","12 pro","12MB", "256GB", 1000, "USD"));
		phoneList.add(new Smartphone("apple","iphone","12 pro max","12MB", "256GB", 1200, "USD"));
		phoneList.add(new Smartphone("apple","iphone","12 pro max","12MB", "512GB", 1500, "USD"));
		phoneList.add(new Smartphone("apple","iphone","13 pro","14MB", "256GB", 1800, "USD"));
		phoneList.add(new Smartphone("apple","iphone","13 pro max","14MB", "512GB", 2500, "USD"));
		phoneList.add(new Smartphone("apple","iphone","13 pro max","14MB", "256GB", 2100, "USD"));
		phoneList.add(new Smartphone("apple","iphone","11 pro max","10MB", "256GB", 900, "USD"));
		
	}
	
	public List<Smartphone> getAll(){
		return phoneList;
	}
	
	public Smartphone getOne(){
		return phoneList.get(0);
	}
	
	public void addItem(Smartphone smp){
		phoneList.add(new Smartphone(smp.getCompany(), 
				smp.getVariant(),
				smp.getModel(),
				smp.getCamerapix(),
				smp.getStorage(),
				smp.getPriceValue(),
				smp.getPriceCurrency()));
	}
	
	
}
