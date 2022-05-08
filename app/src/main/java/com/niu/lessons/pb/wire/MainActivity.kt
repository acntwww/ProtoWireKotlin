package com.niu.lessons.pb.wire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.niu.lessons.data.pb.Player

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val player = Player("Alan", 10)
        val encoded = player.encode()
        val decodedPlayer = Player.ADAPTER.decode(encoded)
        println("origin player: $player")
        println("decodedPlayer: $decodedPlayer")
        println("Are they all same: ${player == decodedPlayer}")
        setContentView(R.layout.activity_main)
    }
}