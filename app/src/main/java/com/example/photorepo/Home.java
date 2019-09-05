package com.example.photorepo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.photorepo.Activities.FullImage;
import com.example.photorepo.Adapters.ImageAdapter;
import com.example.photorepo.Adapters.Month_Adapter;
import com.example.photorepo.Auth.Login;
import com.example.photorepo.Auth.SignUp;

public class Home extends AppCompatActivity {

    Button btn_login,btn_sign_up;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btn_login = findViewById(R.id.btn_login);
        btn_sign_up = findViewById(R.id.btn_sign_up);


        GridView gridView = findViewById(R.id.grid_recent);
        GridView grid_month = findViewById(R.id.grid_month);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
        grid_month.setAdapter(new Month_Adapter(this));

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Home.this, SignUp.class);
               startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Home.this, Login.class);
               startActivity(intent);
            }
        });


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullImage.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });

        grid_month.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullImage.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}
