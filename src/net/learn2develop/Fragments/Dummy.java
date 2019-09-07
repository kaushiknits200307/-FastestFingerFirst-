package net.learn2develop.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dummy extends Activity{
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.dummy);
	        Button btn = (Button) findViewById(R.id.btnSubmit11);
	        final String x1 = getIntent().getStringExtra("count1");
	        final String x2 = getIntent().getStringExtra("count2");
	        final String x3 = getIntent().getStringExtra("count3");
	        final String x4 = getIntent().getStringExtra("count4");
  	        final String totalcount = getIntent().getStringExtra("total");
  	  	
  	        
  	        
	        btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent in=new Intent(getApplicationContext(),Player2.class);
					in.putExtra("count1", x1);
	          		in.putExtra("count2", x2);
	          		in.putExtra("count3", x3);
	          		in.putExtra("count4", x4);
	          		in.putExtra("total", totalcount);
	          		startActivityForResult(in, 1);
	      			finish();
					}
				}
				);
	 }
}