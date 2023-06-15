package com.example.kotlindemo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

/**
 * @author zhaoqi.yin
 * @date 2023/4/13 4:55 PM
 */
class MainActivity2 extends AppCompatActivity {
    private MyViewModel viewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        viewModel.getCount().observe(this, count -> {
            // 更新 UI
        });

    }
}
