package bjpkten.precycledviewdemo;

import com.facebook.drawee.backends.pipeline.Fresco;

import kodulf.baselibs.MyApplication;

/**
 * Created by Kodulf on 2018/11/6.
 */
public class FrescoApplication extends MyApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
