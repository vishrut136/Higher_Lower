package com.example.vatsc.higher_lower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity3 extends AppCompatActivity {
        EditText p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        p = (EditText)findViewById(R.id.editText);
    }
    public void changeMadi(View view)
    {  String k=p.getText().toString();
        double c=Double.parseDouble(k);
        int x=0,count=0;
        if((Math.sqrt(c)%1)==0)
        {
            Toast.makeText(getApplicationContext(),"Number is square number",Toast.LENGTH_LONG).show();
        }
        while(c>=x)
        {   x+=count+1;
            count++;
            if(x==c)
            {
                Toast.makeText(getApplicationContext(),"Number is Triangular number",Toast.LENGTH_LONG).show();
            }


        }

    }

}