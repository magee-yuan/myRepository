package com.magee.mynotebook.activity;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.magee.mynotebook.database.NotesDB;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.VideoView;

public class AddContent extends BaseActivity implements OnClickListener {

	// 接受Intent传过来的数据
	private String value;

	private Button savebtn, cancelbtn;
	private ImageView c_img;
	private VideoView c_video;
	private EditText editText;

	// 添加数据库对象
	private NotesDB notesDB;
	private SQLiteDatabase dbWriter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addcontent);
		value = getIntent().getStringExtra("flag");
		initView();

		initDB();
	}

	private void initDB() {
		notesDB = new NotesDB(this);
		dbWriter = notesDB.getWritableDatabase();
	}

	private void initView() {
		savebtn = (Button) findViewById(R.id.save);
		cancelbtn = (Button) findViewById(R.id.cancel);
		c_img = (ImageView) findViewById(R.id.c_img);
		c_video = (VideoView) findViewById(R.id.c_video);
		editText = (EditText) findViewById(R.id.c_edit);

		savebtn.setOnClickListener(this);
		cancelbtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.save:
			// 当我们点击保存时候要添加数据库，然后把当前的Activity关闭掉
			addDB();
			finish();
			break;
		case R.id.cancel:
			finish();
			break;
		default:
			break;
		}
	}

	// 数据库添加数据的方法
	public void addDB() {
		ContentValues cv = new ContentValues();
		// 添加内容，从EditText中获取
		cv.put(NotesDB.CONTENT, editText.getText().toString());
		// 添加时间
		cv.put(NotesDB.TIME, getTime());

		// 把这 两个内容插入到数据当中
		dbWriter.insert(NotesDB.TABLE_NAME, null, cv);
	}

	// 获取系统时间的方法
	private String getTime() {
		// 制定时间所显示的格式
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
		// 获取时间
		Date date = new Date();
		String str = format.format(date);
		return str;
	}
}
