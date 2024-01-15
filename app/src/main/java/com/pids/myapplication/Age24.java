package com.pids.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Age24 extends AppCompatActivity {

    WebView webView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age24);
        webView=findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://preview.codecanyon.net/item/fruit-samurai-html5-game/full_screen_preview/26476113?_ga=2.133496074.581564103.1705326414-582546021.1669353602");
        webView.setWebViewClient( new WebViewClient());
    }
}