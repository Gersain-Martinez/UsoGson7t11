package com.gmh.itics.tesoem.edu.usogson7t11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre, txtedad, txtcorreo, txtcurp;
    TextView lbljson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txtcorreo = findViewById(R.id.txtcorreo);
        txtcurp = findViewById(R.id.txtcurp);

        lbljson = findViewById(R.id.lbljson);
    }
    public void btncargamos(View v ){
        Datos datosobj = new Datos(txtnombre.getText().toString(),Integer.parseInt(txtedad.getText().toString()),txtcorreo.getText().toString(),txtcurp.getText().toString());
        Gson gson = new Gson();
        String cJson = gson.toJson(datosobj);
        lbljson.setText(cJson);
        Datos datosobjl = gson.fromJson(cJson,Datos.class);
        Log.i("informacion de Json...","nombre"+ datosobj.getNombre()+ ",Edad"+datosobj.getEdad()+"Correo"+datosobj.getCorreo()+"curp"+datosobj.getCURP());
    }
}
