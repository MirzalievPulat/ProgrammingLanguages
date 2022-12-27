package com.example.programminglanguages

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.gridview.model.Language

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var language = intent.getParcelableExtra<Language>("name")

        var image = findViewById<ImageView>(R.id.iv_detailed)
        var name = findViewById<TextView>(R.id.tv_detailed)

        image.setImageResource(language!!.image)
        name.setText(language.name)



    }
}