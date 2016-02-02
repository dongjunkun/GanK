package com.yyydjk.gank.http;

import android.os.Environment;

import com.orhanobut.logger.Logger;

import java.io.File;
import java.io.IOException;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by dongjunkun on 2016/2/1.
 */
public class HttpClient {

    public static void get(Object tag, String url, CallBack callBack) {
        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(new File(Environment.getExternalStorageDirectory().getPath()+"/gank/cache.tmp"),cacheSize);
        try {
            cache.evictAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cache(cache)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Logger.json(response.body().string());
            }
        });
    }
}
