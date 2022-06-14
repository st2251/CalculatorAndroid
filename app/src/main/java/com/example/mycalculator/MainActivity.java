package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void plus(View view)
    {
        EditText t1 = findViewById(R.id.a);
        EditText t2 = findViewById(R.id.b);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        TextView tt = findViewById(R.id.ans);
        int ans = a+b;
        String set1=String.valueOf(ans);
        tt.setText(set1);
    }

    public void minus(View view)
    {
        EditText t1 = findViewById(R.id.a);
        EditText t2 = findViewById(R.id.b);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        TextView tt = findViewById(R.id.ans);
        int ans = a-b;
        String set1=String.valueOf(ans);
        tt.setText(set1);
    }

    public void multiply(View view)
    {
        EditText t1 = findViewById(R.id.a);
        EditText t2 = findViewById(R.id.b);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        TextView tt = findViewById(R.id.ans);
        int ans = a*b;
        String set1=String.valueOf(ans);
        tt.setText(set1);
    }

    public void divide(View view)
    {
        EditText t1 = findViewById(R.id.a);
        EditText t2 = findViewById(R.id.b);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        TextView tt = findViewById(R.id.ans);
        int ans = a/b;
        String set1=String.valueOf(ans);
        tt.setText(set1);
    }

    public void modulus(View view)
    {
        EditText t1 = findViewById(R.id.a);
        EditText t2 = findViewById(R.id.b);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        TextView tt = findViewById(R.id.ans);
        int ans = a%b;
        String set1=String.valueOf(ans);
        tt.setText(set1);
    }
}