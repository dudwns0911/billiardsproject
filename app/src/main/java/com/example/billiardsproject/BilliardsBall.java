package com.example.billiardsproject;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class BilliardsBall extends View {
    private ShapeDrawable mDrawable;

    int x = 0;
    int y = 0;
    int width =300;
    int height = 300;

    int cx, cy;

    int dir_x = 1;
    int dir_y = 1;

    int dx = 100;
    int dy = 100;

    int screen_width = Resources.getSystem().getDisplayMetrics().widthPixels;
    int screen_height = Resources.getSystem().getDisplayMetrics().heightPixels;

    public BilliardsBall(Context context) {
        super(context);

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(Color.GREEN);
    }

    protected void onDraw(Canvas canvas)
    {
        cx = x + width / 2;
        cy = y + height / 2;

        if (cx <= width /2)
            dir_x = 1;
        else if(cx >= screen_width - (width / 2))
            dir_x = -1;

        if (cy <= height /2)
            dir_y = 1;
        else if (cy >= screen_height - (height /2))
            dir_y = -1;

        x += dir_x *dx;
        y += dir_y *dy;

        canvas.drawColor(Color.WHITE);

        mDrawable.setBounds(x,y, x + width, y +height);
        mDrawable.draw(canvas);

        invalidate();
    }
}
