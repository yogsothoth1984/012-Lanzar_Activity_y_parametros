package com.example.a012_lanzar_activity_y_parmetros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
/**Como nuestra aplicación debe acceder a internet debemos hacer una configuración en el archivo "AndroidManifest.xml",
 * Agregamos el permiso tipeando lo siguiente en este archivo:
 * <uses-permission android:name="android.permission.INTERNET" /> */

public class Activity2 extends AppCompatActivity {
    private WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        web1=findViewById(R.id.web1_Id);

        Bundle bundleAct2=getIntent().getExtras();
        /**La variable de tipo Bundle es inicializamos y llamamos al método getExtras() de la clase Intent
         *  (esto lo hacemos para recuperar el o los parámetros que envió la otra actividad (Activity))*/

        String datoWeb=bundleAct2.getString("DireccionWeb");
        web1.loadUrl("http://"+datoWeb+".com");
        /**El método loadUrl de la clase WebView permite visualizar el contenido de un sitio web.*/
    }
    public void finalizar(View viewFinalizar){
        finish();
    }
}
