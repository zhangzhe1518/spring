package com.xun.springioc.annotationbean.configbean.service.serviceimpl;

import com.xun.springioc.annotationbean.configbean.service.CDServise;
import org.springframework.stereotype.Service;

@Service
public class CDServiceImpl implements CDServise {

    /**
     * 曲目
     */
    private String title = "《寻》";
    /**
     * 作者
     */
    private String artist = "huahua";

    public void play() {
        System.out.println("playing " + title + "by " + artist);
    }
}
