package com.magee.mynotebook.customview;

import com.magee.mynotebook.utils.TouchEventUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class MyTextView extends TextView {

	private static final String TAG="AAAA";
	public MyTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	public MyTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Log.i(TAG, "MyTextView==>dispatchTouchEvent==>"+ TouchEventUtil.getTouchAction(event.getAction()));
		return true;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Log.i(TAG, "MyTextView==>onTouchEvent==>"+ TouchEventUtil.getTouchAction(event.getAction()));
		return true;
	}
}
