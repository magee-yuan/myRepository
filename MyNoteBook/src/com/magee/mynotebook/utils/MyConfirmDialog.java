package com.magee.mynotebook.utils;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;

import com.magee.mynotebook.customview.MyCustomDialog;
import com.magee.mynotebook.manager.ActivityCollector;


public class MyConfirmDialog {

	public static void finishActivities(FragmentActivity activity) {
		MyCustomDialog.Builder builder = new MyCustomDialog.Builder(activity);
		builder.setMessage("你确认要退出吗？");
		builder.setTitle("被窝Music");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				// 设置你的操作事项
				ActivityCollector.finishAll();
			}
		});

		builder.setNegativeButton("取消",
				new android.content.DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
		builder.create().show();
	}
}
