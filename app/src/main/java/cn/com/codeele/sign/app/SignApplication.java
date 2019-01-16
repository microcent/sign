package cn.com.codeele.sign.app;

import android.app.Application;
import android.content.Context;

public class SignApplication extends Application {

    private static final String TAG = SignApplication.class.getSimpleName();

    private static SignApplication instance;
    private static Context context;

    public static SignApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * 初始化Dagger2
     */
    private void initDagger2() {

    }
}

