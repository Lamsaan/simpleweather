package com.simpleweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SimpleWeatherDB {

	/*
	 * name of database
	 * */
	public static final String DB_NAME="simple_weather";
	
	/*
	 * version of database
	 */
	public static final int VERSION=1;
	
	private static SimpleWeatherDB simpleWeatherDB;
	
	private SQLiteDatabase db;
	
	/*
	 * make the constructor private 
	 * */
	
	private SimpleWeatherDB(Context context){
		SimpleWeatherOpenHelpler dhHelpler = new SimpleWeatherOpenHelpler(context, BD_NAME, null, VERSION);
	}
	
}
