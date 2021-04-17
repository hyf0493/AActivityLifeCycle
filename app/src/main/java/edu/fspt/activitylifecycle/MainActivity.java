package edu.fspt.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import net.fspt.activitylifecycle.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onCreate:    ");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onStart:     ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onRestart:   ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onResume:   ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onPause:   ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onStop:   ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle",getClass().getSimpleName()+ "执行了onDestroy:   ");
    }

    public void MyClick(View view) {
        switch (view.getId()) {
            case R.id.btnSingleInstance://进入到activitymodedemo
                Intent intent = new Intent();
                intent.setAction("net.fspt.activitymodedemo.singleInstance");
                startActivity(intent);
                break;
            case R.id.btnTheSecondActivity://进入到第二个Activity
                startActivity(new Intent(MainActivity.this, TheSecondActivity.class));
                break;
        }

    }
}