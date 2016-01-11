package com.magee.mynotebook.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NotesDB extends SQLiteOpenHelper{
	
	//数据库的表名
	public static final String TABLE_NAME="notes";
	//数据库的内容
	public static final String CONTENT="content";
	//数据库的id
	public static final String ID="_id";
	//数据库记录插入的时间
	public static final String TIME="time";
	//数据库插入图片字段
	public static final String PATH="path";
	//数据库插入视频字段
	public static final String VIDEO="video";
	public NotesDB(Context context) {
		super(context, "notes", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE "+TABLE_NAME+"("
				+ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
				+CONTENT+" TEXT NOT NULL,"
				+PATH+" TEXT NOT NULL,"
				+VIDEO+" TEXT NOT NULL,"
				+TIME+" TEXT NOT NULL"
				);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}

}
