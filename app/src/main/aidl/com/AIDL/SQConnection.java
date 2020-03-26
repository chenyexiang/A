package com.AIDL;

import android.content.ServiceConnection;

public class SQConnection implements ServiceConnection {
	AidlDemo service;

	@Override
	public void onServiceConnected(android.content.ComponentName name,
			android.os.IBinder service) {
		this.service = AidlDemo.Stub.asInterface(service);
	}

	@Override
	public void onServiceDisconnected(android.content.ComponentName name) {
	}
}
