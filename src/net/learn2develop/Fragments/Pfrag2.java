package net.learn2develop.Fragments;

import java.util.Random;

import net.learn2develop.Fragments.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Pfrag2 extends Fragment {
	int x,ll,totalcount;
	String x1="",x2="",x3="",x4="",x5="";
	char n5='!',n6='@',n7='#',n8='$',n1,n2,n3,n4 ;
	
	  @Override
	    public View onCreateView(LayoutInflater inflater, 
	    ViewGroup container, Bundle savedInstanceState) {
		  Log.d("Fragment 2@", "onCreateView");
		
		  Player2 activity = (Player2) getActivity();
	         x1 = activity.getMyData1();
	         x2 = activity.getMyData2();
	         x3 = activity.getMyData3();
	         x4 = activity.getMyData4();
	         x5 = activity.getMyData5();
	        //return view;
	        	    	//---Inflate the layout for this fragment---    	
	        return inflater.inflate(
	            R.layout.pfrag2, container, false);
	    }
	  @Override
	    public void onAttach(Activity activity) {
	        super.onAttach(activity);
	        Log.d("Fragment 2", "onAttach");
	    }
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        Log.d("Fragment 2", "onCreate");
	    }

	    @Override
	    public void onActivityCreated(Bundle savedInstanceState) {
	        super.onActivityCreated(savedInstanceState);
	        Log.d("Fragment 2", "onActivityCreated");
	    }

	    @Override
	    public void onStart() {
	        super.onStart();
	        super.onStart(); 
	        final Chronometer mChronometer = (Chronometer)  getActivity().findViewById(R.id.chronometer1);
	        //---Button view---
	       // final Chronometer mChronometer = (Chronometer) getActivity().findViewById(R.id.chronometer);
	        Player2 activity = (Player2) getActivity();
	        final String x1 = activity.getMyData1();
	        String x2 = activity.getMyData2();
	        String x3 = activity.getMyData3();
	        String x4 = activity.getMyData4();
	        n1=  x1.charAt(0); 
	        n2=  x2.charAt(0); 
	        n3=  x3.charAt(0); 
	        n4=  x4.charAt(0); 
	        String x5 = activity.getMyData5();
	         final int totalcount = Integer.parseInt(x5);
	      //  final int totalcount = getIntent().getExtras().getInt("age1");
	        Button btn1 = (Button) getActivity().findViewById(R.id.regbutton10);
	        Button btn2 = (Button) getActivity().findViewById(R.id.regbutton11);
	        Button btn3 = (Button) getActivity().findViewById(R.id.regbutton12);
	        Button btn4 = (Button) getActivity().findViewById(R.id.regbutton13);
	        final Button btn5 = (Button) getActivity().findViewById(R.id.regbutton14);
	        final Button btn6 = (Button) getActivity().findViewById(R.id.regbutton15);
	         final Button btn7 = (Button) getActivity().findViewById(R.id.regbutton16);
	         final Button btn8 = (Button) getActivity().findViewById(R.id.regbutton17);
	         Button btn9 = (Button) getActivity().findViewById(R.id.regbutton18);
	        mChronometer.start();  
	      btn1.setText(String.valueOf(n1));
	      btn2.setText(String.valueOf(n2));
	      btn3.setText(String.valueOf(n3));
	      btn4.setText(String.valueOf(n4));
	      btn1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {

				
					if(n5 == '!')// && n6=='@' && n7=='#' && n8=='$')
					
					{		
					btn5.setText(String.valueOf(n1));
					n5=n1;
					}
					else
					{
						if(n6=='@' && n5 != n1)// && n6=='@' && n7=='#' && n8=='$')
						{		
							btn6.setText(String.valueOf(n1));
							n6=n1;
						}
						else
						{
							if(n7=='#' && n6 != n1 && n5!=n1)
							{
										
									btn7.setText(String.valueOf(n1));
									n7=n1;
								
								
							}
							else
							{
								if(n7!=n1 && n6!=n1 && n5!=n1)
								{
									btn8.setText(String.valueOf(n1));
									n8=n1;
								}
								
							}
						}
					}
			
				}
			});
	    btn2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					if(n5=='!')// && n6=='@' && n7=='#' && n8=='$')
						
					{		
					btn5.setText(String.valueOf(n2));
					n5=n2;
					}
					else
					{
						if(n6=='@' && n5!=n2)// && n6=='@' && n7=='#' && n8=='$')
						{		
							btn6.setText(String.valueOf(n2));
							n6=n2;
						}
						else
						{
							if(n7=='#' && n6!=n2 && n5!=n2)
							{
										
									btn7.setText(String.valueOf(n2));
									n7=n2;
								
								
							}
							else
							{
								if(n7!=n2 && n6!=n2 && n5!=n2)
								{
									btn8.setText(String.valueOf(n2));
									n8=n2;
								}
								
							}
						} 
					}	}
			});
	    btn3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					if(n5=='!')// && n6=='@' && n7=='#' && n8=='$')
						
					{		
					btn5.setText(String.valueOf(n3));
					n5=n3;
					}
					else
					{
						if(n6=='@' && n5!=n3)// && n6=='@' && n7=='#' && n8=='$')
						{		
							btn6.setText(String.valueOf(n3));
							n6=n3;
						}
						else
						{
							if(n7=='#' && n6!=n3 && n5!=n3)
							{
										
									btn7.setText(String.valueOf(n3));
									n7=n3;
								
								
							}
							else
							{
								if(n7!=n3 && n6!=n3 && n5!=n3)
								{
									btn8.setText(String.valueOf(n3));
									n8=n3;
								}
								
							}
						}
					}
				}
			});
	    btn4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
	if(n5=='!')// && n6=='@' && n7=='#' && n8=='$')
						
					{		
					btn5.setText(String.valueOf(n4));
					n5=n4;
					}
					else
					{
						if(n6=='@' && n5!=n4)// && n6=='@' && n7=='#' && n8=='$')
						{		
							btn6.setText(String.valueOf(n4));
							n6=n4;
						}
						else
						{
							if(n7=='#' && n6!=n4 && n5!=n4)
							{
										
									btn7.setText(String.valueOf(n4));
									n7=n4;
								
								
							}
							else
							{
								if(n7!=n4 && n6!=n4 && n5!=n4)
								{
									btn8.setText(String.valueOf(n4));
									n8=n4;
								}
								
							}
						}
					}
				}

			});
	    btn5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(btn8.getText()=="" && btn7.getText()=="" && btn6.getText()=="")
				{
					btn5.setText("");
					n5='!';
				}
					}
		});
	    btn6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) 
			{
				if(btn8.getText()=="" && btn7.getText()=="")
			{
				btn6.setText("");
				n6='@';
			}
					}
		});
	    btn7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(btn8.getText()=="")
				{
					btn7.setText("");
					n7='#';
				}
					}
		});
	    btn8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				btn8.setText("");
				n8='$';
					}
		});
	    btn9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(n8>n7 && n7>n6 && n6>n5)
				{
					mChronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
						public void onChronometerTick(Chronometer chronometer) {
							 chronometer.stop();
							// long ll =Long.parseLong(Chronometer.xx);
							 int ll=Integer.parseInt(Chronometer.xx);
							 if(totalcount == ll)
							 {
								 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
							        alertDialogBuilder.setTitle("Welcome to Alphabet War");

							        alertDialogBuilder.setMessage("Match is drawn");
							        alertDialogBuilder.setPositiveButton("OK", 
							           new DialogInterface.OnClickListener() {
							           @Override
							           public void onClick(DialogInterface arg0, int arg1)
							           {
							        	   Intent in=new Intent(getActivity(),Hello.class);
											startActivity(in);
											getActivity().finish();   
							           }
							        });
							        AlertDialog alertDialog = alertDialogBuilder.create();
							        alertDialog.show();
							
							 }
								if(totalcount < ll)
								{
									 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
								        alertDialogBuilder.setTitle("Welcome to Alphabet War");

								        alertDialogBuilder.setMessage("Player 1  is the winner");
								        alertDialogBuilder.setPositiveButton("OK", 
								           new DialogInterface.OnClickListener() {
								           @Override
								           public void onClick(DialogInterface arg0, int arg1)
								           {
								        	   Intent in=new Intent(getActivity(),Hello.class);
												startActivity(in);
												getActivity().finish(); 
								           }
								        });
								        AlertDialog alertDialog = alertDialogBuilder.create();
								        alertDialog.show();
									}
								if(totalcount >  ll)
								{
									 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
								        alertDialogBuilder.setTitle("Welcome to Alphabet War");

								        alertDialogBuilder.setMessage("Player 2  is the winner");
								        alertDialogBuilder.setPositiveButton("OK", 
								           new DialogInterface.OnClickListener() {
								           @Override
								           public void onClick(DialogInterface arg0, int arg1)
								           {
								        	   Intent in=new Intent(getActivity(),Hello.class);
													startActivity(in);
													getActivity().finish();
								           }
								        });
								        AlertDialog alertDialog = alertDialogBuilder.create();
								        alertDialog.show();
							}
						}
					});
				
			
					}
					}
		});
	    }
	    
	    
	    @Override
	    public void onResume() {
	        super.onResume();
	        Log.d("Fragment 2", "onResume");
	    }

	    @Override
	    public void onPause() {
	        super.onPause();
	        Log.d("Fragment 2", "onPause");
	    }
	    
	    @Override
	    public void onStop() {
	        super.onStop();
	        Log.d("Fragment 2", "onStop");
	    }
	    
	    @Override
	    public void onDestroyView() {
	        super.onDestroyView();
	        Log.d("Fragment 2", "onDestroyView");
	    }

	    @Override
	    public void onDestroy() {
	        super.onDestroy();
	        Log.d("Fragment 2", "onDestroy");
	    }
	    
	    @Override
	    public void onDetach() {
	        super.onDetach();
	        Log.d("Fragment 2", "onDetach");
	    }
	
}