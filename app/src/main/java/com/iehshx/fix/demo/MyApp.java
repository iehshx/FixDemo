package com.iehshx.fix.demo;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

import com.iehshx.fixlibrary.HotFix;

import java.io.File;

/**
 * Created by iehshx on 2017/2/14.
 */

public class MyApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        HotFix.init(this);
        if (new File(Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar")).exists())
        HotFix.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
    }
}
