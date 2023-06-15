package com.example.kotlindemo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author zhaoqi.yin
 * @date 2023/4/13 3:29 PM
 */
public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> count = new MutableLiveData<>();

    public void setCount(int count) {
        this.count.setValue(count);
    }

    public LiveData<Integer> getCount() {
        return count;
    }
}
