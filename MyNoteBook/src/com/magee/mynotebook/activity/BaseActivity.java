package com.magee.mynotebook.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;

import com.magee.mynotebook.manager.ActivityCollector;
import com.magee.mynotebook.utils.MyConfirmDialog;


/**
 * 所有Activity的粑粑，管好你那堆儿子
 * @author Megoo
 *
 */
public class BaseActivity extends FragmentActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Log.d("BaseActivity", getClass().getSimpleName());
		
		ActivityCollector.addActivity(this);
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		ActivityCollector.removeActivity(this);
		
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		MyConfirmDialog.finishActivities(this);
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}  

}
