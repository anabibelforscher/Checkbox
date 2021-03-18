package com.study.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox mobile, web, desktop, iot;
    private TextView textoresultado;
    private RadioButton genderFemale , genderMale;
    private RadioGroup genderOption;
    private ImageView developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Método chamado antes da interface ser carregada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoresultado = findViewById(R.id.textResultado);
        developer = findViewById(R.id.imageDev);


        //Checkbox
        mobile = findViewById(R.id.checkMobile);
        web = findViewById(R.id.checkWeb);
        desktop = findViewById(R.id.checkDesktop);
        iot = findViewById(R.id.checkIOT);
        //Radiobutton
        genderFemale = findViewById(R.id.radioButtonFemale);
        genderMale = findViewById(R.id.radioButtonMale);
        //RadioGroup
        genderOption = findViewById(R.id.radioGroupGender);

        radioGroup();


    }


    public void enviar (View view){
        radioButton();
        checkbox();
    }

    public void radioGroup (){
        genderOption.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            String toastMsg =null;
            int duration = Toast.LENGTH_LONG;
              if (checkedId == R.id.radioButtonFemale){
                  toastMsg = "Be brave! Code like a girl! ";

              } else if (checkedId == R.id.radioButtonMale){
                  toastMsg = "You got it dude!";

              }
                Toast msg = Toast.makeText(getApplicationContext(),toastMsg,Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }

    public void radioButton (){

        if (genderFemale.isChecked()){
            developer.setImageResource(R.drawable.keepcoding);
        }
        else if (genderMale.isChecked()){
            developer.setImageResource(R.drawable.codeon);

        }

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
        developer.setImageResource(R.drawable.dev);
    }


}