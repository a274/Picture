package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {


    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);

        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.FILL);
        int y = 1;
        while (y < canvas.getHeight()){
            canvas.drawLine(canvas.getWidth(), 0, 0, y, paint);
            y += 4;
        }
        paint.setColor(Color.RED);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.FILL);
        y = canvas.getHeight();
        while (y > 0){
            canvas.drawLine(0, canvas.getHeight(), canvas.getWidth(), y, paint);
            y -= 5;
        }
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        int x = canvas.getWidth();
        while (x > 0){
            canvas.drawLine( 0, 0, x ,canvas.getHeight(), paint);
            x -= 3;
        }
        paint.setColor(Color.rgb(168, 216, 255));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(80);
        canvas.drawRect(canvas.getWidth()/5, canvas.getHeight()/5, canvas.getWidth()/5*4, canvas.getHeight()/5*4, paint);

        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, 200, paint);

        paint.setColor(Color.rgb(249, 78, 75));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(canvas.getWidth()/5*2, canvas.getHeight()/5*2, 200, paint);
    }


}
