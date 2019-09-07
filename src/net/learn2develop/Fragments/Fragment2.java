
package net.learn2develop.Fragments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment2 extends Fragment {
	Button btn1,btn2,btn3,btn4, btn5, btn6,btn7,btn8;
	String a="",b="",c="",d="";
	char n5='!',n6='@',n7='#',n8='$',n1,n2,n3,n4 ;
	int x;
	int a1,a2,a3,a4;
	@Override
    public View onCreateView(LayoutInflater inflater, 
    ViewGroup container, Bundle savedInstanceState) {
        //---Inflate the layout for this fragment---
        return inflater.inflate(
            R.layout.fragment2, container, false);
    }
    
    @Override
    public void onStart() {
        super.onStart(); 
        final Chronometer mChronometer = (Chronometer)  getActivity().findViewById(R.id.chronometer);
        //---Button view---
       // final Chronometer mChronometer = (Chronometer) getActivity().findViewById(R.id.chronometer);
        Button btn1 = (Button) getActivity().findViewById(R.id.regbutton1);
        Button btn2 = (Button) getActivity().findViewById(R.id.regbutton2);
        Button btn3 = (Button) getActivity().findViewById(R.id.regbutton3);
        Button btn4 = (Button) getActivity().findViewById(R.id.regbutton4);
        final Button btn5 = (Button) getActivity().findViewById(R.id.regbutton5);
        final Button btn6 = (Button) getActivity().findViewById(R.id.regbutton6);
         final Button btn7 = (Button) getActivity().findViewById(R.id.regbutton7);
         final Button btn8 = (Button) getActivity().findViewById(R.id.regbutton8);
         Button btn9 = (Button) getActivity().findViewById(R.id.regbutton9);
        mChronometer.start(); 
       /* char[] charArray1 ={ 'a', 'b', 'c', 'd', 'f','g','e' };
        char[] charArray2 ={ 'h', 'k', 'p', 'q', 'v','w' };
        char[] charArray3 ={ 'i', 'l', 'o', 'r', 'u','x' };
        char[] charArray4 ={ 'j', 'm', 'n', 's', 't','y' };*/
        char[] alpha ={'a', 'b', 'c', 'd', 'f','g','e','h', 'k', 'p', 'q', 'v','w','i', 'l', 'o', 'r', 'u','x','j', 'm', 'n', 's', 't','y'};
        final char n1 ;
        final char n2;
        final char n3;
        final char n4;
        Random randomGenerator = new Random();
        int randomInt = (int) (randomGenerator.nextInt((7)));
     /*   n1= charArray1[randomInt];
        n2= charArray2[randomInt];
        n3= charArray3[randomInt];
        n4= charArray4[randomInt];*/
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<26; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<=3; i++) {
            System.out.println(list.get(i));
            a1=list.get(0);
            a2=list.get(1);
            a3=list.get(2);
            a4=list.get(3);
        }
        n1= alpha[a1];
        n2= alpha[a2];
        n3= alpha[a3];
        n4= alpha[a4];
      btn1.setText(String.valueOf(n1));
      btn2.setText(String.valueOf(n2));
      btn3.setText(String.valueOf(n3));
      btn4.setText(String.valueOf(n4));
      long x =Long.parseLong(Chronometer.xx);
      btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

			
				if(n5=='!')// && n6=='@' && n7=='#' && n8=='$')
				
				{		
				btn5.setText(String.valueOf(n1));
				n5=n1;
				}
				else
				{
					if(n6=='@' && n5!=n1)// && n6=='@' && n7=='#' && n8=='$')
					{		
						btn6.setText(String.valueOf(n1));
						n6=n1;
					}
					else
					{
						if(n7=='#' && n6!=n1 && n5!=n1)
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
						// Int x =Int.parseInt();
						 int x=Integer.parseInt(Chronometer.xx);
						
						 Intent in=new Intent(getActivity(),Dummy.class);
			          		in.putExtra("count1", String.valueOf(n1));
			          		in.putExtra("count2", String.valueOf(n2));
			          		in.putExtra("count3", String.valueOf(n3));
			          		in.putExtra("count4", String.valueOf(n4));
			          		in.putExtra("total", String.valueOf(x));
			          	//	startActivityForResult(in, 1);
							startActivity(in);
							getActivity().finish();					

			               /* Toast.makeText(getActivity(), "" + x, 
			                    Toast.LENGTH_SHORT).show();*/
			      			
			      			/*int countfinal = getIntent().getExtras().getInt("count");
			      	        int totalcount = getIntent().getExtras().getInt("total");*/
						/* 
						 * btn1.setText(String.valueOf(n1));
      btn2.setText(String.valueOf(n2));
      btn3.setText(String.valueOf(n3));
      btn4.setText(String.valueOf(n4));Intent in=new Intent(this,Dummy.class);
			          		in.putExtra("count", count);
			          		in.putExtra("total", l);
			          		startActivityForResult(in, 1);*/
			      			
					}
				});
			}
				}
	});
    }
}


