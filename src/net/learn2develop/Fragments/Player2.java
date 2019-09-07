package net.learn2develop.Fragments;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Player2 extends Activity{
	 int totalcount;
	
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.player2); 
     /*String x1 = getIntent().getStringExtra("count1");
    final String x2 = getIntent().getStringExtra("count2");
     final String x3 = getIntent().getStringExtra("count3");
    final String x4 = getIntent().getStringExtra("count4");
    final String x5 = getIntent().getStringExtra("total");*/
    
    /*Toast.makeText(this, "" + x1, 
            Toast.LENGTH_SHORT).show();*/
    // final int totalcount = getIntent().getExtras().getInt("total");
    Chronometer mChronometer = (Chronometer)findViewById(R.id.chronometer1);
    mChronometer.start();
    mChronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
		public void onChronometerTick(Chronometer chronometer) {
			//if (chronometer.getText().toString().equalsIgnoreCase("00:05:0"))
			{ //When reaches 5 seconds.
			    //Define here what happens when the Chronometer reaches the time above.
			    //chronometer.stop();
			   
			}
		}
	});
   /* Bundle bundle = new Bundle();
    bundle.putString("edttext1", "gd");
    bundle.putString("edttext2", x2);
    bundle.putString("edttext3", x3);
    bundle.putString("edttext4", x4);
    bundle.putString("edttext5",Integer.toString(totalcount));
    // set Fragmentclass Arguments
    Pfrag2 fragobj = new Pfrag2();
    fragobj.setArguments(bundle);*/
}
public String getMyData1() {
	
	String x1 = getIntent().getStringExtra("count1");
    return x1;
}
public String getMyData2() {
	final String x2 = getIntent().getStringExtra("count2");
    return x2;
}
public String getMyData3() {
	final String x3 = getIntent().getStringExtra("count3");
	   
    return x3;
}
public String getMyData4() {
	final String x4 = getIntent().getStringExtra("count4");
    return x4;
}
public String getMyData5() {
	final String x5 = getIntent().getStringExtra("total");
    return x5;
}
}