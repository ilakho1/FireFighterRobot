package com.example.flaskserver;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    Button button_forward;
    Button button_reverse;
    Button button_left;
    Button button_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webviewvideo);
        button_forward = findViewById(R.id.button_forward);
        button_reverse = findViewById(R.id.button_reverse);
        button_right = findViewById(R.id.button_right);
        button_left = findViewById(R.id.button_left);

        String ip;
        int port = 8081;

        ip = getIntent().getExtras().getString("ipaddress");
        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(ip + ":" + port);
        button_forward.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                //Enter Blynk Api Code For Forward
            }
        });
        button_right.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_left.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });
        button_reverse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });
    }

    }




//    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
//    private void showweb() {
//        webView.setWebViewClient(new MyBrowser());
//        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
//        webView.setWebChromeClient(new WebChromeClient());
//        webView.setWebChromeClient(new myChrome());
//
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.setHorizontalScrollBarEnabled(false);
//
//
//        webView.setOnKeyListener( new View.OnKeyListener() {
//            @Override
//            public boolean onKey( View v, int keyCode, KeyEvent event ) {
//                if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
//                    webView.goBack();
//                    return true;
//                }
//
//                return false;
//            }
//        });
//    }
}