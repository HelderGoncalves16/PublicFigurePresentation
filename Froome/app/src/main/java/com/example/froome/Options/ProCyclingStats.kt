package com.example.froome.Options

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.froome.R


class ProCyclingStats : Fragment() {

    lateinit var mWebView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_pro_cycling_stats, container, false)
        mWebView = v.findViewById(R.id.webview) as WebView
        mWebView.loadUrl("https://www.procyclingstats.com/rider/christopher-froome")

        // Ativa o JavaScript
        val webSettings: WebSettings = mWebView.settings
        webSettings.javaScriptEnabled = true

        //Para abrir no WebLink e não no browser
        mWebView.webViewClient = WebViewClient()
        return v
    }


}


