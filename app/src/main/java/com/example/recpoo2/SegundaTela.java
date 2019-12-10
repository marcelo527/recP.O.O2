package com.example.recpoo2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
    }
    AdapterView.OnItemClickListener itemClicado = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
            if (position == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("parabéns, você acertou!!");
                builder.setMessage("Você será direcionado para o Final do questionário");
                DialogInterface.OnClickListener opcao = new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog,int which) {
                        Intent intent = new Intent(getBaseContext(),TerceiraTela.class);
                        startActivity(intent);

                    }
                };
                builder.setPositiveButton("OK",opcao);
                builder.create().show();

            } else {
                Toast.makeText(SegundaTela.this, "Resposta incorreta!! Tente Novamente", Toast.LENGTH_SHORT).show();
            }
        }

    };
    ListView listView = (ListView) findViewById(R.id.SegundaLista);
    listView.setOnItemClickListener(itemClicado);


}

