package com.example.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public Integer[] images = {
            R.drawable.animal2, R.drawable.animal3,
            R.drawable.animal4, R.drawable.animal7,
            R.drawable.animal8,
            R.drawable.animal9, R.drawable.animal10,
            R.drawable.animal11, R.drawable.animal12,
            R.drawable.animal13, R.drawable.animal14
    };

    public ImageAdapter(Context c){

        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(280,280));
        return imageView;
    }
}
