package com.satyam.commons;

/**
 * Created by Scanpoint12 on 30-Mar-2017.
 */

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class common {
    /*
	 * Function: AlertMessage - Common function for showing the alert box to
	 * show message on screen Parameters: String message, Context mContext
	 * String message: Passes massage to show on alert box String Context:
	 * Context object for which alert box is to be shown Purpose Common function
	 * for showing the alert box to show message on screen
	 */
    public static void AlertMessage(String message, Context mContext) {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_NEGATIVE:
                        dialog.dismiss();
                        break;
                }
            }
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setMessage(message).setNegativeButton("Cancel", dialogClickListener).show();
    };

    public static void AlertMessage(int message, Context mContext) {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_NEGATIVE:
                        dialog.dismiss();
                        break;
                }
            }
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setMessage(message).setNegativeButton("Cancel", dialogClickListener).show();
    };
}
