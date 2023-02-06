package com.example.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasakhir.DetailView.Companion.EXTRA_GAME

class MainActivity : AppCompatActivity() {
    private lateinit var rvGame: RecyclerView
    private var list: ArrayList<Game> = arrayListOf()
    private var title: String = "List"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvGame = findViewById(R.id.listView)
        rvGame.setHasFixedSize(true)

        list.addAll(GameData.listData)
        showRecyclerList()

    }


    private fun showRecyclerList() {
        rvGame.layoutManager = LinearLayoutManager(this)
        val listGameAdapter = ListGameAdapter(list)
        rvGame.adapter = listGameAdapter

        listGameAdapter.setOnItemClickCallback(object : ListGameAdapter.OnItemClickCallback {

            override fun onItemClicked(data: Game) {

                showSelectedGame(data)

            }

        })



    }


    private fun showSelectedGame(game: Game) {

       // Toast.makeText(this," Kamu memilih " + game.name, Toast.LENGTH_SHORT).show()

        val intent = Intent(this@MainActivity, DetailView::class.java)
        intent.putExtra(EXTRA_GAME, game)
        startActivity(intent)


    }

    private fun showAbout() {

        val about = Intent(this@MainActivity, about::class.java)
        startActivity(about)

    }

    private fun setActionBarTitle(title: String){

        supportActionBar?.title = title

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode){

            R.id.action_list -> {

                title = "List"
                 showRecyclerList()

            }

            R.id.action_about -> {

                showAbout()

            }


        }
        setActionBarTitle(title)
    }


}