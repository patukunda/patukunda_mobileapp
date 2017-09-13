package com.patience.mamacare.service;

import java.util.List;

import com.patience.mamacare.model.Woman;

//This interface is responsible for managing the woman POJO
public interface WomanService {
	
//this is a method for listing women
	public List<Woman> getWomen();
	//this method is for saving woman
	public void saveWoman(Woman woman);
	//deleting woman
	public void deleteWoman(int id);
	//retrieving woman
	public Woman getWoman(int id);
	//edit woman
	public Woman editWoman(Woman woman);
}
