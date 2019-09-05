package com.example.photorepo.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.photorepo.R;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //getting the views of the particular views contained in the custom layout
        final EditText edt_email = findViewById(R.id.edt_email);
        final  EditText first_name = findViewById(R.id.first_name);
        final EditText last_name = findViewById(R.id.last_name);
        final  EditText Password = findViewById(R.id.Password);
        final Button btnregister = findViewById(R.id.dialog_btnRegister);
        final Spinner spinner1 = findViewById(R.id.spinner1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(),
                        "Selected : " + adapterView.getItemAtPosition(i).toString(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //get the edit_text and converted them into strings
        String email = edt_email.getText().toString();
        String fname = first_name.getText().toString();
        String lname = last_name.getText().toString();
        String pass = Password.getText().toString();

        //onclick listener
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this, "Its working !!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
