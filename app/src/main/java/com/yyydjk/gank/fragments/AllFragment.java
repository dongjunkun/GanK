package com.yyydjk.gank.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.material_design_iconic_typeface_library.MaterialDesignIconic;
import com.squareup.picasso.Picasso;
import com.yyydjk.gank.R;
import com.yyydjk.gank.base.BaseListFragment;
import com.yyydjk.gank.beans.GanHuo;
import com.yyydjk.gank.common.recyclerview.base.ViewHolder;
import com.yyydjk.gank.event.SkinChangeEvent;
import com.yyydjk.gank.utils.ThemeUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import me.xiaopan.android.content.res.DimenUtils;

/**
 * A simple {@link Fragment} subclass.
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class AllFragment extends BaseListFragment<GanHuo> {
    String type = "all";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public int getItemLayout() {
        return R.layout.item_common;
    }


    @Subscribe
    public void onEvent(SkinChangeEvent event){
        adapter.notifyDataSetChanged();

    @Override
    public void fillValue(ViewHolder holder, GanHuo ganHuo, int position) {
        ImageView mImage = holder.getView(R.id.image);
        TextView mText = holder.getView(R.id.text);
        if (ganHuo.getType().equals("福利")) {
            mImage.setVisibility(View.VISIBLE);
            mText.setVisibility(View.GONE);
            Picasso.with(getContext()).load(ganHuo.getUrl()).placeholder(R.mipmap.avatar).into(mImage);
        } else {
            mImage.setVisibility(View.GONE);
            mText.setVisibility(View.VISIBLE);
            mText.setLinkTextColor(ThemeUtils.getThemeColor(getActivity(),R.attr.colorPrimary));
            mText.setText(Html.fromHtml("<a href=\""
                    + ganHuo.getUrl() + "\">"
                    + ganHuo.getDesc() + "</a>"
                    + "[" + ganHuo.getWho() + "]"));
            mText.setMovementMethod(LinkMovementMethod.getInstance());
            switch (ganHuo.getType()) {
                case "Android":
                    setIconDrawable(mText, MaterialDesignIconic.Icon.gmi_android);
                    break;
                case "iOS":
                    setIconDrawable(mText, MaterialDesignIconic.Icon.gmi_apple);
                    break;
                case "休息视频":
                    setIconDrawable(mText, MaterialDesignIconic.Icon.gmi_collection_video);
                    break;
                case "前端":
                    setIconDrawable(mText, MaterialDesignIconic.Icon.gmi_language_javascript);
                    break;
                case "拓展资源":
                    setIconDrawable(mText, FontAwesome.Icon.faw_location_arrow);
                    break;
                case "App":
                    setIconDrawable(mText, MaterialDesignIconic.Icon.gmi_apps);
                    break;
                case "瞎推荐":
                    setIconDrawable(mText, MaterialDesignIconic.Icon.gmi_more);
                    break;

            }
        }

    }

    private void setIconDrawable(TextView view, IIcon icon) {
        view.setCompoundDrawablesWithIntrinsicBounds(new IconicsDrawable(getActivity())
                        .icon(icon)
                        .color(ThemeUtils.getThemeColor(getActivity(), R.attr.colorPrimary))
                        .sizeDp(14),
                null, null, null);
        view.setCompoundDrawablePadding(DimenUtils.dp2px(getActivity(), 5));
    }

    @Override
    protected String getUrl() {
        return "http://gank.io/api/data/" + type + "/"
                + String.valueOf(pageSize) + "/"
                + String.valueOf(page);
    }

    @Subscribe
    public void onEvent(SkinChangeEvent event){
        headerAndFooterWrapper.notifyDataSetChanged();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }
}