package com.example.sheepy

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val done=findViewById<MaterialButton>(R.id.done)
        done.setIconTintResource(R.color.black)
        Glide.with(this)
            .asGif()
            .load(R.drawable.gif1) // Replace with a valid url
            .addListener(object : RequestListener<GifDrawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any,
                    target: Target<GifDrawable>,
                    isFirstResource: Boolean
                ): Boolean {
                    return false
                }

                override fun onResourceReady(
                    resource: GifDrawable,
                    model: Any,
                    target: Target<GifDrawable>,
                    dataSource: DataSource,
                    isFirstResource: Boolean
                ): Boolean {
                    resource.setLoopCount(1)
                    return false
                }
            })
            .into(findViewById(R.id.IV))
        val mp = MediaPlayer.create(this,R.raw.sheep)
        mp.start()

        fun clearNumbers(){
            val tv=findViewById<TextView>(R.id.TV)
            tv.setText("")
        }
        done.setOnClickListener {
            val mp = MediaPlayer.create(this,R.raw.sheep)
            mp.start()
            Glide.with(this)
                .asGif()
                .load(R.drawable.gifend) // Replace with a valid url
                .addListener(object : RequestListener<GifDrawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any,
                        target: Target<GifDrawable>,
                        isFirstResource: Boolean
                    ): Boolean {
                        return false
                    }

                    override fun onResourceReady(
                        resource: GifDrawable,
                        model: Any,
                        target: Target<GifDrawable>,
                        dataSource: DataSource,
                        isFirstResource: Boolean
                    ): Boolean {
                        resource.setLoopCount(1)
                        return false
                    }
                })
                .into(findViewById(R.id.IV))
            clearNumbers()

        }



        fun showNumbers(number:String){
            val tv=findViewById<TextView>(R.id.TV)
            val text=tv.text
            tv.setText("$text$number")
        }
        val one=findViewById<MaterialButton>(R.id.one)
        one.setOnClickListener {
            showNumbers("1")
        }
        val two=findViewById<MaterialButton>(R.id.two)
        two.setOnClickListener {
            showNumbers("2")
        }
        val three=findViewById<MaterialButton>(R.id.three)
        three.setOnClickListener {
            showNumbers("3")
        }
        val four=findViewById<MaterialButton>(R.id.four)
        four.setOnClickListener {
            showNumbers("4")
        }
        val five=findViewById<MaterialButton>(R.id.five)
        five.setOnClickListener {
            showNumbers("5")
        }
        val six=findViewById<MaterialButton>(R.id.six)
        six.setOnClickListener {
            showNumbers("6")
        }
        val seven=findViewById<MaterialButton>(R.id.seven)
        seven.setOnClickListener {
            showNumbers("7")
        }
        val eighth=findViewById<MaterialButton>(R.id.eighth)
        eighth.setOnClickListener {
            showNumbers("8")
        }
        val nine=findViewById<MaterialButton>(R.id.nine)
        nine.setOnClickListener {
            showNumbers("9")
        }
        val delete=findViewById<MaterialButton>(R.id.delete)
        delete.setOnClickListener {
            clearNumbers()
        }
        val zero=findViewById<MaterialButton>(R.id.zero)
        zero.setOnClickListener {
            showNumbers("0")
        }


    }
}