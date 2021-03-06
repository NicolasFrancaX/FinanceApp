package com.databases.example.features.notifications;

import android.content.Context;
import android.net.Uri;

import com.databases.example.database.MyContentProvider;

import timber.log.Timber;

/**
 * Created by kwelsh on 3/5/17.
 */

public class NotificationUtils {

    //Method for clearing notifications if they were clicked on
    public static void clearNotifications(Context context) {
        Timber.v("Clearing notifications...");
        Uri uri = Uri.parse(MyContentProvider.NOTIFICATIONS_URI + "/" + 0);
        context.getContentResolver().delete(uri, null, null);
    }
}
