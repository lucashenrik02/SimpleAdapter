package br.com.example.meuprimeiroexemplo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.example.meuprimeiroexemplo.R;

public class PostActivity extends AppCompatActivity {

    EditText txtUserId;
    EditText txtTitle;
    EditText txtBody;
    ListView listViewPost;

    List<HashMap<String, String>> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }

    public void adicionarPost(View view) {
        //Entrada
       txtUserId = findViewById(R.id.txtUserId);
       txtTitle = findViewById(R.id.txtTitle);
       txtBody = findViewById(R.id.txtBody);

        // Processamento
        String userId, title, body;
        userId = txtUserId.getText().toString();
        title = txtTitle.getText().toString();
        body = txtBody.getText().toString();

        HashMap<String, String> map = new HashMap<>();
        map.put("userId", userId);
        map.put("title", title);
        map.put("body", body);

        lista.add(map);

        // Saída

        String[] from = {"userId", "title", "body"};
        int[] to = {R.id.txtItemUserId, R.id.txtItemTitle, R.id.txtItemBody};
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, lista, R.layout.item_post, from, to);

        listViewPost = findViewById(R.id.listViewPost);
        listViewPost.setAdapter(simpleAdapter);
    }
}