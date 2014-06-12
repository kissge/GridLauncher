package com.yoekido.gridlauncher;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class IconAdapter extends BaseAdapter {
    private Context context;
    private List<App> list;

    IconAdapter(Context context, Application application) {
        this.context = context;
        App.application = application;
        this.list = Arrays.asList(
                new App(android.R.drawable.ic_menu_camera, "Camera"),
                new App(android.R.drawable.ic_menu_compass, "Compass"),
                new App(android.R.drawable.ic_menu_call, "Call"),
                new App(android.R.drawable.ic_menu_month, "Calendar"),
                new App(android.R.drawable.ic_menu_myplaces, "Check-in"),
                new App(android.R.drawable.ic_dialog_email, "Mail"),
                new App(android.R.drawable.ic_menu_edit, "Memo"),
                new App(android.R.drawable.ic_menu_mapmode, "Map"),
                new App(android.R.drawable.ic_media_play, "Play"),
                new App(android.R.drawable.ic_media_pause, "Pause"),
                new App(android.R.drawable.ic_menu_gallery, "Picture"),
                new App(android.R.drawable.ic_menu_share, "Share"),
                new App(android.R.drawable.ic_menu_search, "Search"),
                new App(android.R.drawable.ic_menu_preferences, "Settings"),
                new App(android.R.drawable.ic_menu_save, "Save"),
                new App(android.R.drawable.ic_menu_camera, "Camera"),
                new App(android.R.drawable.ic_menu_compass, "Compass"),
                new App(android.R.drawable.ic_menu_call, "Call"),
                new App(android.R.drawable.ic_menu_month, "Calendar"),
                new App(android.R.drawable.ic_menu_myplaces, "Check-in"),
                new App(android.R.drawable.ic_dialog_email, "Mail"),
                new App(android.R.drawable.ic_menu_edit, "Memo"),
                new App(android.R.drawable.ic_menu_mapmode, "Map"),
                new App(android.R.drawable.ic_media_play, "Play"),
                new App(android.R.drawable.ic_media_pause, "Pause"),
                new App(android.R.drawable.ic_menu_gallery, "Picture"),
                new App(android.R.drawable.ic_menu_share, "Share"),
                new App(android.R.drawable.ic_menu_search, "Search"),
                new App(android.R.drawable.ic_menu_preferences, "Settings"),
                new App(android.R.drawable.ic_menu_save, "Save"),
                new App(android.R.drawable.ic_menu_camera, "Camera"),
                new App(android.R.drawable.ic_menu_compass, "Compass"),
                new App(android.R.drawable.ic_menu_call, "Call"),
                new App(android.R.drawable.ic_menu_month, "Calendar"),
                new App(android.R.drawable.ic_menu_myplaces, "Check-in"),
                new App(android.R.drawable.ic_dialog_email, "Mail"),
                new App(android.R.drawable.ic_menu_edit, "Memo"),
                new App(android.R.drawable.ic_menu_mapmode, "Map"),
                new App(android.R.drawable.ic_media_play, "Play"),
                new App(android.R.drawable.ic_media_pause, "Pause"),
                new App(android.R.drawable.ic_menu_gallery, "Picture"),
                new App(android.R.drawable.ic_menu_share, "Share"),
                new App(android.R.drawable.ic_menu_search, "Search"),
                new App(android.R.drawable.ic_menu_preferences, "Settings"),
                new App(android.R.drawable.ic_menu_save, "Save"),
                new App(android.R.drawable.ic_menu_camera, "Camera"),
                new App(android.R.drawable.ic_menu_compass, "Compass"),
                new App(android.R.drawable.ic_menu_call, "Call"),
                new App(android.R.drawable.ic_menu_month, "Calendar"),
                new App(android.R.drawable.ic_menu_myplaces, "Check-in"),
                new App(android.R.drawable.ic_dialog_email, "Mail"),
                new App(android.R.drawable.ic_menu_edit, "Memo"),
                new App(android.R.drawable.ic_menu_mapmode, "Map"),
                new App(android.R.drawable.ic_media_play, "Play"),
                new App(android.R.drawable.ic_media_pause, "Pause"),
                new App(android.R.drawable.ic_menu_gallery, "Picture"),
                new App(android.R.drawable.ic_menu_share, "Share"),
                new App(android.R.drawable.ic_menu_search, "Search"),
                new App(android.R.drawable.ic_menu_preferences, "Settings"),
                new App(android.R.drawable.ic_menu_save, "Save"),
                new App(android.R.drawable.ic_menu_camera, "Camera"),
                new App(android.R.drawable.ic_menu_compass, "Compass"),
                new App(android.R.drawable.ic_menu_call, "Call"),
                new App(android.R.drawable.ic_menu_month, "Calendar"),
                new App(android.R.drawable.ic_menu_myplaces, "Check-in"),
                new App(android.R.drawable.ic_dialog_email, "Mail"),
                new App(android.R.drawable.ic_menu_edit, "Memo"),
                new App(android.R.drawable.ic_menu_mapmode, "Map"),
                new App(android.R.drawable.ic_media_play, "Play"),
                new App(android.R.drawable.ic_media_pause, "Pause"),
                new App(android.R.drawable.ic_menu_gallery, "Picture"),
                new App(android.R.drawable.ic_menu_share, "Share"),
                new App(android.R.drawable.ic_menu_search, "Search"),
                new App(android.R.drawable.ic_menu_preferences, "Settings"),
                new App(android.R.drawable.ic_menu_save, "Save"),
                new App(android.R.drawable.ic_menu_camera, "Camera"),
                new App(android.R.drawable.ic_menu_compass, "Compass"),
                new App(android.R.drawable.ic_menu_call, "Call"),
                new App(android.R.drawable.ic_menu_month, "Calendar"),
                new App(android.R.drawable.ic_menu_myplaces, "Check-in"),
                new App(android.R.drawable.ic_dialog_email, "Mail"),
                new App(android.R.drawable.ic_menu_edit, "Memo"),
                new App(android.R.drawable.ic_menu_mapmode, "Map"),
                new App(android.R.drawable.ic_media_play, "Play"),
                new App(android.R.drawable.ic_media_pause, "Pause"),
                new App(android.R.drawable.ic_menu_gallery, "Picture"),
                new App(android.R.drawable.ic_menu_share, "Share"),
                new App(android.R.drawable.ic_menu_search, "Search"),
                new App(android.R.drawable.ic_menu_preferences, "Settings"),
                new App(android.R.drawable.ic_menu_save, "Save")
        );
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if (convertView == null) {
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.icon, null);
            TextView textView = (TextView) gridView.findViewById(R.id.grid_item_label);
            textView.setText(list.get(position).name);
            ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image);
            imageView.setImageDrawable(list.get(position).icon);
        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
