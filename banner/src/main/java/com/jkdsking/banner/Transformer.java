package com.jkdsking.banner;


import androidx.viewpager.widget.ViewPager;

import com.jkdsking.banner.transformer.AccordionTransformer;
import com.jkdsking.banner.transformer.BackgroundToForegroundTransformer;
import com.jkdsking.banner.transformer.CubeInTransformer;
import com.jkdsking.banner.transformer.CubeOutTransformer;
import com.jkdsking.banner.transformer.DefaultTransformer;
import com.jkdsking.banner.transformer.DepthPageTransformer;
import com.jkdsking.banner.transformer.FlipHorizontalTransformer;
import com.jkdsking.banner.transformer.FlipVerticalTransformer;
import com.jkdsking.banner.transformer.ForegroundToBackgroundTransformer;
import com.jkdsking.banner.transformer.RotateDownTransformer;
import com.jkdsking.banner.transformer.RotateUpTransformer;
import com.jkdsking.banner.transformer.ScaleInOutTransformer;
import com.jkdsking.banner.transformer.StackTransformer;
import com.jkdsking.banner.transformer.TabletTransformer;
import com.jkdsking.banner.transformer.ZoomInTransformer;
import com.jkdsking.banner.transformer.ZoomOutSlideTransformer;
import com.jkdsking.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends ViewPager.PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends  ViewPager.PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends  ViewPager.PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
