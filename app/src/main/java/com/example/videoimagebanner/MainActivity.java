package com.example.videoimagebanner;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.jkdsking.banner.Banner;
import com.jkdsking.banner.listener.OnVideoStateListener;
import com.jkdsking.banner.loader.ImageLoader;
import com.jkdsking.banner.loader.VideoLoader;

import cn.jzvd.JZMediaSystem;
import cn.jzvd.JZTextureView;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class MainActivity extends AppCompatActivity {
    private Banner banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner=findViewById(R.id.banner);
        //是否开启自动轮播
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(3000);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置视频加载
        banner.setVideoLoader(new IjkVideoLoader());
        //设置图片和视频集合
        banner.setImages(DataBean.getVideoBannerData());
        //banner设置方法全部调用完毕时最后调用
        banner.start();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }
    @Override
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();

    }


    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayView(Context context, Object path, ImageView imageView, OnVideoStateListener listener) {

            //Glide 加载图片简单用法
            Glide.with(context).load(path).into(imageView);
        }
    }


    public class IjkVideoLoader extends VideoLoader {
        @Override
        public void displayView(Context context, Object path, View view, OnVideoStateListener listener) {

            //饺子视频播放器
            MyJzvdStd jzVideo = (MyJzvdStd)view;
            jzVideo.setUp((String) path, "");
            RequestOptions options = new RequestOptions()
                    .centerCrop()
                    .fitCenter()
                    .diskCacheStrategy(DiskCacheStrategy.NONE);
            //设置视频封面图
            Glide.with(context).load("http://img.zcool.cn/community/01700557a7f42f0000018c1bd6eb23.jpg").apply(options).into(jzVideo.posterImageView);

            jzVideo.setOnVideoStateListener(listener);
        }
        @Override
        public View createView(Context context) {
            MyJzvdStd view = new MyJzvdStd(context);
            return view;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}