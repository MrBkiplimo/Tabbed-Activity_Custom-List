package com.king.mymorningtabbedprojectone.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.king.mymorningtabbedprojectone.R

class StatusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var root= inflater.inflate(R.layout.fragment_status, container, false)

        return root
    }



}