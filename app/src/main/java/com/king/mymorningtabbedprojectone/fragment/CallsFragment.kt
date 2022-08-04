package com.king.mymorningtabbedprojectone.fragment

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.king.mymorningtabbedprojectone.R

class CallsFragment : Fragment() {
    var buttonClickMe:Button?=null
    var buttonCall:Button?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var root= inflater.inflate(R.layout.fragment_calls, container,
           false)
        buttonClickMe=root.findViewById(R.id.mBtnClickMe)
        buttonClickMe!!.setOnClickListener {
            Toast.makeText(context,"You Clicked me", Toast.LENGTH_LONG).show()
            buttonCall=root.findViewById(R.id.mBtnPhone)
            buttonCall!!.setOnClickListener {

                   
            }
        }
    return root
    }

}