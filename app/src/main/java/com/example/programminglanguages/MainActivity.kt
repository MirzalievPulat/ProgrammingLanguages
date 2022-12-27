package com.example.programminglanguages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridview.model.Language
import com.example.programminglanguages.adapter.LanguageAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }
    fun initviews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(prepareLanguages())
    }

    fun refreshAdapter(languages:ArrayList<Language>){
        var adapter = LanguageAdapter(this, languages)
        recyclerView.adapter = adapter
    }
    fun prepareLanguages():ArrayList<Language>{
        var languages = ArrayList<Language>()

        languages.add(Language(R.drawable.c_plus,"C++"))
        languages.add(Language(R.drawable.c_sharp,"C#"))
        languages.add(Language(R.drawable.java,"Java"))
        languages.add(Language(R.drawable.javascript,"JavaScript"))
        languages.add(Language(R.drawable.phyton,"Phyton"))
        languages.add(Language(R.drawable.php,"PHP#"))
        languages.add(Language(R.drawable.kotlin,"Kotlin"))
        languages.add(Language(R.drawable.swift,"Swift"))

        return languages
    }

    fun openItemDetails(language:Language){
        var intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("name",language)
        startActivity(intent)
    }
}