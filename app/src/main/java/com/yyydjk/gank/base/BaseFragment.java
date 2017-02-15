package com.yyydjk.gank.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yyydjk.gank.http.RequestManager;

import java.util.UUID;

import butterknife.ButterKnife;

/**
 * Created by dongjunkun on 2016/2/2.
 */
public abstract class BaseFragment extends Fragment {
    protected String tag = UUID.randomUUID().toString();


    private boolean isViewPrepared; // 标识fragment视图已经初始化完毕
    private boolean hasFetchData; // 标识已经触发过懒加载数据

    protected View mRootView;
    protected abstract
    @LayoutRes
    int getLayoutId();

    protected abstract void initViews();

    protected abstract void lazyFetchData();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this,mRootView);
        initViews();
        return mRootView;
    }

    private void lazyFetchDataIfPrepared() {
        if (getUserVisibleHint() && !hasFetchData && isViewPrepared) {
            hasFetchData = true;
            lazyFetchData();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            lazyFetchDataIfPrepared();
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        isViewPrepared = true;
        lazyFetchDataIfPrepared();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        hasFetchData = false;
        isViewPrepared = false;
        ButterKnife.unbind(this);
        RequestManager.cancelRequest(tag);
    }
}
