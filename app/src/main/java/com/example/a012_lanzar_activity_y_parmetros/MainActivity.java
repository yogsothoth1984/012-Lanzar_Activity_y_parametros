package com.example.a012_lanzar_activity_y_parmetros;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editWeb;
    private Button buttVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Vinculo
        editWeb=findViewById(R.id.edit_web_Id);
        buttVer= findViewById(R.id.butt_ver_Id);


    }
    public void ver(View viewVer){

        /**El método putExtra de la clase Intent. Tiene dos parámetros de tipo String, en el primero
         *  indicamos el "nombre del dato" y en el segundo el valor del dato. */
        Intent intentVer=new Intent(this,Activity2.class);
        intentVer.putExtra("DireccionWeb",editWeb.getText().toString());
        startActivity(intentVer);
    }
}
