package org.monkey.d.ruffy.ruffy.RuffyCommandSrv;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RCommand extends Service {
    public RCommand() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
