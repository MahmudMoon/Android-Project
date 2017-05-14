package com.example.moonc.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number,Price;
    Button btn ,plus,minus;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.order);
        number = (TextView) findViewById(R.id.number);
        Price = (TextView)findViewById(R.id.price);
        plus =(Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);

    }

    public void order(View view)
    {
        int num = Integer.parseInt(number.getText().toString());
        int price = num * 5;
        float f = price;
        String str = Float.toString(f);
        str = "$"+str;
        Price.setText(str);
    }

    public void add(View view)
    {
        int num = Integer.parseInt(number.getText().toString());
        num++;
        number.setText(Integer.toString(num));
    }

    public void sub(View view)
    {
        int num = Integer.parseInt(number.getText().toString());
        num--;
        number.setText(Integer.toString(num));
    }
    /**
     * This method displays the given price on the screen.
     */
}
