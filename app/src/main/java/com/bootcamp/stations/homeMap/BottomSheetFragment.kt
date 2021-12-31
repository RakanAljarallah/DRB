package com.bootcamp.stations.homeMap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bootcamp.stations.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetFragment :  BottomSheetDialogFragment() {

    companion object {
        const val TAG = "ModalBottomSheet"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }


}