package com.yyydjk.gank.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.yyydjk.gank.R;
import com.yyydjk.gank.beans.GanHuo;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by dongjunkun on 2016/2/15.
 */
public class FuliAdapter extends BaseAdapter {
    private Context context;
    private List<GanHuo> ganHuos;

    public FuliAdapter(Context context, List<GanHuo> ganHuos) {
        this.context = context;
        this.ganHuos = ganHuos;
    }

    @Override
    public int getCount() {
        return ganHuos.size();
    }

    @Override
    public Object getItem(int position) {
        return ganHuos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_fuli, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        Picasso.with(context).load(ganHuos.get(position).getUrl()).placeholder(R.mipmap.avatar).into(viewHolder.mImage);
        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.image)
        ImageView mImage;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
