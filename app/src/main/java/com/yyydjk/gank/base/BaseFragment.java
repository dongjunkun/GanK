package com.yyydjk.gank.base;

import android.support.v4.app.Fragment;

import com.yyydjk.gank.http.RequestManager;

import java.util.UUID;

/**
 * Created by dongjunkun on 2016/2/2.
 */
public abstract class BaseFragment extends Fragment {
    protected String tag = UUID.randomUUID().toString();



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        RequestManager.cancelRequest(tag);
    }
}
