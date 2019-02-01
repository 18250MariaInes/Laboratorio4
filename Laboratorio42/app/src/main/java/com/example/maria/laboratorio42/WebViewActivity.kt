package com.example.maria.laboratorio42

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebViewActivity : AppCompatActivity() {
//actividad donde se despliegan los webviews escogido por el usuario con el URl correspondiente
//USO DE WEBVIEW
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val url = intent.getStringExtra("URL")
        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl(url)
    }
}
