package jp.ac.shohoku.thk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class resistance extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resistance);

        final EditText  editText = (EditText) findViewById(R.id.editText1);
        Button button4= (Button) findViewById(R.id.button4);
        final TextView  textView = (TextView) findViewById(R.id.Text1);

        button4.setOnClickListener(new OnClickListener() {

         public void onClick(View view){
             String text = editText.getText().toString();
             if(!text.equals("")){
                 textView.setText(text);
                 editText.setText("");
                 Toast.makeText(textView.getContext(),text,Toast.LENGTH_SHORT).show();

                 Intent intent = new Intent(resistance.this, kekka.class);
                 intent.putExtra("KEY",text);
                 startActivity(intent);

             }
             else{
                 Toast.makeText(textView.getContext(),"入力してください",Toast.LENGTH_SHORT);
             }
         }

         //「edit text」に格納したテキストの値をputExtraを使用してMainActivityで使いたい。



        });
}
    }



