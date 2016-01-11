package com.magee.mynotebook.customview;

import com.magee.mynotebook.utils.TouchEventUtil;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class MyDrawerLayout extends DrawerLayout {

	private static final String TAG = "AAAA";

	public MyDrawerLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public MyDrawerLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyDrawerLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		Log.i(TAG,
				"MyDrawerLayout==>dispatchTouchEvent==>"
						+ TouchEventUtil.getTouchAction(ev.getAction())
						+ "==>父类默认返回值" + super.dispatchTouchEvent(ev));
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		// TODO Auto-generated method stub
		Log.i(TAG,
				"MyDrawerLayout==>onInterceptTouchEvent==>"
						+ TouchEventUtil.getTouchAction(arg0.getAction())
						+ "==>父类默认返回值" + super.onInterceptTouchEvent(arg0));
		return super.onInterceptTouchEvent(arg0);
	}

	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		// TODO Auto-generated method stub
		Log.i(TAG,
				"MyDrawerLayout==>onTouchEvent==>"
						+ TouchEventUtil.getTouchAction(arg0.getAction())
						+ "==>父类默认返回值" + super.onTouchEvent(arg0));
		return super.onTouchEvent(arg0);
	}
}
