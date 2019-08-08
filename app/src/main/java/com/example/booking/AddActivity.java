package com.example.booking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    Button btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        btnadd = findViewById(R.id.btnAdd2);
    }

    public void displayToast(View v){
        Toast.makeText(AddActivity.this,"Added successfully",Toast.LENGTH_SHORT).show();
    }
}
