package com.yoekido.gridlauncher;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class UserTest {
    private int count;
    private Handler handler;
    private int countdown;
    private List<String> tests;
    private Activity activity;
    private int last;
    private GridView gridView;

    UserTest(Activity activity, IconAdapter iconAdapter, GridView gridView) {
        count = 0;
        handler = new Handler();
        this.activity = activity;
        this.gridView = gridView;
        tests = new LinkedList<String>();
        for (App app : iconAdapter.list) {
            tests.add(app.name);
        }
    }

    public void start() {
        if (count == 0) {
            countdown();
            last = -1;
            Collections.shuffle(tests);
        }
    }

    public void countdown() {
        countdown = 4;
        final Timer timer = new Timer(true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (--countdown <= 0) {
                            timer.cancel();
                            next(null);
                        } else {
                            showText(Integer.toString(countdown));
                        }
                    }
                });
            }
        }, 100, 1000);
    }

    private void showText(String text) {
        ((TextView) activity.findViewById(R.id.textView)).setText(text);
    }

    public void next(String answer) {
        if (count > 0) {
            boolean correct = tests.get(count - 1).equals(answer);
            Toast.makeText(activity, correct ? "Correct!" : "Wrong :(", Toast.LENGTH_SHORT).show();
            Log.d("UserTest", "Test " + count + " " + (correct ? "correct" : "wrong"));
            if (count >= 20) {
                Log.d("UserTest", "-- finish --");
                showText("Finish");
                count = 0;
                return;
            }
        } else if (answer != null) {
            Toast.makeText(activity, answer, Toast.LENGTH_SHORT).show();
            return;
        } else {
            Log.d("UserTest", "-- start --");
        }
        Log.d("UserTest", "Test " + ++count + " start");
        showText(tests.get(count - 1));
    }

    public void touch() {
        if (last != count) {
            Log.d("UserTest", "Test " + count + " touch");
            last = count;
        }
    }
}
