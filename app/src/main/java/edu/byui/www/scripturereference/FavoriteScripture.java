package edu.byui.www.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FavoriteScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_scripture);
        TextView t = (TextView)findViewById(R.id.textView);
        Intent ii = getIntent();
        Bundle ib = ii.getExtras();
        String a = "Your favorite scripture is: " +
                (String) ib.get("book") + " " +
                (String) ib.get("chapter") + ":" +
                (String) ib.get("verse") + ".";
        t.setText(a);
    }
}
