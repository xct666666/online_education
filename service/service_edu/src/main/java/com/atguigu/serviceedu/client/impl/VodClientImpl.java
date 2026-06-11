package com.atguigu.serviceedu.client.impl;

import com.atguigu.commonutils.R;
import com.atguigu.serviceedu.client.VodClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VodClientImpl implements VodClient {

    //出错之后会执行
    @Override
    public R removeVideo(String videoId) {
        return R.error().message("删除视频出错了");
    }

    @Override
    public R deleteBatch(List<String> videoIdList) {
        return R.error().message("删除多个视频出错了");
    }
}
