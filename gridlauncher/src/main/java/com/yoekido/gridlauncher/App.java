package com.yoekido.gridlauncher;


import android.app.Application;
import android.graphics.drawable.Drawable;

public class App {
    public static Application application;
    public Drawable icon;
    public String name;

    App(int icon, String name) {
        this.icon = application.getResources().getDrawable(icon);
        this.name = name;
    }
}