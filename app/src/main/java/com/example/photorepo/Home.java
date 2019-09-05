package com.example.photorepo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.photorepo.Acitivities.FullImage;
import com.example.photorepo.Adapters.ImageAdapter;
import com.example.photorepo.Adapters.Month_Adapter;

public class Home extends AppCompatActivity {

    Button btn_login,btn_sign_up;
    final Context context = this;
    private Spinner spinner1;

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
                RegisterDialog();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginDialog();
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

    private void LoginDialog() {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(context);

        //inflate my custom layout below
        LayoutInflater inflater = LayoutInflater.from(this);
        View login_layout = inflater.inflate(R.layout.login_layout,null);

        //getting the views of the particular views contained in the custom layout
        //getting the views of the particular views contained in the custom layout
        final EditText edt_email = login_layout.findViewById(R.id.lemail);
        final  EditText Password = login_layout.findViewById(R.id.lpassword);
        final Button btn_login = login_layout.findViewById(R.id.btn_login);

        //get the edit_text and converted them into strings
        String email = edt_email.getText().toString();
        String pass = Password.getText().toString();

        //set onclick listener
        btn_login
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        dialog.setView(login_layout);
        dialog.show();
    }

    private void RegisterDialog() {

        final AlertDialog.Builder dialog = new AlertDialog.Builder(context);

        //inflate my custom layout below
        LayoutInflater inflater = LayoutInflater.from(this);
        View register_layout = inflater.inflate(R.layout.signup_layout,null);

        //getting the views of the particular views contained in the custom layout
        final EditText edt_email = register_layout.findViewById(R.id.edt_email);
        final  EditText first_name = register_layout.findViewById(R.id.first_name);
        final EditText last_name = register_layout.findViewById(R.id.last_name);
        final  EditText Password = register_layout.findViewById(R.id.Password);
        final Button btnregister = register_layout.findViewById(R.id.dialog_btnRegister);

        //get the edit_text and converted them into strings
        String email = edt_email.getText().toString();
        String fname = first_name.getText().toString();
        String lname = last_name.getText().toString();
        String pass = Password.getText().toString();

        //onclick listener
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Its working !!!!", Toast.LENGTH_SHORT).show();
            }
        });





        dialog.setView(register_layout);
        dialog.show();
    }
}
