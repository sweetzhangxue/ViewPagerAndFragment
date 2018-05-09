package com.example.administrator.viewpagerandfragment;


import android.app.Application;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
//        UMConfigure.init(this,"", UMConfigure.DEVICE_TYPE_PHONE);
        UMConfigure.init(this,"5af14be4a40fa30e6e000115","umeng", UMConfigure.DEVICE_TYPE_PHONE,"");
//        UMConfigure.init(this,UMConfigure.DEVICE_TYPE_PHONE,"5af14be4a40fa30e6e000115");
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);

    }
}
