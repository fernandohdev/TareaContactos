package com.android.curso.tareacontactos;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNombre = (EditText)findViewById(R.id.tietNombre);
        final EditText etNacimiento = (EditText)findViewById(R.id.tietNacimiento);
        final EditText etTelefono = (EditText)findViewById(R.id.tietTelefono);
        final EditText etEmail = (EditText)findViewById(R.id.tietEmail);
        final EditText etDescripcion = (EditText)findViewById(R.id.tietDescripcion);


        Button btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, confirmacionDatos.class);

                Bundle bundle = new Bundle();

                bundle.putString("KeyNombre", etNombre.getText().toString());
                bundle.putString("KeyNacimiento", etNacimiento.getText().toString());
                bundle.putString("KeyTelefono", etTelefono.getText().toString());
                bundle.putString("KeyEmail", etEmail.getText().toString());
                bundle.putString("KeyDescripcion", etDescripcion.getText().toString());
                intent.putExtras(bundle);

                startActivity(intent);  // <--- esta instruccion la lleva al nuevo activity

                //finish();
            }
        });




/*
        Bundle bundle2 = getIntent().getExtras();

        if( 0 <  bundle2.size() ) {
            etNombre.setText(bundle2.getString("KeyNombre"));
            etNacimiento.setText(bundle2.getString("KeyNacimiento"));
            etTelefono.setText(bundle2.getString("KeyTelefono"));
            etEmail.setText(bundle2.getString("KeyEmail"));
            etDescripcion.setText(bundle2.getString("KeyDescripcion"));
        }
*/


    }


    public void muestraDatePickerDialog(View v){
        DialogFragment frame = new DatePickerFragment();
        frame.show(getSupportFragmentManager(), "datePicker");
    }





}
