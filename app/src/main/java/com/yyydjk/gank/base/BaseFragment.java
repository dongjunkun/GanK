package com.yyydjk.gank.base;

import android.support.v4.app.Fragment;

import com.yyydjk.gank.http.RequestManager;

/**
 * Created by dongjunkun on 2016/2/2.
 */
public class BaseFragment extends Fragment {

    public String getName(){
        return BaseFragment.class.getName();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //取消请求
        RequestManager.cancelRequest(getName());
    }
}
