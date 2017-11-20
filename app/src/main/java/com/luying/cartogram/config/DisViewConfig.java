package com.luying.cartogram.config;

import com.luying.cartogram.data.DisInfo;

import java.io.Serializable;
import java.util.List;

/**
 * 创建人：luying
 * 创建时间：2017/11/20
 * 类说明：
 */

public class DisViewConfig implements Serializable {
    private List<DisInfo> mDisInfos;


    public DisViewConfig() {
    }

    public List<DisInfo> getmDisInfos() {
        return mDisInfos;
    }

    public void setmDisInfos(List<DisInfo> mDisInfos) {
        this.mDisInfos = mDisInfos;
    }
}
