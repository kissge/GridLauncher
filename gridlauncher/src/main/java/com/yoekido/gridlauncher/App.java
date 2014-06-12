package com.yoekido.gridlauncher;


import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class App {
    public static Application application;
    public Drawable icon;
    public String name;

    App(int icon, String name) {
        this.icon = application.getResources().getDrawable(icon);
        this.name = name;
    }

    App(String name, int color) {
        Bitmap bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(color | 0xff000000);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
        this.icon = new BitmapDrawable(application.getResources(), bitmap);
        this.name = name;
    }
}