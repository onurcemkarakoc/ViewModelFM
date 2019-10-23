package com.onurcemkarakoc.viewmodelfm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)

        count_tv.text="${viewModel.count}"

        count_btn.setOnClickListener {
            increaseCount()
        }
    }

    private fun increaseCount() {
        viewModel.count++
        count_tv.text="${viewModel.count}"
    }
}
