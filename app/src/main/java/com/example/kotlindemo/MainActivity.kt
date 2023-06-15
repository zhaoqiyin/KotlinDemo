package com.example.kotlindemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlindemo.databinding.ActivityMain1Binding


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
//    private var binding: ActivityMainBinding? = null
    private lateinit var mLiveData: LiveData<String>
    private lateinit var mTextView: TextView
    private lateinit var viewModel: MyViewModel

    private lateinit var binding: ActivityMain1Binding

    private var counter = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater);
//        val view: View = binding!!.root
//        setContentView(view)
//        setContentView(R.layout.activity_main)
//        setSupportActionBar(findViewById(R.id.toolbar))


        /**
         * viewModel的代码
         */
//        setContentView(R.layout.activity_main1)
//        mTextView = findViewById(R.id.text_view)
//        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
//        viewModel.count.observe(this, Observer {
//            mTextView.text = "" + it
//        })


//        mLiveData = MutableLiveData<String>()
//        mLiveData.observe(this, Observer {
//            mTextView.text = it
//        })
        var id = "123".toInt()

        Log.d(TAG, ", id = " + id +
                "")
        // 将Timer实例添加为Observer
//        lifecycle.addObserver(Timer())


//        mTextView.setOnClickListener {
////            (mLiveData as MutableLiveData<String>)
////                .setValue("Hello, world!")
//
//            val count = viewModel.count.value?.plus(1)?:0
//            viewModel.setCount(count)
//        }


        /**
         * DataBinding的代码
         */
        // 创建DataBinding实例并与布局文件绑定
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main1)

        // 设置初始值
        binding.counter = counter

        // 为按钮设置点击事件
        binding.btnIncrease.setOnClickListener {
            counter++
            binding.counter = counter
            binding.executePendingBindings()
        }

        binding.btnDecrease.setOnClickListener {
            counter--
            binding.counter = counter
            binding.executePendingBindings()
        }

    }


}