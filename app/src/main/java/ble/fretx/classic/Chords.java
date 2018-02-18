package ble.fretx.classic;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

/**
 * Created by Jamal on 8/20/2016.
 */
public class Chords extends AppCompatActivity {

    private Switch success;
    boolean allowed = false;
    private int string = 0;
    public int data_received = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
            success = (Switch)findViewById(R.id.switch1);

            //byte[] array = new byte[]{0};
            //byte[] array = new byte[]{74};
            //MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();

            success.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    allowed = isChecked;
                }
            });


            //BluetoothClass.ConnectedThread con = new BluetoothClass.ConnectedThread(BluetoothClass.mmSocket);
            //con.start();

            /*final Handler handler = new Handler();
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    // do the task again and again
                    handler.postDelayed(this, 400);
                    if(data_received == 0) {
                        if (string != 5) {
                            switch (string) {
                                case 0:
                                    //show the extra chords for a 400ms interval
                                    byte[] array0 = new byte[]{1, 11, 21, 31, 41, 0};
                                    //byte[] array = new byte[]{74};
                                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array0).sendToTarget();

                                case 1:
                                    //show the extra chords for a 400ms interval
                                    byte[] array1 = new byte[]{2, 12, 22, 32, 42, 0};
                                    //byte[] array = new byte[]{74};
                                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array1).sendToTarget();

                                case 2:
                                    //show the extra chords for a 400ms interval
                                    byte[] array2 = new byte[]{3, 13, 23, 33, 43, 0};
                                    //byte[] array = new byte[]{74};
                                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array2).sendToTarget();

                                case 3:
                                    //show the extra chords for a 400ms interval
                                    byte[] array3 = new byte[]{4, 14, 24, 34, 44, 0};
                                    //byte[] array = new byte[]{74};
                                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array3).sendToTarget();

                                case 4:
                                    //show the extra chords for a 400ms interval
                                    byte[] array4 = new byte[]{5, 15, 25, 35, 45, 0};
                                    //byte[] array = new byte[]{74};
                                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array4).sendToTarget();
                            }
                            string++;
                        } else {
                            string = 0;
                            //show the extra chords for a 400ms interval
                            byte[] array5 = new byte[]{6, 16, 26, 36, 46, 0};
                            //byte[] array = new byte[]{74};
                            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array5).sendToTarget();
                        }
                    }
                }
            };
            handler.post(task);*/

        }

    public void start(View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{11, 12, 13, 14, 15, 16, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{11, 12, 13, 14, 15, 16, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }

    public void stop(View v) {
            byte[] array = new byte[]{0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        data_received = 1;
    }

    public void em (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{1, 2, 3, 24, 25, 6, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{1, 2, 3, 24, 25, 6, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void asus2 (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{1, 2, 23, 24, 5, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{1, 2, 23, 24, 5, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void emajor (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{1, 2, 13, 24, 25, 6, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{1, 2, 13, 24, 25, 6, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void aminor (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{1, 12, 23, 24, 5, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{1, 12, 23, 24, 5, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void easyG (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{31, 25, 36, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{31, 25, 36, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void dseven (View v) {
        if (allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{1, 5, 22, 23, 24, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        } else {
            byte[] array = new byte[]{1, 5, 22, 23, 24, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void cmajor (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{21, 12, 23, 4, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{21, 12, 23, 4, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void cmajor1 (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{1, 3, 12, 24, 35, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{1, 3, 12, 24, 35, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }
    public void dmajor (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{21, 32, 23, 4, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{21, 32, 23, 4, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }

    public void dmajor1 (View v) {
        if(allowed) {
            //show the extra chords for a 400ms interval
            byte[] array = new byte[]{1, 11, 21, 31, 41, 6, 16, 26, 36, 46, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 400ms
                    byte[] array = new byte[]{11, 12, 16, 23, 34, 35, 0};
                    //byte[] array = new byte[]{74};
                    MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
                }
            }, 700);
        }
        else {
            byte[] array = new byte[]{11, 12, 16, 23, 34, 35, 0};
            //byte[] array = new byte[]{74};
            MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        }
        data_received = 1;
    }

    @Override
    public void onBackPressed() {
        byte[] array = new byte[]{0};
        //byte[] array = new byte[]{74};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        byte[] array1 = new byte[]{2};
        //byte[] array = new byte[]{74};
        MainActivity.mHandler.obtainMessage(BluetoothClass.DISCONNECT, array).sendToTarget();
        //unregisterReceiver(receiver);
        finish();
    }
}
