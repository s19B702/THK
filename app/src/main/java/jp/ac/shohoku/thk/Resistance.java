package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class Resistance extends Activity {

    public String STR;
    public int Use_Ans ;
    public int Alr_Ans ;


    public class Set_resistance_value extends View {

        Random random = new Random();
        Paint p1 = new Paint();
        Paint p2 = new Paint();
        Paint p3 = new Paint();
        Paint p4 = new Paint();

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int num3 = random.nextInt(10);
        int num4 = random.nextInt(10);



        public Set_resistance_value(Context context) {
            super(context);
        }


        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);


            while (true) {

                if (num1 == 0) {
                    random.nextInt(10);
                }

                if (num1 != 0) {
                    break;
                }
            }



            if (num1 == 1) {
                p1.setColor(Color.argb(255, 165, 42, 42));
            } else if (num1 == 2) {
                p1.setColor(Color.argb(255, 255, 0, 0));
            } else if (num1 == 3) {
                p1.setColor(Color.argb(255, 255, 165, 0));
            } else if (num1 == 4) {
                p1.setColor(Color.argb(255, 255, 255, 0));
            } else if (num1 == 5) {
                p1.setColor(Color.argb(255, 0, 128, 0));
            } else if (num1 == 6) {
                p1.setColor(Color.argb(255, 0, 0, 255));
            } else if (num1 == 7) {
                p1.setColor(Color.argb(255, 238, 130, 238));
            } else if (num1 == 8) {
                p1.setColor(Color.argb(255, 128, 128, 128));
            } else if (num1 == 9) {
                p1.setColor(Color.argb(255, 255, 255, 255));
            }

            if (num2 == 0) {
                p2.setColor(Color.argb(255, 0, 0, 0));
            } else if (num2 == 1) {
                p2.setColor(Color.argb(255, 165, 42, 42));
            } else if (num2 == 2) {
                p2.setColor(Color.argb(255, 255, 0, 0));
            } else if (num2 == 3) {
                p2.setColor(Color.argb(255, 255, 165, 0));
            } else if (num2 == 4) {
                p2.setColor(Color.argb(255, 255, 255, 0));
            } else if (num2 == 5) {
                p2.setColor(Color.argb(255, 0, 128, 0));
            } else if (num2 == 6) {
                p2.setColor(Color.argb(255, 0, 0, 255));
            } else if (num2 == 7) {
                p2.setColor(Color.argb(255, 238, 130, 238));
            } else if (num2 == 8) {
                p2.setColor(Color.argb(255, 128, 128, 128));
            } else if (num2 == 9) {
                p2.setColor(Color.argb(255, 255, 255, 255));
            }

            if (num3 == 0) {
                p3.setColor(Color.argb(255, 0, 0, 0));
            } else if (num3 == 1) {
                p3.setColor(Color.argb(255, 165, 42, 42));
            } else if (num3 == 2) {
                p3.setColor(Color.argb(255, 255, 0, 0));
            } else if (num3 == 3) {
                p3.setColor(Color.argb(255, 255, 165, 0));
            } else if (num3 == 4) {
                p3.setColor(Color.argb(255, 255, 255, 0));
            } else if (num3 == 5) {
                p3.setColor(Color.argb(255, 0, 128, 0));
            } else if (num3 == 6) {
                p3.setColor(Color.argb(255, 0, 0, 255));
            } else if (num3 == 7) {
                p3.setColor(Color.argb(255, 238, 130, 238));
            } else if (num3 == 8) {
                p3.setColor(Color.argb(255, 128, 128, 128));
            } else if (num3 == 9) {
                p3.setColor(Color.argb(255, 255, 255, 255));
            }

            if (num4 == 0) {
                p4.setColor(Color.argb(255, 0, 0, 0));
            } else if (num4 == 1) {
                p4.setColor(Color.argb(255, 165, 42, 42));
            } else if (num4 == 2) {
                p4.setColor(Color.argb(255, 255, 0, 0));
            } else if (num4 == 3) {
                p4.setColor(Color.argb(255, 255, 165, 0));
            } else if (num4 == 4) {
                p4.setColor(Color.argb(255, 255, 255, 0));
            } else if (num4 == 5) {
                p4.setColor(Color.argb(255, 0, 128, 0));
            } else if (num4 == 6) {
                p4.setColor(Color.argb(255, 0, 0, 255));
            } else if (num4 == 7) {
                p4.setColor(Color.argb(255, 238, 130, 238));
            } else if (num4 == 8) {
                p4.setColor(Color.argb(255, 128, 128, 128));
            } else if (num4 == 9) {
                p4.setColor(Color.argb(255, 255, 255, 255));
            }


            canvas.drawRect(200, 200, 200, 200, p1);
            canvas.drawRect(310, 300, 300, 200, p2);
            canvas.drawRect(410, 400, 400, 200, p3);
            canvas.drawRect(510, 500, 500, 200, p4);

            String s = getSTR();

            setUse_Ans((num1 * 10 + num2) * (10 ^ num3));

            if (s != null) {
                setAlr_Ans(Integer.valueOf(s));
            }
        }
    }


    @Override
    //入力テキスト欄を作成したりする
    //クリックしたときの処理を行う場所
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resistance);


        final EditText editText = (EditText) findViewById(R.id.editText1); //edittextの値を格納
        Button button4 = (Button) findViewById(R.id.button4);                //ボタンの状態を格納
        final TextView textView = (TextView) findViewById(R.id.Text1);     //textの中身を格納

        button4.setOnClickListener(new OnClickListener() {  //ボタンが押されたときの処理

            public void onClick(View view) {
                String text = editText.getText().toString();

                Alr_Ans = getAlr_Ans();
                Use_Ans = getUse_Ans();

                if (Alr_Ans != 0 && Use_Ans != 0) {

                    if (!text.equals("")) {
                        textView.setText(text);
                        editText.setText("");
                    }

                    if (Alr_Ans == Use_Ans) {
                        Intent intent = new Intent(Resistance.this, Result.class);
                        intent.putExtra("KEY", text);
                        startActivity(intent);

                        setSTR(text);
                    }

                } else {
                    Intent intent = new Intent(Resistance.this, Start_Activity.class);
                    startActivity(intent);

                    setSTR(text);
                }

            }


        });
    }


    public void setSTR(String str) {
        STR = str;
    }

    public String getSTR() {
        return STR;
    }

    public void setUse_Ans(int usr_ans) {
        Use_Ans = usr_ans;
    }

    public int getUse_Ans() {
        return Use_Ans;
    }

    public void setAlr_Ans(int alr_Ans) {
        Alr_Ans = alr_Ans;
    }

    public int getAlr_Ans() {
        return Alr_Ans;
    }
}


