package com.example.photorepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.photorepo.Activities.Download;
import com.example.photorepo.Activities.FullImage;
import com.example.photorepo.Adapters.ClientAdapter;
import com.example.photorepo.Adapters.ImageAdapter;

public class ClientDashboard extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_dashboard);

        GridView gridView = findViewById(R.id.my_pictures);
        // Instance of ImageAdapter Class
        gridView.setAdapter(new ClientAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), Download.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });

    }
}
