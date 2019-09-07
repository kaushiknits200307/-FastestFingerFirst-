package net.learn2develop.Fragments;


import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello extends Activity{
	int j=10;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.hello);
	        Button btn = (Button) findViewById(R.id.btnSubmit);
	      //  String ll= getIntent().getStringExtra("str1");
	      //  
	    //    btn.setText("hello");
	     //   init();
	        btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent in=new Intent(getApplicationContext(),FragmentsActivity.class);
					startActivity(in);
					finish();
				}
			});
	       
	 }
	
}
