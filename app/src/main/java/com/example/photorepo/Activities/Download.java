package com.example.photorepo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.photorepo.Adapters.ClientAdapter;
import com.example.photorepo.Adapters.ImageAdapter;
import com.example.photorepo.Payment.Mpesa;
import com.example.photorepo.R;

public class Download extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        Button btn_download = findViewById(R.id.btn_download);
        btn_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Download.this, Mpesa.class);
                startActivity(intent);
            }
        });

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ClientAdapter clientAdapter = new ClientAdapter(this);

        ImageView imageView = findViewById(R.id.full_image_view);
        imageView.setImageResource(clientAdapter.ImageIds[position]);
    }
}
