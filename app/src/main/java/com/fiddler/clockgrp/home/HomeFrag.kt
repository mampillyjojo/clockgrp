package com.fiddler.clockgrp.home

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fiddler.clockgrp.R

/**
 * Created by jojomampilly on 12/31/17.
 */

class HomeFrag : Fragment() {

    companion object {
        @JvmStatic fun newInstance(): HomeFrag {
            return HomeFrag()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater?.inflate(R.layout.home_layout, container, false)

        return rootView
    }
}