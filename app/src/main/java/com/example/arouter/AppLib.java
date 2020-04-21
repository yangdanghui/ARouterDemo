package com.example.arouter;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.arouter.config.AppConfig;

public class AppLib extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//是否进行ARouter调试(可以通过AppConfig.isDebug=true/false来判断日志的是否开启)
        if (AppConfig.isDebug) {
            //下面两句话必须放到init前面,否则配置无效
            //打印ARouter日志
            ARouter.openLog();
            //开启ARouter的调试模式(如果在InstantRun模式下运行,必须开启调试模式,线上版本需要关闭，否则有安全风险),
            ARouter.openDebug();
        }
//官方建议在Application里面进行初始化(使用该注解路径至少两级)
        ARouter.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();//解除
    }
}
