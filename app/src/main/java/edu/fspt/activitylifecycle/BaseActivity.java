package edu.fspt.activitylifecycle;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 方便打印的基础Activity
 * Created by yizhong.xu on 2017/7/24.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ActivityLifeCycle", "------onCreate(方法)-------");
        Log.d("ActivityLifeCycle", "onCreate：" + getClass().getSimpleName() + " TaskId: " + getTaskId() + " hasCode:" + this.hashCode());
        dumpTaskAffinity();
        
    }

    /**
     * 第一次不会执行onNewIntent，过后想启动这个Activity那就是执行onNewIntent()---->onResart()------>onStart()----->onResume()
     *
     * @param intent
     */
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("ActivityLifeCycle", "------onNewIntent(方法)-------");
        Log.d("ActivityLifeCycle", "onNewIntent：" + getClass().getSimpleName() + " TaskId: " + getTaskId() + " hasCode:" + this.hashCode());
        dumpTaskAffinity();
    }

    /**
     * 任务关联
     */
    protected void dumpTaskAffinity() {

        try {
            ActivityInfo info = this.getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.d("ActivityLifeCycle", "taskAffinity:" + info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}
