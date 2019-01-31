package com.example.maria.laboratorio42

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView


//activity donde despliega los links a nuestros repositorios de acuerdo al boton que escoja el usuario
//USO DE WEBVIEW
class Proyectos : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyectos)
    }
    fun abrirlaboratorio2(view: View){
        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://github.com/18250MariaInes/Aplicaciones-moviles/tree/master/Laboratorio2")

    }
    fun abrirlaboratorio3(view: View){
        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://github.com/18250MariaInes/Aplicaciones-moviles/tree/master/Laboratorio3/app/src/main/java/com/example/maria/laboratorio3")
    }
}
