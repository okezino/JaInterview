package com.example.jainterview

import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondView : AppCompatActivity() {
   lateinit var nameText : TextView
   lateinit var player : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_view)

        nameText = findViewById(R.id.firstName)

        var name = intent.extras?.getString("name")
        nameText.text = name

        player = MediaPlayer()
        player.setDataSource("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-6.mp3")
        player.prepare()
        player.start()
    }
}