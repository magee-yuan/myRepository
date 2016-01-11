package com.magee.mynotebook.manager;

import java.util.ArrayList;
import java.util.List;

import com.magee.mynotebook.utils.MyConfirmDialog;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

/**
 * 活动管理器，用来管理所有活动，增加，移除，退出
 * @author Megoo
 *
 */
public class ActivityCollector {

	public static List<FragmentActivity> activities=new ArrayList<FragmentActivity>();
	
	public static void addActivity(FragmentActivity activity){
		activities.add(activity);
	}
	
	public static void removeActivity(FragmentActivity activity){
		activities.remove(activity);
	}
	
	public static void finishAll(){
		for(Activity activity: activities){
			if(!activity.isFinishing()){
				activity.finish();
			}
		}
	}
}
