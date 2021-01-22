package jp.ac.shohoku.thk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.Random;
import android.view.MotionEvent;
import android.widget.EditText;
import java.lang.String;



    public class MainActivity extends View {

        public String STR;
        boolean bool = false;

        Random random = new Random();

        public MainActivity(Context context, AttributeSet attrs) {
            super(context, attrs);

        }


        public class Test extends Activity {
            @Override
            protected void onCreate(Bundle icicle) {
                super.onCreate(icicle);

                EditText edit = new EditText(this);
                edit.setHeight(50);
                setContentView(edit);

                SpannableStringBuilder sb = (SpannableStringBuilder) edit.getText();
                String str = sb.toString();

                setSTR(str);
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint p1 = new Paint();
            Paint p2 = new Paint();
            Paint p3 = new Paint();
            Paint p4 = new Paint();

            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int num3 = random.nextInt(10);
            int num4 = random.nextInt(10);

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
                p3.setColor(Color.argb(255, 0, 0, 0));
            } else if (num4 == 1) {
                p3.setColor(Color.argb(255, 165, 42, 42));
            } else if (num4 == 2) {
                p3.setColor(Color.argb(255, 255, 0, 0));
            } else if (num4 == 3) {
                p3.setColor(Color.argb(255, 255, 165, 0));
            } else if (num4 == 4) {
                p3.setColor(Color.argb(255, 255, 255, 0));
            } else if (num4 == 5) {
                p3.setColor(Color.argb(255, 0, 128, 0));
            } else if (num4 == 6) {
                p3.setColor(Color.argb(255, 0, 0, 255));
            } else if (num4 == 7) {
                p3.setColor(Color.argb(255, 238, 130, 238));
            } else if (num4 == 8) {
                p3.setColor(Color.argb(255, 128, 128, 128));
            } else if (num4 == 9) {
                p3.setColor(Color.argb(255, 255, 255, 255));
            }

            if(num1 != 0 && num2 != 0 && num3 != 0){



            }

            canvas.drawRect(100,100,200,200,p1);
            canvas.drawRect(210,100,300,200,p2);
            canvas.drawRect(310,100,400,200,p3);
            canvas.drawRect(410,100,500,200,p4);

            String s = getSTR();
            int usrAnswer=0;
            int Answer=0;

             usrAnswer = ((num1*10 + num2)*(10^num3));

            if(s != null) {
                 Answer = Integer.valueOf(s);
            }

            if(usrAnswer == Answer){

                bool = true;

            }

        }



        public void setSTR(String str){
            STR = str;
        }

        public String getSTR() {
            return STR;
        }

    }