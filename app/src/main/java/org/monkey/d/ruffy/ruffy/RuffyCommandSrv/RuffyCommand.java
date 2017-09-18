package org.monkey.d.ruffy.ruffy.RuffyCommandSrv;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import org.monkey.d.ruffy.ruffy.driver.IRuffyService;

/**
 * Created by Admin on 17.09.2017.
 */

public class RuffyCommand {

    public boolean mServiceBound = false;
    public IRuffyService mBoundService;

    private void onCreate(){

    }


    protected void onDestroy() {

    }





}
