package ble.fretx.classic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

/**
 * Created by Jamal on 8/19/2016.
 */
public class Selection extends AppCompatActivity {

    /**initilize the variables**/
    private Button chord;
    private Button frets;
    private Button pic1;
    private Button pic2;
    private Button pic3;
    private Button pic4;
    private Button pic5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);

        chord =(Button)findViewById(R.id.chord1);
        frets = (Button)findViewById(R.id.fret1);
        pic1 = (Button)findViewById(R.id.pic1);
        pic2 = (Button)findViewById(R.id.pic2);
        pic3 = (Button)findViewById(R.id.pic3);
        pic4 = (Button)findViewById(R.id.pic4);
        pic5 = (Button)findViewById(R.id.pic5);


        chord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Selection.this, Chords.class);
                startActivity(i);
            }
        });

        frets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Selection.this, Frets.class);
                startActivity(f);
            }
        });

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Selection.this, Pic1.class);
                startActivity(f);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Selection.this, Pic2.class);
                startActivity(f);
            }
        });

        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Selection.this, Pic3.class);
                startActivity(f);
            }
        });

        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Selection.this, Pic4.class);
                startActivity(f);
            }
        });

        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Selection.this, Pic5.class);
                startActivity(f);
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        byte[] array = new byte[]{0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
        try{
            BluetoothClass.mmSocket.close();
        }
        catch (IOException e) {
        }
        finish();
    }
}
