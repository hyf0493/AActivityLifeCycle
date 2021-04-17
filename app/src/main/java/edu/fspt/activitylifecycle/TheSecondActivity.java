package edu.fspt.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import net.fspt.activitylifecycle.R;

/**
 * 第二个Activity 声明周期的展示
 * Created by yizhong.xu on 2017/7/24.
 */

public class TheSecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thesecond);
        Log.d("ActivityLifeCycle", getClass().getSimpleName()+ "执行了onCreate:    " );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycle", getClass().getSimpleName()+ "执行了onStart:     " );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+  "执行了onRestart:   " );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle", getClass().getSimpleName()+ "执行了onResume:   " );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onPause:   " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+  "执行了onStop:   " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle", getClass().getSimpleName()+ "执行了onDestroy:   " );
    }

    public void MyClick(View view) {
        switch (view.getId()) {
            case R.id.btnMain://调到MainActivity
              finish();
                break;
        }
    }
}
