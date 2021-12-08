package com.tata.attestationapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

lateinit var bottomNavigationMenu: BottomNavigationView
private const val LAST_SELECTED_ITEM = "item"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.animal_page -> {
                    fragment = AnimalFragment()
                }
                R.id.wiki_page -> {
                    val wikiLink = Uri.parse("https://en.wikipedia.org/wiki/Animal")
                    val openBrowserIntent = Intent(Intent.ACTION_VIEW, wikiLink)
                    val chooser = Intent.createChooser(openBrowserIntent, "browser")

                    startActivity(chooser)

                }
                R.id.info_page -> {
                    fragment = InfoFragment()
                }
            }
            replaceFragment(fragment!!)
            true

        }

        bottomNavigationMenu.selectedItemId =
            if (savedInstanceState != null) savedInstanceState.getInt(
                LAST_SELECTED_ITEM
            ) else R.id.animal_page

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationMenu.selectedItemId)

    }

    private fun replaceFragment(fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, fragment)
            .addToBackStack(fragment.tag)
            .commit()

    }
}
