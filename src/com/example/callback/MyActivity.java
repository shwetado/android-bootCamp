package com.example.callback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private static int countOnCreate = 0;
    private static int countOnStart = 0;
    private static int countOnResume = 0;
    private static int countOnPause = 0;
    private static int countOnStop = 0;
    private static int countOnDestroy = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        countOnCreate++;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView view = (TextView) findViewById(R.id.createCount);
        view.setText(String.valueOf(countOnCreate));
    }

    @Override
    protected void onStart() {
        countOnStart++;
        super.onStart();
        TextView view = (TextView) findViewById(R.id.startCount);
        view.setText(String.valueOf(countOnStart));
    }

    @Override
    protected void onResume() {
        countOnResume++;
        super.onResume();
        TextView view = (TextView) findViewById(R.id.resumeCount);
        view.setText(String.valueOf(countOnResume));
    }

    @Override
    protected void onPause() {
        countOnPause++;
        super.onPause();
        TextView view = (TextView) findViewById(R.id.pauseCount);
        view.setText(String.valueOf(countOnPause));
    }

    @Override
    protected void onStop() {
        countOnStop++;
        super.onStop();
        TextView view = (TextView) findViewById(R.id.stopCount);
        view.setText(String.valueOf(countOnStop));
    }

    @Override
    protected void onDestroy() {
        countOnDestroy++;
        super.onDestroy();
        TextView view = (TextView) findViewById(R.id.destroyCount);
        view.setText(String.valueOf(countOnDestroy));
    }

    public void startNextActivity(View view) {
        startActivity(new Intent(this,LogActivity.class));
    }
}
