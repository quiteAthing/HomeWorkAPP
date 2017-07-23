package com.hai.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity{
    WebView host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        host=(WebView)findViewById(R.id.host);
            WebSettings setting=host.getSettings();
            setting.setDomStorageEnabled(true);
            setting.setJavaScriptEnabled(true);

            host.setWebChromeClient(new WebChromeClient());
            host.loadUrl("file:///android_asset/homeworkORIGIN/pages/linkerList.html");

        Log.d("loading","everything loaded");

    }
}
