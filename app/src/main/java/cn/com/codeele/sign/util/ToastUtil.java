package cn.com.codeele.sign.util;

import android.content.Context;
import android.widget.Toast;

import cn.com.codeele.sign.app.SignApplication;

/**
 * Created by Administrator on 2017/12/19.
 */

public class ToastUtil {

    private static Toast mToast = null;

    public static void show(String msg) {
        Context context = SignApplication.getInstance();
        if (context != null) {
            show(context, msg);
        }
    }

    public static void show(Context context, String text) {
        if (mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_LONG);
        }

        mToast.show();
    }

}
