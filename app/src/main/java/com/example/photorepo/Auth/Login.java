package com.example.photorepo.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.photorepo.ClientDashboard;
import com.example.photorepo.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //getting the views of the particular views contained in the custom layout
        final EditText edt_email = findViewById(R.id.lemail);
        final  EditText Password = findViewById(R.id.lpassword);
        final Button btn_login = findViewById(R.id.btn_login);

        //get the edit_text and converted them into strings
        String email = edt_email.getText().toString();
        String pass = Password.getText().toString();

        //set onclick listener
                btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, ClientDashboard.class);
                startActivity(intent);

            }
        });
    }
}
