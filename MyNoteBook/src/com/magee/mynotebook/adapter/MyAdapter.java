package com.magee.mynotebook.adapter;

import com.magee.mynotebook.activity.R;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private Context context;
	private Cursor cursor;
	private LinearLayout layout;

	public MyAdapter(Context context, Cursor cursor) {
		this.context = context;
		this.cursor = cursor;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return cursor.getCount();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return cursor.getPosition();
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = LayoutInflater.from(context);
		layout = (LinearLayout) inflater.inflate(R.layout.item_cell, null);

		TextView contenttv = (TextView) layout.findViewById(R.id.list_tv);
		TextView timetv = (TextView) layout.findViewById(R.id.list_time);
		ImageView imgiv = (ImageView) layout.findViewById(R.id.list_img);
		ImageView videoiv = (ImageView) layout.findViewById(R.id.list_video);

		cursor.moveToPosition(position);
		String content = cursor.getString(cursor.getColumnIndex("content"));
		String time = cursor.getString(cursor.getColumnIndex("time"));
		
		contenttv.setText(content);
		timetv.setText(time);
		return layout;
	}

}
