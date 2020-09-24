package br.com.example.meuprimeiroexemplo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.example.meuprimeiroexemplo.R;
import br.com.example.meuprimeiroexemplo.debug.DebugActivity;

import static android.widget.Toast.*;

public class PessoaActivity extends DebugActivity {

    EditText textNome;
    EditText textSobreNome;
    EditText textApelido;
    EditText textEmail;
    EditText textPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);
    }

    public void exibir(View view) {
        // Entrada
        textNome = findViewById(R.id.textNome);
        textSobreNome = findViewById(R.id.textSobreNome);
        textApelido = findViewById(R.id.textApelido);
        textEmail = findViewById(R.id.textEmail);
        textPhone = findViewById(R.id.textPhone);

        // Processamento
        String nome,sobrenome,email,telefone,apelido;
        nome = textNome.getText().toString();
        sobrenome = textSobreNome.getText().toString();
        apelido = textApelido.getText().toString();
        email = textEmail.getText().toString();
        telefone = textPhone.getText().toString();
        //Saída
        String dados;
        dados = String.format("Os valores informados foram: \n%s\n%s\n%s\n%s", nome,sobrenome,apelido,email,telefone);

        //Exibir dados para o usuário

        makeText(getApplication(),dados, LENGTH_LONG).show();
    }
}