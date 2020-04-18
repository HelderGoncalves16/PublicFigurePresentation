package com.example.froome

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.froome.Fragmentos.Bio
import com.example.froome.Fragmentos.Galeria
import com.example.froome.Fragmentos.Palmares
import com.example.froome.Options.Faq
import com.example.froome.Options.ProCyclingStats
import com.example.froome.Options.Share
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var bio: Bio
    lateinit var galeria: Galeria
    lateinit var palmares: Palmares
    lateinit var faq: Faq
    lateinit var share: Share
    lateinit var pcs: ProCyclingStats

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val actionBar = supportActionBar

        actionBar!!.title = "Christopher Froome"
        actionBar.subtitle = "Professional Cyclist"
        actionBar.elevation = 4.0F


        val barraNavegacao: BottomNavigationView = findViewById(R.id.bottom_nav)

        barraNavegacao.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_bio -> {

                    bio = Bio()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, bio)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.navigation_palmares -> {

                    palmares = Palmares()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, palmares)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.navigation_galeria -> {

                    galeria = Galeria()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, galeria)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

            }

            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId

        if(id==R.id.proCyclingStats){
            Toast.makeText(this,"Pro Cycling Stats",Toast.LENGTH_SHORT).show()
            pcs = ProCyclingStats()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_layout, pcs)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }
        return true
    }

}








