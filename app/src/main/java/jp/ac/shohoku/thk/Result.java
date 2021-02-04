package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Result extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Intent intent1 = getIntent();
        String data = intent1.getStringExtra("KEY");

        TextView textView = findViewById(R.id.text);
        textView.setText(data);

        Button button1 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this, Start_Activity.class);

                startActivity(intent);
            }


        });
    }
}

