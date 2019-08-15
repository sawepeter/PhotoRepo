package com.example.photorepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.photorepo.Acitivities.FullImage;
import com.example.photorepo.Adapters.ImageAdapter;
import com.example.photorepo.Adapters.Month_Adapter;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GridView gridView = findViewById(R.id.grid_recent);
        GridView grid_month = findViewById(R.id.grid_month);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
        grid_month.setAdapter(new Month_Adapter(this));


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
