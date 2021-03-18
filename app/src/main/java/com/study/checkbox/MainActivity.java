package com.study.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox mobile, web, desktop, iot;
    private TextView textoresultado;
    private RadioButton genderFemale , genderMale;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Método chamado antes da interface ser carregada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoresultado = findViewById(R.id.textResultado);


        //Checkbox
        mobile = findViewById(R.id.checkMobile);
        web = findViewById(R.id.checkWeb);
        desktop = findViewById(R.id.checkDesktop);
        iot = findViewById(R.id.checkIOT);
        //Radiobutton
        genderFemale = findViewById(R.id.radioButtonFemale);
        genderMale = findViewById(R.id.radioButtonMale);



    }


    public void enviar (View view){
        radioButton();
        checkbox();
    }

    public void radioButton (){
        String message = null;
        if (genderFemale.isChecked()){
            message ="Be brave! Code like a girl! ";

        }
        if (genderMale.isChecked()){
            message ="You got it dude!";

        }

        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();

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