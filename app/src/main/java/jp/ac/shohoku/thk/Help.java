package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Help extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        Button button1 = (Button) findViewById(R.id.back);

        TextView text = findViewById(R.id.text);

        text.setText("あいうえお");
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Help.this, Start_Activity.class);

                startActivity(intent);
            }
        });
    }
}