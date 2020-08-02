package com.ema.testforall;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;

public class Wifi_Bluetooth {

    Context context;

    Wifi_Bluetooth(Context context){
        this.context = context;
    }

    public void TurnOnWifi(){
        WifiManager manager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        if (!manager.isWifiEnabled())   manager.setWifiEnabled(true);
        else                            app.t(context,"wifi already is enabled");
    }

    public void TurnOnBluetooth(){
        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
        if (!adapter.isEnabled())   adapter.enable();
        else                        app.t(context,"bluetooth already is enabled");
    }

}
