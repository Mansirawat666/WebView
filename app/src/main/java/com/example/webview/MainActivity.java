package com.example.webview;//webview-container which holds website ,website is a collection of web pages

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w=findViewById(R.id.web);
       // w.loadUrl("https://www.cetpainfotech.com");
        w.loadUrl("file:///android_asset/web.html");
    }
}
