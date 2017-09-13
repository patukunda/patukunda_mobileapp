package com.patience.mamacare.service;

import java.util.List;

import android.content.Context;

import com.patience.mamacare.Dao.WomanDao;
import com.patience.mamacare.Dao.WomanDaoImpl;
import com.patience.mamacare.model.Woman;
//this class is for saving a woman
public class WomanServiceImpl implements WomanService {
	 private Context context;
	 
	public WomanServiceImpl(Context context) {
		this.context = context;
	}
	
//calling the Dao in the service
	private WomanDao womanDao = new WomanDaoImpl(context);
	
	@Override
	public List<Woman> getWomen() {
		// TODO Auto-generated method stub
		return womanDao.getWomen();
	}

	@Override
	public void saveWoman(Woman woman) {
		// TODO Auto-generated method stub
		womanDao.saveWoman(woman);

	}

	@Override
	public void deleteWoman(int id) {
		womanDao.deleteWoman(id);
		// TODO Auto-generated method stu

	}

	//@Override
	//public Woman getWoman(int id) {
	//	return womanDao.editWoman(woman);
		// TODO Auto-generated method stub
	
	

	@Override
	public Woman editWoman(Woman woman) {
		// TODO Auto-generated method stub
		return womanDao.editWoman(woman);
	}

	@Override
	public Woman getWoman(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
