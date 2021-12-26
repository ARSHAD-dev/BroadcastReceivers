package com.example.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
/*
** Arshadkhan
 */

public class MyBroadcastreceivers extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int bstatus=intent.getIntExtra("level",0);
        Toast.makeText(context, "Your Battery Status is : "+bstatus, Toast.LENGTH_SHORT).show();
    }
}
