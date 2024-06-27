package com.akirachix.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactsAdapter(var contactsList: List<Contact>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.tvName.text = contact.Name
        holder.tvphoneNumber.text = contact.phoneNumber
        holder.tvEmail.text = contact.email
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvphoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)}