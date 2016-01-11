package com.magee.mynotebook.customview;

import com.magee.mynotebook.utils.TouchEventUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLinearLayout extends LinearLayout {

	private static final String TAG="AAAA";
	public MyLinearLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	public MyLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	public MyLinearLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		Log.i(TAG, "MyLinearLayout==>dispatchTouchEvent==>"+ TouchEventUtil.getTouchAction(ev.getAction()));
		return true;
	}
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		Log.i(TAG, "MyLinearLayout==>onInterceptTouchEvent==>"+ TouchEventUtil.getTouchAction(ev.getAction()));
		return true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Log.i(TAG, "MyLinearLayout==>onTouchEvent==>"+ TouchEventUtil.getTouchAction(event.getAction()));
		return true;
	}
}
