package com.luying.cartogram.util;

import java.util.List;

/**
 * 创建人：luying
 * 创建时间：2017/11/20
 * 类说明：
 */

public class ListUtil {
    public static boolean isEmpty(List<?> list) {
        return list == null || list.size() <= 0;
    }
}
