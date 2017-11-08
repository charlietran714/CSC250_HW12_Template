package com.example.charlie.csc250_hw12_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void changeMeButton(View changeMeButton)
    {
        EditText editText1 = (EditText)this.findViewById(R.id.editText1);
        String s = editText1.getText().toString();
        EditText editText2 = (EditText)this.findViewById(R.id.editText2);
        String s2 = editText2.getText().toString();
        TextView myLabel = (TextView)this.findViewById(R.id.myLabel);
        myLabel.setText(reverseString(s) + reverseString(s2));
    }
    public String reverseString(String s)
    {
        String answer = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            answer = answer + s.charAt(i);
        }
        return answer;
    }
}
