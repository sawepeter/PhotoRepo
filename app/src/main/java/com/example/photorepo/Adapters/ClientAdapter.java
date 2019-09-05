package com.example.photorepo.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.photorepo.R;

public class ClientAdapter extends BaseAdapter {
    private Context mContext;


    // Keep all Images in array
    public Integer[] ImageIds = {
            R.drawable.d, R.drawable.wan,
            R.drawable.h,
            R.drawable.ha,
            R.drawable.ka,
            R.drawable.p,
            R.drawable.r,
            R.drawable.ra,
            R.drawable.ras
    };


    // Constructor
    public ClientAdapter(Context c){
        mContext = c;
    }


    @Override
    public int getCount() {
        return ImageIds.length;
    }

    @Override
    public Object getItem(int i) {
        return ImageIds[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(ImageIds[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70,70));
        return imageView;
    }
}
