package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class setting extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener({

            Intent intent = new Intent(setting.this,resistance.class);
            startActivity(intent);
        });
    }
}
