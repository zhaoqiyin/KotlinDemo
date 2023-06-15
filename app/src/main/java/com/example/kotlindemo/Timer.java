package com.example.kotlindemo;

import android.os.Handler;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;

/**
 * @author zhaoqi.yin
 * @date 2023/4/12 4:39 PM
 */
public class Timer implements LifecycleObserver {
    private Handler handler;
    private int seconds = 0;
    private LiveData<String> mLiveData;

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void startTimer() {
        handler = new Handler();
        handler.post(new Runnable() {
            @Override public void run() {
                Log.d("Timer", "Seconds: " + seconds);
                seconds++;
                handler.postDelayed(this, 1000);
            }
        });
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stopTimer() {
        handler.removeCallbacksAndMessages(null);
        handler = null;
    }


}
