package com.example.lab_2;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class Activity2 extends AppCompatActivity implements 
AdapterView.OnItemClickListener {
@Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_2);
 ((ListView) findViewById(R.id.list)).setOnItemClickListener(this);
 }
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 new AlertDialog.Builder(Activity2.this).setTitle("Shows").setMessage("Good 
choice :) !!!").create().show();
 }
 }
