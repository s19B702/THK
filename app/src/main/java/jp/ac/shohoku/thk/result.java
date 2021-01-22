package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class result extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(result.this, help.class);

            startActivity(intent);
            }
        });
    }
}

