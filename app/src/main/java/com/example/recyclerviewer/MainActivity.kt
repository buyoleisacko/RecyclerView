package com.example.adapterrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewer.R
import ke.co.recyclerviews.NamesRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

data class Names(val name: String, val age: Int, val hobby: String, val dob:String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(namesList = listOf(
            Names("Mercy",13,"Dancing","11/6/2007"),
            Names("Nile",21,"Football","11/2/1999"),
            Names("Brenda",17,"Singing","14/4/2003git init"),
            Names("Arbe",20,"Poetry","11/2/2000"),
            Names("Monica",19,"Singing","11/2/2001"),
            Names("Ahmed",20,"Reading Novels","11/7/2000"),
            Names("Sabdio",22,"Watching movies","11/2/1998"),
            Names("Mohammed",14,"Poetry","11/4/2006"),
            Names("Anisa",18,"Dancing","11/1/2001"),
            Names("Saskia",21,"Reading Novels","10/4/1999")

        )
                rvNames.adapter = namesAdapter
    }
}
