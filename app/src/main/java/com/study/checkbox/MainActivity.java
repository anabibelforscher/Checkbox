package com.study.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox mobile, web, desktop, iot;
    private TextView textoresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Método chamado antes da interface ser carregada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobile = findViewById(R.id.checkMobile);
        web = findViewById(R.id.checkWeb);
        desktop = findViewById(R.id.checkDesktop);
        iot = findViewById(R.id.checkIOT);
        textoresultado = findViewById(R.id.textResultado);


    }


    public void enviar (View view){
        checkbox();
    }

    private void checkbox() {
        String texto = null;

        if (mobile.isChecked()){
            texto =" - Dev Mobile";

        }if (web.isChecked()){
            texto = texto + " - Dev Web";

        }if (desktop.isChecked()){
            texto = texto +" - Dev Desktop";

        }if (iot.isChecked()){
            texto = texto + " - Dev IOT";

        }

        textoresultado.setText(texto);
    }

    public void limpar (View view){
        textoresultado.setText("");
    }


}