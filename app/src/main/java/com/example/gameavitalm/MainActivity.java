package com.example.gameavitalm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed;EditText ed1;EditText ed2;
    Button btn1;Button btn2;Button btn3;Button btn4;
    TextView tv1;TextView tv2;TextView tv3;TextView tv4;TextView tv5;TextView tv6;
    ImageView vi;ImageView vi1;ImageView vi2;ImageView vi3;ImageView vi4;ImageView vi5;

    int counter = 0;int number1;int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.ed1);ed1 = findViewById(R.id.ed2);ed2 = findViewById(R.id.ed3);
        tv1 = findViewById(R.id.tv1);tv2 = findViewById(R.id.tv2);tv3 = findViewById(R.id.tv3);tv4 = findViewById(R.id.tv4);tv5 = findViewById(R.id.tv5);tv6 = findViewById(R.id.tv6);
        btn1 = findViewById(R.id.b1);btn2 = findViewById(R.id.btn2);btn3 = findViewById(R.id.btn);
        vi = findViewById(R.id.ix1);vi1 = findViewById(R.id.ix2);vi2 = findViewById(R.id.ix3);vi3 = findViewById(R.id.check1);vi4 = findViewById(R.id.check2);vi5 = findViewById(R.id.check3);
        number1 = (int) (Math.random() * 100);
        number2 = (int) (Math.random() * 100);
        tv1.setText(" " + number1);
        tv2.setText(" " + number2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third();
            }
        });

    }

    private void first() {

        int answer = Integer.parseInt(ed.getText().toString());
        if (answer == (number1 + number2)) {
            vi3.setVisibility(View.VISIBLE);
            counter++;
        } else
            vi.setVisibility(View.VISIBLE);
        Toast toast = Toast.makeText(getApplicationContext()," "+(number1+number2),Toast.LENGTH_LONG);
        toast.setGravity(100,0,0);
        toast.show();
        number1 = (int) (Math.random() * 100);
        number2 = (int) (Math.random() * 100);
        tv3.setText(" " + number1);
        tv4.setText(" " + number2);

    }




    public void second()
    {

        int answer =  Integer.parseInt(ed1.getText().toString());
        if(answer==(number1+number2)){
            vi4.setVisibility(View.VISIBLE);
            counter++;}
        else
            vi1.setVisibility(View.VISIBLE);
        Toast toast = Toast.makeText(getApplicationContext()," "+(number1+number2),Toast.LENGTH_LONG);
        toast.setGravity(100,0,0);
        toast.show();
        number1 = (int)(Math.random()*100);
        number2 = (int)(Math.random()*100);
        tv5.setText(" "+number1);
        tv6.setText(" "+number2);

    }
    public void third()
    {
        int answer =  Integer.parseInt(ed2.getText().toString());
        if(answer==(number1+number2)){
            vi5.setVisibility(View.VISIBLE);
            counter++;}
        else
            vi2.setVisibility(View.VISIBLE);
        Toast toast = Toast.makeText(getApplicationContext()," "+(number1+number2),Toast.LENGTH_LONG);
        toast.setGravity(100,0,0);
        toast.show();
        if(counter==0)
            Toast.makeText(MainActivity.this," (3/0, 0%)",Toast.LENGTH_LONG).show();
        if(counter==1)
            Toast.makeText(MainActivity.this," (3/1, 33%)",Toast.LENGTH_LONG).show();
        if(counter==2)
            Toast.makeText(MainActivity.this," (3/2, 66%)",Toast.LENGTH_LONG).show();
        if(counter==3)
            Toast.makeText(MainActivity.this," (3/3, 100%)",Toast.LENGTH_LONG).show();
    }

    public void restart(View view) {
        counter=0;
        vi.setVisibility(View.GONE);vi1.setVisibility(View.GONE);vi2.setVisibility(View.GONE);
        vi4.setVisibility(View.GONE);vi5.setVisibility(View.GONE);vi3.setVisibility(View.GONE);
        tv1.setText(" ");tv2.setText(" ");tv3.setText(" ");tv4.setText(" ");tv5.setText(" ");tv6.setText(" ");
        ed1.setText("");ed2.setText("");ed.setText("");
        number1 = (int)(Math.random()*100);
        number2 = (int)(Math.random()*100);
        tv1.setText(" "+number1);
        tv2.setText(" "+number2);
    }
}