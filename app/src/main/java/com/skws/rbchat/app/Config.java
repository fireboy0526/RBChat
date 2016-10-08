package com.skws.rbchat.app;

/**
 * Created by Eric on 10/8/2016.
 */

public class Config {

    // Global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";

    // Broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";

    // Id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;

    public static final String SHARED_PREF = "ah_firebase";
}
