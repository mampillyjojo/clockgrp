package com.fiddler.clockgrp.alarm

import android.app.DatePickerDialog
import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import com.fiddler.clockgrp.R
import com.fiddler.clockgrp.util.CustomDatePickerDialog
import com.fiddler.clockgrp.util.CustomDatePickerDialog.CustomDatePickerDialogCallback
import com.fiddler.clockgrp.util.SharedPref
import kotlinx.android.synthetic.main.alarm_layout.*
import java.util.*

/**
 * Created by jojomampilly on 12/30/17.
 */

class AlarmFragmnet : Fragment() {


    companion object {
        @JvmStatic fun newInstance(): AlarmFragmnet {
            return AlarmFragmnet()
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater?.inflate(R.layout.alarm_layout, container, false)

        return rootView;
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUi()
    }


    private fun initUi() {
        alarmButton.setOnClickListener { handleAlarmButtonClick(it) }
    }

    private fun handleAlarmButtonClick(view: View) {

        var callback = object: CustomDatePickerDialogCallback  {

            override fun getSelectedTime(seletedTime: Calendar) {
                Log.d("JOJO" , "Time selected ${seletedTime.time}")
            }

        }
//        var callback  = CustomDatePickerDialogCallback {selecetedTime: Calendar ->
//            Log.d("JOJO" , "selectedTime ${selecetedTime.time}")
//        }
        var picker = CustomDatePickerDialog(activity , callback)
        picker.show()

        Toast.makeText(activity, "Set Alarm Clicked", Toast.LENGTH_SHORT).show();

    }


}