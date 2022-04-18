package com.example.s1m4videoview1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        val myVideoView: VideoView = findViewById(R.id.videoView)
        val ruta:String = "android.resource://" + packageName + "/" + R.raw.Video1
        val videoUri: Uri = Uri.parse(ruta)
        myVideoView.setVideoURI(videoUri)

        //agregar los controles de video
        val mediaController = MediaController(this)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)

        myVideoView.setOnPreparedListener {
            myVideoView.start()

        }

        myVideoView.setOnCompletionListener {
            Toast.makeText(this, "Video1 visto completo!", Toast.LENGTH_SHORT).show()
        }
        //videoview





    }
}