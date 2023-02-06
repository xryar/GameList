package com.example.tugasakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailView : AppCompatActivity() {

    companion object{
        const val EXTRA_GAME = "extra_game"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)

        val game = intent.getParcelableExtra<Game>(EXTRA_GAME)

        var imgPhoto:ImageView = findViewById(R.id.img_item_photo)
        var tvName:TextView = findViewById(R.id.item_name)
        var tvDetail:TextView = findViewById(R.id.item_detail)

        if (game != null) {
            imgPhoto.setImageResource(game.photo)
            tvName.text = game.name
            tvDetail.text = game.detail
        }


    }

}