package com.pids.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Age56 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age2);
        webView=findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://preview.codecanyon.net/item/santas-gifts-game-construct-3-c3p-html5-christmas-game/full_screen_preview/49566354?_ga=2.138065332.581564103.1705326414-582546021.1669353602");

    }
}