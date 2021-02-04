package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Start_Activity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        Intent intent = this.getIntent();

        // ボタンを押したときにイベントを取得できるようにする
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Start_Activity.this, Help.class);

                startActivity(intent);
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Start_Activity.this, Resistance.class);

                startActivity(intent);
            }
        });

    }
}
