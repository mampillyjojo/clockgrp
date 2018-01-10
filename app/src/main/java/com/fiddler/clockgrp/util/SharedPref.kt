package com.fiddler.clockgrp.util

import android.content.Context
import android.content.SharedPreferences
import timber.log.Timber

/**
 * Created by jojomampilly on 12/31/17.
 */

class SharedPref private  constructor(){

    //lateinit val  mPrefs : SharedPreferences
    var b:String? = null

    init { println("This ($this) is a singleton") }

    private object Holder { val INSTANCE = SharedPref() }

    companion object {
        val instance: SharedPref by lazy { Holder.INSTANCE }
    }


    public static SharedPrefs config(Context context) {
        if (sInstance == null) {
            Timber.d("SharedPrefs.config");
            // sInstance = new SharedPrefs(PreferenceManager.getDefaultSharedPreferences(context));
            sInstance = new SharedPrefs(context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE));
        }
        return sInstance;
    }







}