package com.example.booking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewActivity extends AppCompatActivity {
    Button btntrain1, btntrain2, btntrain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        btntrain1 = findViewById(R.id.btnTrain1);
        btntrain2 = findViewById(R.id.btnTrain2);
        btntrain3 = findViewById(R.id.btnTrain3);

        btntrain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpdateActivity();
            }
        });

        btntrain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpdateActivity();
            }
        });

        btntrain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpdateActivity();
            }
        });
    }

    public void openUpdateActivity(){
        Intent intent = new Intent(this,UpdateActivity.class);
        startActivity(intent);
    }
}
