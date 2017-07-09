package com.ethangraf.habitrabbit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ethan on 7/7/17.
 */

public class UnlockBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "MyBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        /*
        // Verify that device was unlocked
        StringBuilder sb = new StringBuilder();
        sb.append("Action: " + intent.getAction() + "\n");
        sb.append("URI: " + intent.toUri(Intent.URI_INTENT_SCHEME).toString() + "\n");
        String log = sb.toString();
        Log.d(TAG, log);
        Toast.makeText(context, log, Toast.LENGTH_LONG).show();
        */

        // TODO: Habit reinforcement algorithm

        // Open base HabitActivity
        Intent habitIntent = new Intent(context, HabitActivity.class);
        habitIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(habitIntent);


    }

}
