package top.niunaijun.blackbox.utils.shim;

import android.app.Notification;
import android.content.Context;
import android.os.Build;

public final class NotificationCompat {
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;

    private NotificationCompat() {}

    public static class Builder {
        private final Notification.Builder mBuilder;

        public Builder(Context context, String channelId) {
            if (Build.VERSION.SDK_INT >= 26) {
                mBuilder = new Notification.Builder(context, channelId);
            } else {
                mBuilder = new Notification.Builder(context);
            }
        }

        public Builder setPriority(int priority) {
            mBuilder.setPriority(priority);
            return this;
        }

        public Builder setContentTitle(CharSequence title) {
            mBuilder.setContentTitle(title);
            return this;
        }

        public Builder setContentText(CharSequence text) {
            mBuilder.setContentText(text);
            return this;
        }

        public Builder setSmallIcon(int icon) {
            mBuilder.setSmallIcon(icon);
            return this;
        }

        public Builder setOngoing(boolean ongoing) {
            mBuilder.setOngoing(ongoing);
            return this;
        }

        public Builder setAutoCancel(boolean autoCancel) {
            mBuilder.setAutoCancel(autoCancel);
            return this;
        }

        public Notification build() {
            return mBuilder.build();
        }
    }
}
