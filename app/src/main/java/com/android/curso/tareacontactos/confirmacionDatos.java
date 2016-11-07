package com.android.curso.tareacontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmacionDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);


        final TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        final TextView tvNacimiento = (TextView) findViewById(R.id.tvNacimiento);
        final TextView tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        final TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
        final TextView tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        Bundle bundle = getIntent().getExtras();

        tvNombre.setText(bundle.getString("KeyNombre"));
        tvNacimiento.setText(bundle.getString("KeyNacimiento"));
        tvTelefono.setText(bundle.getString("KeyTelefono"));
        tvEmail.setText(bundle.getString("KeyEmail"));
        tvDescripcion.setText(bundle.getString("KeyDescripcion"));






        Button btnEditar = (Button) findViewById(R.id.btnEditar);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(confirmacionDatos.this, MainActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("KeyNombre2", tvNombre.getText().toString());
                bundle.putString("KeyNacimiento2", tvNacimiento.getText().toString());
                bundle.putString("KeyTelefono2", tvTelefono.getText().toString());
                bundle.putString("KeyEmail2", tvEmail.getText().toString());
                bundle.putString("KeyDescripcion2", tvDescripcion.getText().toString());
                intent.putExtras(bundle);

                startActivity(intent);  // <--- esta instruccion la lleva al anterior activity

            }
        });





    }
}
