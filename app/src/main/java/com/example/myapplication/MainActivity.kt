package com.example.myapplication

import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        supportActionBar?.hide()
        
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)
        
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        
        webView.loadUrl("https://board-web.prod.atteri.co.kr")
    }
}