package com.udemy.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // instancias
    private EditText edtNumero;
    private Button btnDescobrir;
    private TextView txtResultado;

    // variaveis
    private int idade, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binds
        edtNumero = findViewById(R.id.edtNumeroId);
        txtResultado = findViewById(R.id.txtResultadoId);
        btnDescobrir = findViewById(R.id.btnDescobrirId);

        btnDescobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!edtNumero.getText().toString().isEmpty()) {

                    idade = Integer.parseInt(edtNumero.getText().toString());

                    resultado = idade * 7;

                    txtResultado.setText(String.valueOf(resultado)+" anos humanos");
                }else {
                    txtResultado.setText("Digite um número");
                }

            }
        });
    }
}
