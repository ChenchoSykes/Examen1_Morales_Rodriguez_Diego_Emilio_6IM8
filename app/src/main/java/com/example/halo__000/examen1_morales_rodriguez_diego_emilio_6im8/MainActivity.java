package com.example.halo__000.examen1_morales_rodriguez_diego_emilio_6im8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText Datos;
    Double resultado;
    Double Numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Datos = (EditText) findViewById(R.id.Datos);

    }

    public void Convertir(View v){
        if(Datos.getText().toString().equals("")){
            Toast toast =  Toast.makeText(getApplicationContext(), "No se detecto numero", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Intent envia = new Intent(this, MainActivity2.class);
            Bundle datos = new Bundle();
            Numero = Double.parseDouble(Datos.getText().toString());
            resultado = (Numero / 15);
            datos.putDouble("Numero", resultado);
            envia.putExtras(datos);
            finish();
            startActivity(envia);
        }
    }
}
