package com.example.music_player_learning_kotlin

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing
        val seekbar : SeekBar = findViewById(R.id.seek_bar)
        val time_text : TextView = findViewById(R.id.time_left_text)
        val title_text : TextView = findViewById(R.id.title)
        val play_button : Button = findViewById(R.id.play_button)
        val pause_button : Button = findViewById(R.id.pause_button)
        val back_button : Button = findViewById(R.id.back_button)
        val forward_button : Button = findViewById(R.id.forward_button)


    }
}