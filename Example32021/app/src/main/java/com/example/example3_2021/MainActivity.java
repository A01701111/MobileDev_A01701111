package com.example.example3_2021;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        toast = new Toast(context);
        toast.makeText(context,"I am a Toast!",Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialogConf = new AlertDialog.Builder(this);
        dialogConf.setTitle("Regular Menus");
        dialogConf.setMessage("This is the Text of the Neutral Dialog");
        dialogConf.setIcon(R.mipmap.ic_launcher);

        dialogConf.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        toast.makeText(context,"You clicked Yes",Toast.LENGTH_LONG).show();
                    }
                });

        dialogConf.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        toast.makeText(context,"You clicked No",Toast.LENGTH_LONG).show();
                    }
                });
        dialogConf.setNeutralButton("Dismiss",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        toast.makeText(context,"You clicked dismissed",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = dialogConf.create();
        dialogConf.show();

        Notification.Builder notifConf = new Notification.Builder(this);
        notifConf.setSmallIcon(R.mipmap.ic_launcher);
        notifConf.setContentTitle("This is my shiny notification!");
        notifConf.setContentText("This is the detail of the notification");

        Intent notificationIntent = new Intent(this, ChildActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        notifConf.setContentIntent(contentIntent);


        NotificationManager myNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        myNotification.notify(1, notifConf.build());

    }
}