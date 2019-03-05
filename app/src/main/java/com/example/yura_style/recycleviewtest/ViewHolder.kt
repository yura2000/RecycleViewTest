package com.example.yura_style.recycleviewtest

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textFirst: TextView? = null
    var textSecond: TextView? = null
    var imagePerson: ImageView? = null
    init {
        textFirst = itemView?.findViewById(R.id.text_first_tv)
        textSecond = itemView?.findViewById(R.id.text_second_tv)
        imagePerson = itemView?.findViewById(R.id.image_list_item)
    }

    fun bind(contact: Contact) {
        textFirst?.text = contact.name
        textSecond?.text = contact.age.toString()
        imagePerson?.setImageDrawable(contact.image)
    }
}
