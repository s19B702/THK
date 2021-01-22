package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class resistance extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resistance);

        Button button4= (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(resistance.this, kekka.class);

                startActivity(intent);
            }
        });

    }
}
