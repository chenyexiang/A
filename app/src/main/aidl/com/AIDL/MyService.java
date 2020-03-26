package com.AIDL;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

//    @Override
//    public void onCreate() {
//        // TODO Auto-generated method stub
//        super.onCreate();
//    }

    SQConnection connection;

    private final AidlDemo.Stub stub=new AidlDemo.Stub() {

        @Override
        public String name() throws RemoteException {
            return "A_name";
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }



}