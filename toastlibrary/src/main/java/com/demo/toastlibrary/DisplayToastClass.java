package com.demo.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by sony on 7/13/2019.
 */

public class DisplayToastClass {


    public static final void showToast(Context context, String msg){

        Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT).show();
    }
}
