package cn.com.codeele.sign.app;

import java.io.File;

import cn.com.codeele.sign.BuildConfig;

/**
 * Created by xingwen on 2017/11/6.
 */

public class Constant {
    public static final String API_HOST = BuildConfig.API_HOST;

    /**
     * 本地数据库名称
     */
    public static final String DB_NAME = "sign-db";

    /**
     * 是否在debug模式
     */
    public static final boolean DEBUG = BuildConfig.DEBUG;

    /**
     * 最大缓存 10Mib
     */
    public static long CACHE_MAXSIZE = 10 * 1024 * 1024;
    public static String IM_CACHE = "imCache";//缓存文件夹名


    public static final class Code {
        //请求成功状态码
        public static final int SUCCESS = 0;

        //签名错误
        //签名过期

        //AccessToken错误或已过期

    }

    /**
     * 偏好常量
     **/
    public class SPAction {

        /**
         * 是否第一次进入APP
         */
        public static final String IS_FIRST = "is_first";
    }

}
