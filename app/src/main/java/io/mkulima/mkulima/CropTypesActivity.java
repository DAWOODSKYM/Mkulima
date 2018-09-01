package io.mkulima.mkulima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CropTypesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_types);
        WebView webView=findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/onion_types.html");
    }
}
