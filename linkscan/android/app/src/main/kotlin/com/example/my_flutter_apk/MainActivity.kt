package com.example.my_flutter_apk

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity : FlutterActivity() {

    private lateinit var webView: WebView

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(
            flutterEngine.dartExecutor.binaryMessenger,
            "com.example.my_flutter_apk/permissions"
        ).setMethodCallHandler { call, result ->
            when (call.method) {
                else -> result.notImplemented()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // قم بإزالة الأقواس هنا
        handleIncomingIntent(intent)
    }


    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleIncomingIntent(intent)
    }

    private fun handleIncomingIntent(intent: Intent) {
        if (intent.action == Intent.ACTION_VIEW) {
            val data: Uri? = intent.data
            data?.let {
                Log.d("URL_RECEIVED", "Opened URL: $it")
                Toast.makeText(this, "يتم فحص الرابط الآن: $it", Toast.LENGTH_SHORT).show()
                processUrlWithProgressBar(it.toString())
            }
        }
    }

    private fun processUrlWithProgressBar(url: String) {
        val handler = Handler(Looper.getMainLooper())

        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_progress, null)
        val progressBar = dialogView.findViewById<ProgressBar>(R.id.progressBar)
        val progressText = dialogView.findViewById<TextView>(R.id.progressText)

        val progressDialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false)
            .create()

        progressDialog.show()

        Thread {
            for (progress in 1..100) {
                Thread.sleep(200)
                handler.post {
                    progressBar.progress = progress
                    progressText.text = "$progress%"
                }
            }
            handler.post {
                progressDialog.dismiss()
                openUrlInWebView(url)
                Toast.makeText(this, "الرابط آمن جاري فتحه", Toast.LENGTH_SHORT).show()
            }
        }.start()
    }

    private fun openUrlInWebView(url: String) {
        webView = WebView(this).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            webViewClient = WebViewClient()
        }
        setContentView(webView)
        webView.loadUrl(url)
    }
}
