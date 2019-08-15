package com.example.photorepo.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.photorepo.R;

public class Month_Adapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mMonthId = {
            R.drawable.am, R.drawable.wolf,
            R.drawable.aw,
            R.drawable.cam,
            R.drawable.lion,
            R.drawable.na,
            R.drawable.ted,
            R.drawable.wild
    };

    // Constructor
    public Month_Adapter(Context c){
        mContext = c;
    }
    @Override
    public int getCount() {
        return mMonthId.length;
    }

    @Override
    public Object getItem(int i) {
        return mMonthId[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mMonthId[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70,70));
        return imageView;
    }
}
