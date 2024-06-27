package com.akirachix.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager=LinearLayoutManager( this)
        displayContact()
    }
    fun displayContact(){
        val contact1 = Contact("Anna","078888999","anna@gmail.com","")
        val contact2 = Contact("Benard","0787808999","benard@gmail.com","")
        val contact3 = Contact("Catherine","078809799","catherine@gmail.com","")
        val contact4 = Contact("Delvin","0783421229","delvin@gmail.com","")
        val contact5 = Contact("Effie","078888999","effie@gmail.com","")
        val contact6 = Contact("Favour","078888999","favour@gmail.com","")
        val contact7 = Contact("Jane","078888999","jane@gmail.com","")
        val contact8 = Contact("Terry","078888999","terry@gmail.com","")
        val contact9 = Contact("Stella","078888999","stella@gmail.com","")
        val contact10 = Contact("Kennedy","078888999","kennedy@gmail.com","")

        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        val contactsAdapter = ContactsAdapter(contactList)
        binding.rvContacts.adapter= contactsAdapter
    }
}