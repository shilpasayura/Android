package com.shilpasayura.buttonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView textView1;
    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     }

    public void addNumbers(View view) {
        TextView text1 = (TextView) findViewById(R.id.textView1);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String value1=editText1.getText().toString();
        String value2=editText2.getText().toString();
        //TextView text1 = (TextView) findViewById(R.id.textView1);
        int a=Integer.parseInt(value1);
        int b=Integer.parseInt(value2);
        int sum=a+b;
        String s=Integer.toString(sum);
        text1.setText(s);
    }


}

