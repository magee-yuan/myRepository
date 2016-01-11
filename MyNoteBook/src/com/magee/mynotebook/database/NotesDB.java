package com.magee.mynotebook.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NotesDB extends SQLiteOpenHelper{
	
	//���ݿ�ı���
	public static final String TABLE_NAME="notes";
	//���ݿ������
	public static final String CONTENT="content";
	//���ݿ��id
	public static final String ID="_id";
	//���ݿ��¼�����ʱ��
	public static final String TIME="time";
	//���ݿ����ͼƬ�ֶ�
	public static final String PATH="path";
	//���ݿ������Ƶ�ֶ�
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
