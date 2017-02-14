package com.yyydjk.gank.common.recyclerview.decoration;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yyydjk.gank.utils.DimenUtils;


/**
 * Created by dongjunkun on 2016/5/27.
 */
public class OffsetDecoration extends RecyclerView.ItemDecoration {

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int space = DimenUtils.dp2px(parent.getContext(), 4);
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.set(space, space, space, space);
        } else
            outRect.set(space, 0, space, space);
    }
}
