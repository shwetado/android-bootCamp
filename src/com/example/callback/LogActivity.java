package com.example.callback;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.widget.TextView;

public class LogActivity extends Activity {

    private static final String TAG = "LogActivity";
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);
        view = (TextView) findViewById(R.id.onLog);
        view.setText("+++ ON CREATE +++");
    }

    @Override
    protected void onStart() {
        super.onStart();
        view.append("+++ ON START +++");
    }

    @Override
    protected void onResume() {
        super.onResume();
       view.append("+++ ON RESUME +++");
    }

    @Override
    protected void onPause() {
        super.onPause();
        view.append("+++ ON PAUSE +++");
    }

    @Override
    protected void onStop() {
        super.onStop();
        view.append("+++ ON STOP +++");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        view.append("+++ ON DESTROY +++");
    }
}
