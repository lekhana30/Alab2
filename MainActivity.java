package com.example.lab_2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 }
 public void urlfn(View view)
 {
 WebView webview;
 EditText txt;
 webview=(WebView)findViewById(R.id.webview);
 txt=(EditText)findViewById(R.id.url);
 String url_txt=txt.getText().toString();
 webview.loadUrl(url_txt);
 }
 public void urlnext(View view)
 {
 Intent it=new Intent(MainActivity.this,Activity2.class);
 startActivity(it);
 } }
