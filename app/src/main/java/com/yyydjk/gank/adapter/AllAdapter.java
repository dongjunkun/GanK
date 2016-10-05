package com.yyydjk.gank.adapter;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.material_design_iconic_typeface_library.MaterialDesignIconic;
import com.squareup.picasso.Picasso;
import com.yyydjk.gank.R;
import com.yyydjk.gank.beans.GanHuo;
import com.yyydjk.gank.utils.ThemeUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.xiaopan.android.content.res.DimenUtils;

/**
 * Created by dongjunkun on 2016/2/15.
 */
public class AllAdapter extends BaseAdapter {
    private Context context;
    private List<GanHuo> ganHuos;

    public AllAdapter(Context context, List<GanHuo> ganHuos) {
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
        GanHuo ganHuo = ganHuos.get(position);
        View view1;
        View view2;
        if (ganHuo.getType().equals("福利")) {
            ImageViewHolder viewHolder1 = null;
            if (convertView != null && convertView.getTag() instanceof ImageViewHolder) {
                viewHolder1 = (ImageViewHolder) convertView.getTag();
            } else {
                view1 = LayoutInflater.from(context).inflate(R.layout.item_fuli, null);
                viewHolder1 = new ImageViewHolder(view1);
                view1.setTag(viewHolder1);
                convertView = view1;
            }
            Picasso.with(context).load(ganHuo.getUrl()).placeholder(R.mipmap.avatar).into(viewHolder1.mImage);
        } else {
            ViewHolder viewHolder2 = null;
            if (convertView != null && convertView.getTag() instanceof ViewHolder) {
                viewHolder2 = (ViewHolder) convertView.getTag();
            } else {
                view2 = LayoutInflater.from(context).inflate(R.layout.item_android, null);
                viewHolder2 = new ViewHolder(view2);
                view2.setTag(viewHolder2);
                convertView = view2;
            }
            viewHolder2.mText.setText(Html.fromHtml("<a href=\""
                    + ganHuo.getUrl() + "\">"
                    + ganHuo.getDesc() + "</a>"
                    + "[" + ganHuo.getWho() + "]"));
            viewHolder2.mText.setMovementMethod(LinkMovementMethod.getInstance());
            switch (ganHuo.getType()) {
                case "Android":
                    setIconDrawable(viewHolder2.mText, MaterialDesignIconic.Icon.gmi_android);
                    break;
                case "iOS":
                    setIconDrawable(viewHolder2.mText, MaterialDesignIconic.Icon.gmi_apple);
                    break;
                case "休息视频":
                    setIconDrawable(viewHolder2.mText, MaterialDesignIconic.Icon.gmi_collection_video);
                    break;
                case "前端":
                    setIconDrawable(viewHolder2.mText, MaterialDesignIconic.Icon.gmi_language_javascript);
                    break;
                case "拓展资源":
                    setIconDrawable(viewHolder2.mText, FontAwesome.Icon.faw_location_arrow);
                    break;
                case "App":
                    setIconDrawable(viewHolder2.mText, MaterialDesignIconic.Icon.gmi_apps);
                    break;
                case "瞎推荐":
                    setIconDrawable(viewHolder2.mText, MaterialDesignIconic.Icon.gmi_more);
                    break;

            }
        }
        return convertView;
    }

    private void setIconDrawable(TextView view, IIcon icon) {
        view.setCompoundDrawablesWithIntrinsicBounds(new IconicsDrawable(context)
                        .icon(icon)
                        .color(ThemeUtils.getThemeColor(context, R.attr.colorPrimary))
                        .sizeDp(14),
                null, null, null);
        view.setCompoundDrawablePadding(DimenUtils.dp2px(context, 5));
    }

    static class ViewHolder {
        @Bind(R.id.text)
        TextView mText;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    static class ImageViewHolder {
        @Bind(R.id.image)
        ImageView mImage;

        ImageViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
