package com.fengrongcheng.betterproject.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * android 获取当前app的版本号和版本名称
 *
 * @author frc  on 17-11-23.
 */

public class ApkVersionUtils {

    /**
     * 获取当前本地apk的版本
     *
     * @param context
     * @return versionCode
     */
    public static int getVersionCode(Context context) {
        int versionCode = 0;
        try {
            versionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    public static String getVersionName(Context context) {
        String versionName = "";
        try {
            versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;
    }

}
