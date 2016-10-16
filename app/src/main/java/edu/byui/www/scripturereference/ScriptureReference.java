package edu.byui.www.scripturereference;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ScriptureReference extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture_reference);

        Button submit = (Button)findViewById(R.id.buttonSubmit);
        final EditText scriptBook = (EditText)findViewById(R.id.scriptureBook);
        final EditText scriptChapter = (EditText)findViewById(R.id.chapter);
        final EditText scriptVerse = (EditText)findViewById(R.id.verse);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent favorite = new Intent(ScriptureReference.this, FavoriteScripture.class);
                String bk = scriptBook.getText().toString();
                String ch = scriptChapter.getText().toString();
                String vs = scriptVerse.getText().toString();
                favorite.putExtra("book", bk);
                favorite.putExtra("chapter", ch);
                favorite.putExtra("verse", vs);
                startActivity(favorite);
            }
        });

    }
}