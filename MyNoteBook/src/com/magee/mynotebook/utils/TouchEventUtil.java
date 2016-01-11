package com.magee.mynotebook.utils;

import android.view.MotionEvent;

public class TouchEventUtil {
    
    public static String getTouchAction(int actionId) {
        String actionName = "Unknow:id=" + actionId;
        switch (actionId) {
        case MotionEvent.ACTION_DOWN:
            actionName = "按下去";
            break;
        case MotionEvent.ACTION_MOVE:
            actionName = "移动的时候";
            break;
        case MotionEvent.ACTION_UP:
            actionName = "抬起来";
            break;
        case MotionEvent.ACTION_CANCEL:
            actionName = "ACTION_CANCEL";
            break;
        case MotionEvent.ACTION_OUTSIDE:
            actionName = "ACTION_OUTSIDE";
            break;
        }
        return actionName;
    }
    
}