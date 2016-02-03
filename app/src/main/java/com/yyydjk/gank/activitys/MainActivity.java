package com.yyydjk.gank.activitys;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.yyydjk.gank.R;
import com.yyydjk.gank.base.BaseActivity;
import com.yyydjk.gank.beans.GanHuo;
import com.yyydjk.gank.fragments.AllFragment;
import com.yyydjk.gank.fragments.AndroidFragment;
import com.yyydjk.gank.fragments.FuLiFragment;
import com.yyydjk.gank.fragments.IOSFragment;
import com.yyydjk.gank.http.CallBack;
import com.yyydjk.gank.http.RequestManager;
import com.yyydjk.gank.utils.SystemUtils;
import com.yyydjk.gank.widget.ResideLayout;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.BlurTransformation;

public class MainActivity extends BaseActivity {

    @Bind(R.id.background_image) ImageView mBackgroundImage;
    @Bind(R.id.menu) RelativeLayout mMenu;
    @Bind(R.id.resideLayout) ResideLayout mResideLayout;
    @Bind(R.id.status_bar) View mStatusBar;
    @Bind(R.id.tool_bar) Toolbar mToolBar;
    @Bind(R.id.container) FrameLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mStatusBar.setVisibility(View.VISIBLE);
            mStatusBar.getLayoutParams().height = SystemUtils.getStatusHeight(this);
            mStatusBar.setLayoutParams(mStatusBar.getLayoutParams());
        } else {
            mStatusBar.setVisibility(View.GONE);
        }

        mToolBar.setTitle("干货集中营");
        mToolBar.setTitleTextColor(Color.WHITE);
        mToolBar.setLogo(R.mipmap.ic_launcher);


        RequestManager.get(getName(), "http://gank.avosapps.com/api/data/福利/1/1", new CallBack<List<GanHuo>>() {
            @Override
            public void onSuccess(List<GanHuo> result) {
                Glide.with(MainActivity.this)
                        .load(result.get(0).getUrl())
                        .placeholder(R.drawable.shape_menu_background)
                        .bitmapTransform(new BlurTransformation(MainActivity.this))
                        .into(mBackgroundImage);

            }
        });
        switchFragment(new AllFragment());
    }

    private void switchFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        if (mResideLayout.isOpen()) {
            mResideLayout.closePane();
        } else {
            super.onBackPressed();
        }
    }

    @OnClick({R.id.all, R.id.fuli, R.id.android, R.id.ios})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.all:
                switchFragment(new AllFragment());
                break;
            case R.id.fuli:
                switchFragment(new FuLiFragment());
                break;
            case R.id.android:
                switchFragment(new AndroidFragment());
                break;
            case R.id.ios:
                switchFragment(new IOSFragment());
                break;
        }
        mResideLayout.closePane();
    }
}
