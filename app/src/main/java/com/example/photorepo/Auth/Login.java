package com.example.photorepo.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.photorepo.ClientDashboard;
import com.example.photorepo.PhotographerDashboard;
import com.example.photorepo.R;

public class Login extends AppCompatActivity {
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //getting the views of the particular views contained in the custom layout
        final EditText edt_email = findViewById(R.id.lemail);
        final  EditText Password = findViewById(R.id.lpassword);
        final Button btn_login = findViewById(R.id.btn_login);

        spinner1 = findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int index = spinner1.getSelectedItemPosition();
                if (spinner1.getSelectedItem().toString().equalsIgnoreCase("Client")){
                    //set onclick listener
                    btn_login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Login.this, ClientDashboard.class);
                            startActivity(intent);

                        }
                    });

                } else if (spinner1.getSelectedItem().toString().equalsIgnoreCase("Photographer")){
                    btn_login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Login.this, PhotographerDashboard.class);
                            startActivity(intent);

                        }
                    });



                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //get the edit_text and converted them into strings
        String email = edt_email.getText().toString();
        String pass = Password.getText().toString();

    }
}
