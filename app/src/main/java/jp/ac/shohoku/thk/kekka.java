package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class kekka extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kekka);

        Button button1 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(kekka.this, setting.class);


            startActivity(intent);
            }
        });
    }
}

