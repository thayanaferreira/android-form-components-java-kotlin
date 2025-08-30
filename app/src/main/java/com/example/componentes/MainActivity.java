package com.example.componentes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    // RadioButton rbFeminino, rbMasculino;
    EditText edtNome, edtData;
    RadioGroup radioGrupoSexo;
    CheckBox checkFrontEnd, checkBacktEnd;
    Switch switchNotificacao;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.txtNome);
        edtData = (EditText) findViewById(R.id.txtData);
        radioGrupoSexo = (RadioGroup) findViewById(R.id.rdGroupSexo);
        checkFrontEnd = (CheckBox) findViewById(R.id.ckbFrontEnd);
        checkBacktEnd = (CheckBox) findViewById(R.id.ckbBackEnd);
        switchNotificacao = (Switch) findViewById(R.id.swNotificacao);
        btnEnviar = (Button) findViewById(R.id.cmdEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}