package com.example;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

public class MainActivity extends Activity 
{	
	Button b1,b2,b3;
    
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button1);
        b3=(Button)findViewById(R.id.button3);
        
       
    }
    
}
