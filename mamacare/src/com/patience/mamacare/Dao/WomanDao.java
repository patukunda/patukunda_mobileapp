package com.patience.mamacare.Dao;

import java.util.List;

import com.patience.mamacare.model.Woman;

public interface WomanDao {

	// this is a method for listing women
	public List<Woman> getWomen();

	// this method is for saving woman
	public void saveWoman(Woman woman);

	// deleting woman
	public void deleteWoman(int id);

	// retrieving woman
	public Woman getWoman(int id);

	// edit woman
	public Woman editWoman(Woman woman);
}
