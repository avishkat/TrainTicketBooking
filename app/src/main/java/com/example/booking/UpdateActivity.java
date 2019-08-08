package com.example.booking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {
    Button btnupdate,btndelete,btnview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        btnupdate = findViewById(R.id.btnUpdate);
        btndelete = findViewById(R.id.btnDelete);
        btnview = findViewById(R.id.btnView3);

        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewActivity();
            }
        });
    }

    public void openViewActivity(){
        Intent intent = new Intent(this,ViewActivity.class);
        startActivity(intent);
    }

    public void displayToastUpdate(View v){
        Toast.makeText(UpdateActivity.this,"Updated successfully",Toast.LENGTH_SHORT).show();
    }

    public void displayToastDelete(View v){
        Toast.makeText(UpdateActivity.this,"Deleted successfully",Toast.LENGTH_SHORT).show();
    }
}
