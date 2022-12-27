package com.example.programminglanguages.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gridview.model.Language
import com.example.programminglanguages.MainActivity
import com.example.programminglanguages.R

class LanguageAdapter(val activity: MainActivity, var languages:ArrayList<Language>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return languages.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is LanguageViewHolder){
            holder.image.setImageResource(languages[position].image)
            holder.name.setText(languages[position].name)
            holder.linear.setOnClickListener{
                activity.openItemDetails(languages[position])
            }
        }
    }

    class LanguageViewHolder(var view:View):RecyclerView.ViewHolder(view){
        var image = view.findViewById<ImageView>(R.id.iv_image)
        var name = view.findViewById<TextView>(R.id.tv_name)
        var linear = view.findViewById<LinearLayout>(R.id.linearID)
    }

}