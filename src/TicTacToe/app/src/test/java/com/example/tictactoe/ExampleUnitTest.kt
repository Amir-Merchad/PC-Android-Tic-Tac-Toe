package com.example.tictactoe

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WebView.setWebContentsDebuggingEnabled(true)

        setContent {
            WebViewScreen()
        }
    }
}

@Composable
fun WebViewScreen() {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true

                webViewClient = object : WebViewClient() {

                    override fun shouldOverrideUrlLoading(
                        view: WebView,
                        request: WebResourceRequest
                    ): Boolean {
                        val url = request.url.toString()
                        return if (url.startsWith("file:///android_asset/")) {
                            // Let WebView handle local asset file URLs by itself
                            false
                        } else {
                            // For external URLs, load inside WebView
                            view.loadUrl(url)
                            true
                        }
                    }

                    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                        return if (url.startsWith("file:///android_asset/")) {
                            false
                        } else {
                            view.loadUrl(url)
                            true
                        }
                    }
                }

                loadUrl("file:///android_asset/index.html")
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}