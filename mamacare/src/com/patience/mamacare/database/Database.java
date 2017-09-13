package com.patience.mamacare.database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.patience.mamacare.model.Woman;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//This class is for managing the application database
public class Database extends SQLiteOpenHelper{
	private static final String dbName ="mamacare";
private static final int dbversion = 1;
private static final String tableWoman = "woman";
private static final String tableWomanColumnId = "womanid";
private static final String tableWomanColumnfirstName = "first_name";
private static final String tableWomanColumnLastName = "last_name";
private static final String tableWomanColumnAge = "age";
private static final String tableWomanColumnAddress = "address";
//database statements to create the woman table,
private  static final String createTableWoman = "CREATE TABLE IN NOT EXISTS" + tableWoman+"(" +
       tableWomanColumnId + "TEXT," + tableWomanColumnLastName +" tableWomanColumnAge + " +
		"INTEGER," + tableWomanColumnAddress + "TEXT)";

		
	public Database(Context context) {
	super(context, dbName, null,dbversion);
		// TODO Auto-generated constructor stub
	}

	
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(createTableWoman);
	}


	public void onUpgrade(SQLiteDatabase db, int oldversion, int newVersion){
		// TODO Auto-generated method stub
		
	}
	public List<Woman> getWomen() {
	//DEFINING AN ARRAY WHERE EVERYTIME YOU CREATE IT PUTS IN AN ARRAY AND YOU HAVE TO RETRIEVE THE ARRAY
		
			List<Woman> womenList = new ArrayList<Woman>();
			//SQL query to select all the women from the DB
			String selectQuery = "SELECT* FROM " + tableWoman;
			SQLiteDatabase db = this.getReadableDatabase();
			Cursor cursor = db.rawQuery(selectQuery, null);
			//Read from the DB all the women rows
			if (cursor.moveToFirst()) {
				do {
					//Woman object had (id:int,firstName:string,lastName:string,age:int,address:string)
					Woman woman = new Woman(cursor.getInt(cursor.getColumnIndex(tableWomanColumnId)),
							cursor.getString(cursor.getColumnIndex(tableWomanColumnfirstName)),
							cursor.getString(cursor.getColumnIndex(tableWomanColumnLastName)),
							cursor.getInt(cursor.getColumnIndex(tableWomanColumnAge)),
							cursor.getString(cursor.getColumnIndex(tableWomanColumnAddress)));
					//add each woman retrieved from the database into my arrayList
					womenList.add(woman);
				} while (cursor.moveToNext());
			}
			//sort the women using the comparable method we defined in the women POJO i.e to begin with first name
			Collections.sort(womenList);
			//return the women list
			return womenList;
			
	}

	public void saveWoman(Woman woman) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(tableWomanColumnId, woman.getId());
		contentValues.put(tableWomanColumnfirstName, woman.getFirstName());
		contentValues.put(tableWomanColumnLastName, woman.getFirstName());	
		contentValues.put(tableWomanColumnAge, woman.getAge());
		contentValues.put(tableWomanColumnAddress, woman.getAddress());
		db.update(tableWoman,  contentValues,  null,  null);
		

	}


	public void deleteWoman(int id) {
		Woman woman = getWoman(id);
		//if you call a woman and you get a null, then you delete
		if(woman != null){
			SQLiteDatabase db = this.getWritableDatabase();
			db.delete(tableWoman, tableWomanColumnId + " = ?",
			new String[] { String.valueOf(id) });
		}
		
		}
		

	

	//to get a particular woman
	public Woman getWoman(int id) {
		SQLiteDatabase db = this.getReadableDatabase();
		String selectQuery = "SELECT* FROM " + tableWoman +"WHERE "
				+ tableWomanColumnId + " =" + id + "'";
		Cursor cursor = db.rawQuery(selectQuery,null);
		if (cursor != null && cursor.moveToFirst()) {
			Woman woman = new Woman(cursor.getInt(cursor.getColumnIndex(tableWomanColumnId)),
					cursor.getString(cursor.getColumnIndex(tableWomanColumnfirstName)),
					cursor.getString(cursor.getColumnIndex(tableWomanColumnLastName)),
					cursor.getInt(cursor.getColumnIndex(tableWomanColumnAge)),
					cursor.getString(cursor.getColumnIndex(tableWomanColumnAddress)));
			return woman;
		}
		return null;
	}


	public Woman editWoman(Woman woman) { 
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(tableWomanColumnId, woman.getId());
		contentValues.put(tableWomanColumnfirstName, woman.getFirstName());
		contentValues.put(tableWomanColumnLastName, woman.getFirstName());	
		contentValues.put(tableWomanColumnAge, woman.getAge());
		contentValues.put(tableWomanColumnAddress, woman.getAddress());
		db.update(tableWoman,  contentValues,  null,  null);
		
		return getWoman(woman.getId());
	}

}
