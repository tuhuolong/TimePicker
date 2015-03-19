
package com.demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.demo.ui.TimePicker;

public class MainActivity extends Activity {
    Context mContext;

    TimePicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        picker = (TimePicker) findViewById(R.id.time_picker);

        picker.getCurrentHour();
        picker.getCurrentMinute();
    }

}
