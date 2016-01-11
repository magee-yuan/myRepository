package com.magee.mynotebook.customview;

import com.magee.mynotebook.utils.TouchEventUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ListView;

public class MyListView extends ListView {
	private static final String TAG = "AAAA";

	public MyListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public MyListView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public boolean dispatchTouchEvent(MotionEvent ev) {
//		// TODO Auto-generated method stub
//		Log.i(TAG,
//				"MyListView==>dispatchTouchEvent==>"
//						+ TouchEventUtil.getTouchAction(ev.getAction())
//						+ "==>父类默认返回值" + super.dispatchTouchEvent(ev));
//		return super.dispatchTouchEvent(ev);
//	}
//
//	@Override
//	public boolean onInterceptTouchEvent(MotionEvent ev) {
//		// TODO Auto-generated method stub
//		Log.i(TAG,
//				"MyListView==>onInterceptTouchEvent==>"
//						+ TouchEventUtil.getTouchAction(ev.getAction())
//						+ "==>父类默认返回值" + super.onInterceptTouchEvent(ev));
//		return super.onInterceptTouchEvent(ev);
//	}
//
//	@Override
//	public boolean onTouchEvent(MotionEvent ev) {
//		// TODO Auto-generated method stub
//		Log.i(TAG,
//				"MyListView==>onTouchEvent==>"
//						+ TouchEventUtil.getTouchAction(ev.getAction())
//						+ "==>父类默认返回值" + super.onTouchEvent(ev));
//		return super.onTouchEvent(ev);
//	}
}
