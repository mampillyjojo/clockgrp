package com.fiddler.clockgrp.util

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.TimePicker
import com.fiddler.clockgrp.R
import kotlinx.android.synthetic.main.timepicker.*
import timber.log.Timber
import java.util.*

/**
 * Created by jojomampilly on 12/30/17.
 */

class CustomDatePickerDialog(context: Context?, customDatePickerDialogCallback: CustomDatePickerDialogCallback) : Dialog(context) {

    private val callback: CustomDatePickerDialogCallback = customDatePickerDialogCallback

    interface CustomDatePickerDialogCallback {
         fun getSelectedTime( seletedTime : Calendar)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.timepicker);
    }

    override fun onStart() {
        super.onStart()

        initUi();
    }

    fun initUi() {
//        val onTimeChangeListener = TimePicker.OnTimeChangedListener { timePicker: TimePicker, hourOfDay: Int, min: Int ->
//            Log.d("JOJO","JOJO Time change");
//        }

//            timePicker.setOnTimeChangedListener(onTimeChangeListener)

        cancel.setOnClickListener({v -> dismiss()})
//
        ok.setOnClickListener({ v ->
            var newSelectedTime = Calendar.getInstance();
            newSelectedTime.set(Calendar.HOUR, timePicker.currentHour)
            newSelectedTime.set(Calendar.MINUTE, timePicker.currentMinute)
            callback.getSelectedTime(newSelectedTime)

            dismiss()
        })


    }

}