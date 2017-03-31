package com.example.halo__000.examen1_morales_rodriguez_diego_emilio_6im8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by halo-_000 on 30/03/2017.
 */


public class MainActivity2 extends Activity {

    Double NumeroRec;
    TextView msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msj = (TextView) findViewById(R.id.Muestrame);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        NumeroRec = recibe.getDouble("Numero");
        msj.setText("Nombre: Morales Diego(Chencho)" + "\n" +
                "Resultado: " + NumeroRec.toString()
        );
    }

    public void Correo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Morales Diego(Chencho)    Resultado: " + NumeroRec );
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }
}