package com.example.notes_project_master_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class NoteTutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_tutorial2);

    }

    public void OnClickNextInSecendPage(View view) {
        Intent intent=new Intent(this,SplashActivity.class);
        startActivity(intent);
    }
}
