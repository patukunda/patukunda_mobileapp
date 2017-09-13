package com.patience.mamacare.Dao;

import java.util.List;

import android.content.Context;

import com.patience.mamacare.database.Database;
import com.patience.mamacare.model.Woman;

public class WomanDaoImpl implements WomanDao {
private Database database;
public WomanDaoImpl(Context context){
	database = new Database(context);
}
	public List<Woman> getWomen() {
		// TODO Auto-generated method stub
		return database.getWomen();
	}

	@Override
	public void saveWoman(Woman woman) {
		database.saveWoman(woman);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteWoman( int id) {
		database.deleteWoman(id);
		// TODO Auto-generated method stub

	}

	@Override
	public Woman getWoman(int id) {
		return database.getWoman(id);
		
		
	}

	@Override
	public Woman editWoman(Woman woman) {
		return database.editWoman(woman);
		
	}

}
