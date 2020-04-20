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

class Twitter : Fragment() {

    lateinit var mWebView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_twitter, container, false)
        mWebView = v.findViewById(R.id.webview) as WebView
        mWebView.loadUrl("https://twitter.com/chrisfroome")

        // Enable Javascript
        val webSettings: WebSettings = mWebView.getSettings()
        webSettings.javaScriptEnabled = true

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(WebViewClient())
        return v
    }
}