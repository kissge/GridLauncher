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
    public List<App> list;
    private Context context;

    IconAdapter(Context context, Application application) {
        this.context = context;
        App.application = application;
        this.list = Arrays.asList(
                new App("amber", 0xffbf00),
                new App("amethyst", 0x9966cc),
                new App("apricot", 0xfbceb1),
                new App("aquamarine", 0x7fffd4),
                new App("azure", 0x007fff),
                new App("baby blue", 0x89cff0),
                new App("beige", 0xf5f5dc),
                new App("black", 0x000000),
                new App("blue", 0x0000ff),
                new App("bronze", 0xcd7f32),
                new App("brown", 0x964b00),
                new App("cerulean", 0x007ba7),
                new App("chocolate", 0x7b3f00),
                new App("cobalt blue", 0x0047ab),
                new App("coffee", 0x6f4e37),
                new App("copper", 0xb87333),
                new App("coral", 0xf88379),
                new App("crimson", 0xdc143c),
                new App("cyan", 0x00ffff),
                new App("emerald", 0x50c878),
                new App("gold", 0xffd700),
                new App("gray", 0x808080),
                new App("green", 0x00ff00),
                new App("lavender", 0xb57edc),
                new App("lemon", 0xfff700),
                new App("lime", 0xbfff00),
                new App("magenta", 0xff00ff),
                new App("maroon", 0x800000),
                new App("navy blue", 0x000080),
                new App("olive", 0x808000),
                new App("orange", 0xffa500),
                new App("peach", 0xffe5b4),
                new App("pear", 0xd1e231),
                new App("persian blue", 0x1c39bb),
                new App("pink", 0xffc0cb),
                new App("plum", 0x8e4585),
                new App("purple", 0x800080),
                new App("raspberry", 0xe30b5c),
                new App("red", 0xff0000),
                new App("rose", 0xff007f),
                new App("ruby", 0xe0115f),
                new App("salmon", 0xfa8072),
                new App("sapphire", 0x0f52ba),
                new App("scarlet", 0xff2400),
                new App("silver", 0xc0c0c0),
                new App("violet", 0xee82ee),
                new App("viridian", 0x40826d),
                new App("white", 0xffffff)
        );
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView = inflater.inflate(R.layout.icon, null);
        TextView textView = (TextView) gridView.findViewById(R.id.grid_item_label);
        textView.setText(list.get(position).name);
        ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image);
        imageView.setImageDrawable(list.get(position).icon);
        return gridView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
