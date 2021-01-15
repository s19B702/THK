package jp.ac.shohoku.thk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.icu.text.IDNA;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.Random;
import android.view.MotionEvent;


    public class MainActivity extends View {


        public int num1 = 0;
        public int num2 = 0;
        public int num3 = 0;
        public int num4 = 0;

        Random random = new Random();

        public MainActivity(Context context, AttributeSet attrs) {
            super(context, attrs);

        }

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint p1 = new Paint();
            Paint p2 = new Paint();
            Paint p3 = new Paint();
            Paint p4 = new Paint();

            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
            num3 = random.nextInt(10);
            num4 = random.nextInt(10);

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

            canvas.drawRect(100,100,200,200,p1);
            canvas.drawRect(210,100,300,200,p2);
            canvas.drawRect(310,100,400,200,p3);
            canvas.drawRect(410,100,500,200,p4);


        }
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();

            //長方形の内部で

            invalidate(); //再描画
            return super.onTouchEvent(event);
        }
    }