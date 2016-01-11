package com.magee.mynotebook.activity;

import com.magee.mynotebook.adapter.MyAdapter;
import com.magee.mynotebook.customview.MyDrawerLayout;
import com.magee.mynotebook.customview.MyListView;
import com.magee.mynotebook.customview.MyTextView;
import com.magee.mynotebook.database.NotesDB;
import com.magee.mynotebook.utils.MyConfirmDialog;

import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseActivity  {

	private static final String TAG = "AAAA";
	private ActionBarDrawerToggle mDrawerToggle;
	private MyDrawerLayout mDrawerLayout;
	private LinearLayout insertText, insertImage, insertVideo, setting, exit;
	private LinearLayout layout;
	private MyListView lv;

	private MyAdapter adapter;
	private NotesDB notesDB;
	private SQLiteDatabase dbReader;

	private String mTitle;
	
	//抽屉是否打开
	private Boolean isDrawerOpen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initDrawerToggle();
	}

	private void initDrawerToggle() {
		/**
		 * 第一个参数：传入当前的activity 所以传入MainActivity.this 第二个参数：传入一个DrawerLayout对象
		 * 第三个参数：传入DrawerImage资源，就是应用左上角的图标
		 * 第四个和第五个参数：打开和关闭时的内容描述的资源，所以在strings.xml文件中添加了两个string标签
		 */
		mDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,
				mDrawerLayout, R.drawable.on, R.string.drawer_open,
				R.string.drawer_close) {
			@Override
			public void onDrawerOpened(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerOpened(drawerView);
				getActionBar().setTitle("请选择");
				isDrawerOpen=true;
			}

			@Override
			public void onDrawerClosed(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerClosed(drawerView);
				getActionBar().setTitle(mTitle);
				isDrawerOpen=false;
			}

		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);

		// 开始AcitonBar上的APP ICON功能
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// 需要将ActionDrawertoggle与DrawerLayout的状态同步
		// 将ActionBardrawertoggle中的drawer图标，设置为ActionBar中的Home-Button的ICON

		// 这个是ActionBardrawertoggle和DrawerLayout实现同步的方法
		mDrawerToggle.syncState();
	}

	private void initView() {
		mDrawerLayout = (MyDrawerLayout) findViewById(R.id.drawer_layout);
		lv = (MyListView) findViewById(R.id.left_list);
		insertText = (LinearLayout) findViewById(R.id.insert_text);
		insertImage = (LinearLayout) findViewById(R.id.insert_img);
		insertVideo = (LinearLayout) findViewById(R.id.insert_video);
		setting = (LinearLayout) findViewById(R.id.setting);
		layout = (LinearLayout) findViewById(R.id.layout);
		exit = (LinearLayout) findViewById(R.id.exit);
		mTitle = (String) getTitle();

		insertText.setOnClickListener(this);
		insertImage.setOnClickListener(this);
		insertVideo.setOnClickListener(this);
		setting.setOnClickListener(this);
		exit.setOnClickListener(this);
		layout.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				
					Toast.makeText(MainActivity.this, "我吐 我吐  我吐吐 吐", Toast.LENGTH_LONG).show();
				
				
				return true;
			}
		});

		// notesDB = new NotesDB(this);
		// dbReader = notesDB.getReadableDatabase();

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.insert_text:

			break;

		case R.id.insert_img:

			break;
		case R.id.insert_video:

			break;
		case R.id.setting:

			break;
		case R.id.exit:
			System.out
					.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			MyConfirmDialog.finishActivities(this);
			Toast.makeText(this, "我TM终于被点击了！", Toast.LENGTH_LONG).show();
			break;
		case R.id.layout:
			Toast.makeText(this, "我TM终于被点击了！", Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}
		mDrawerLayout.closeDrawer(layout);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// 将actionbar上的图标与drawerlayout结合起来
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	// @Override
	// public boolean dispatchTouchEvent(MotionEvent ev) {
	// // TODO Auto-generated method stub
	// Log.i(TAG, "MainActivity==>dispatchTouchEvent");
	// return super.dispatchTouchEvent(ev);
	// }
	//
	// @Override
	// public boolean onTouchEvent(MotionEvent event) {
	// // TODO Auto-generated method stub
	// Log.i(TAG, "MainActivity==>onTouchEvent");
	// return super.onTouchEvent(event);
	// }

	// public void selectDB() {
	// Cursor cursor = dbReader.query(NotesDB.TABLE_NAME, null, null, null,
	// null, null, null);
	// adapter=new MyAdapter(this, cursor);
	// lv.setAdapter(adapter);
	// }
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		// selectDB();
	}
}
