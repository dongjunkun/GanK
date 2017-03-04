package com.yyydjk.gank.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.yyydjk.gank.R;
import com.yyydjk.gank.base.BaseListFragment;
import com.yyydjk.gank.beans.GanHuo;
import com.yyydjk.gank.common.recyclerview.base.ViewHolder;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommonFragment extends BaseListFragment<GanHuo> {

    public static final String ARG_TYPE = "type";

    private String type;

    public static CommonFragment newInstance(String type) {

        Bundle args = new Bundle();

        CommonFragment fragment = new CommonFragment();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
            type = getArguments().getString(ARG_TYPE);

    }

    @Override
    public int getItemLayout() {
        return R.layout.item_common;
    }

    @Override
    public void fillValue(ViewHolder holder, GanHuo ganHuo, int position) {
        TextView text = holder.getView(R.id.text);
        text.setText(Html.fromHtml("<a href=\""
                + ganHuo.getUrl() + "\">"
                + ganHuo.getDesc() + "</a>"
                + "[" + ganHuo.getWho() + "]"));
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    protected String getUrl() {
        return "http://gank.io/api/data/" + type + "/"
                + String.valueOf(pageSize) + "/"
                + String.valueOf(page);
    }


}