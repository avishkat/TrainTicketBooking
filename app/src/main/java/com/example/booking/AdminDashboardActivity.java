package com.example.booking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminDashboardActivity extends AppCompatActivity {
    Button btnadd, btnview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        btnadd = findViewById(R.id.btnAdd1);
        btnview = findViewById(R.id.btnView1);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddActivity();
            }
        });

        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewActivity();
            }
        });
    }

    public void openAddActivity(){
        Intent intent = new Intent(this,AddActivity.class);
        startActivity(intent);
    }

    public void openViewActivity(){
        Intent intent = new Intent(this,ViewActivity.class);
        startActivity(intent);
    }

}
