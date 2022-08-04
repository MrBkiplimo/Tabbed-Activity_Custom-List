package com.king.mymorningtabbedprojectone.fragment

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.king.mymorningtabbedprojectone.R
import com.king.mymorningtabbedprojectone.User
import com.king.mymorningtabbedprojectone.ui.main.CustomAdapter

class ChatsFragments : Fragment() {
    var mList:ListView?=null
    var users:ArrayList<User> ?=null
    var adapter:CustomAdapter?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_chats_fragments, container, false)

        mList=root.findViewById(R.id.mListUsers)
        users = ArrayList()
        adapter= CustomAdapter(context,users!!)
        //Start creating users
        var user1=User(R.mipmap.imageone,"KingWanyama","077140000")
        var user2=User(R.mipmap.imagetwo,"KingWanyama","077140000")
        var user3=User(R.mipmap.imagethree,"KingWanyama","077140000")
        var user4=User(R.mipmap.imagefour,"KingWanyama","077140000")
        var user5=User(R.mipmap.imageone,"KingWanyama","077140000")
        var user6=User(R.mipmap.imagetwo,"KingWanyama","077140000")
        var user7=User(R.mipmap.imagethree,"KingWanyama","077140000")
        var user8=User(R.mipmap.imagefour,"KingWanyama","077140000")
        var user9=User(R.mipmap.imageone,"KingWanyama","077140000")

        //Add the created users to the arraylist users
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        users!!.add(user8)
        users!!.add(user9)
        //Assign the custom adapter to the list view
        mList!!.adapter= adapter!!
        return root
    }
    }



//Implement a custom list view