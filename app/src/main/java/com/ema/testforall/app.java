package com.ema.testforall;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class app {

    private static final String TAG = "app";

    public static void t(Context context,String toast){ Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();}
    public static void l(String log){ Log.i(TAG, log);}
    public static void l(int log){ Log.i(TAG, String.valueOf(log));}
}
