package ble.fretx.classic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Jamal on 8/23/2016.
 */
public class Frets extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fret);
    }

    public void s6f4 (View v) {
        byte[] array = new byte[]{46, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s6f3 (View v) {
        byte[] array = new byte[]{36, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s6f2 (View v) {
        byte[] array = new byte[]{26, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s6f1 (View v) {
        byte[] array = new byte[]{16, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s6f0 (View v) {
        byte[] array = new byte[]{6, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }
    // STRING 5

    public void s5f4 (View v) {
        byte[] array = new byte[]{45, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s5f3 (View v) {
        byte[] array = new byte[]{35, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s5f2 (View v) {
        byte[] array = new byte[]{25, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s5f1 (View v) {
        byte[] array = new byte[]{15, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s5f0 (View v) {
        byte[] array = new byte[]{5, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }
    // STRING 4

    public void s4f4 (View v) {
        byte[] array = new byte[]{44, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s4f3 (View v) {
        byte[] array = new byte[]{34, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s4f2 (View v) {
        byte[] array = new byte[]{24, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s4f1 (View v) {
        byte[] array = new byte[]{14, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s4f0 (View v) {
        byte[] array = new byte[]{4, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }
    // STRING 3

    public void s3f4 (View v) {
        byte[] array = new byte[]{43, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s3f3 (View v) {
        byte[] array = new byte[]{33, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s3f2 (View v) {
        byte[] array = new byte[]{23, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s3f1 (View v) {
        byte[] array = new byte[]{13, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s3f0 (View v) {
        byte[] array = new byte[]{3, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    // STRING 2

    public void s2f4 (View v) {
        byte[] array = new byte[]{42, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s2f3 (View v) {
        byte[] array = new byte[]{32, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s2f2 (View v) {
        byte[] array = new byte[]{22, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s2f1 (View v) {
        byte[] array = new byte[]{12, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s2f0 (View v) {
        byte[] array = new byte[]{2, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    // STRING 1

    public void s1f4 (View v) {
        byte[] array = new byte[]{41, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s1f3 (View v) {
        byte[] array = new byte[]{31, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s1f2 (View v) {
        byte[] array = new byte[]{21, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s1f1 (View v) {
        byte[] array = new byte[]{11, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s1f0 (View v) {
        byte[] array = new byte[]{1, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

}
