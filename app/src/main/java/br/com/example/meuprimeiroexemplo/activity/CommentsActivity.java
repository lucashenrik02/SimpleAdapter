package br.com.example.meuprimeiroexemplo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.example.meuprimeiroexemplo.R;

public class CommentsActivity extends AppCompatActivity {

    EditText txtCommentsId;
    EditText txtName;
    EditText txtEmail;
    EditText txtCommentsBody;

    ListView listViewComments;

    List<HashMap<String, String>> listaComments = new ArrayList<>(); //pega lista do usuário

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
    }

    public void adicionarComments(View view) {
        txtCommentsId = findViewById(R.id.txtCommentsId);
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtCommentsBody = findViewById(R.id.txtCommentsBody);


        String IdComments, NameComments, EmailComments, BodyComments;

        IdComments = txtCommentsId.getText().toString();
        NameComments = txtName.getText().toString();
        EmailComments = txtEmail.getText().toString();
        BodyComments = txtCommentsBody.getText().toString();

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("IdComments", IdComments);
        map2.put("NameComments", NameComments);
        map2.put("EmailComments", EmailComments);
        map2.put("BodyComments", BodyComments);

        listaComments.add(map2);


        String[] from = {"IdComments", "NameComments", "EmailComments", "BodyComments"};
        int[] to = {R.id.txtItemCommentsId, R.id.txtItemName, R.id.txtItemEmail, R.id.txtItemCommentsBody};
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listaComments, R.layout.item_comments, from, to);

        listViewComments = findViewById(R.id.listViewComments);
        listViewComments.setAdapter(simpleAdapter);
    }
}